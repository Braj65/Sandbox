package designCache.cacehtoDisk;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LFULinkList<Key, Value> {
    
    private static final Logger logger=LoggerFactory.getLogger(LFULinkList.class);
    private LinkedList<LinkedList<CacheNode<Key, Value>>> frequencyList;
    private HashMap<Key, CacheNode<Key, Value>> cache;
    private final HashMap<Key, Memory> statusCache;
    private int maxFrequency;
    private int lowestFrequency;
    private final int maxCacheSize;
    private final float evictionFactor;
    private final Queue<RemovalNotification<Key, Value>> removalNotiQueue;
    private final PersistingCache<Key, Value> persCache;
    
    
    public LFULinkList(int maxC, float ef){
	if(ef<=0 || ef>=1)
	    throw new IllegalArgumentException("");
	cache=new HashMap<Key, CacheNode<Key, Value>>(maxC);
	statusCache=new HashMap<Key, Memory>();
	frequencyList=new LinkedList();
	this.lowestFrequency=0;
	this.maxCacheSize=maxC;
	this.maxFrequency=maxC;
	this.evictionFactor=ef;
	removalNotiQueue=new ConcurrentLinkedQueue<RemovalNotification<Key, Value>>();
	persCache=new PersistingCache(cache);
	initFrequencyList();
    }
    
    public void initFrequencyList(){
	for(int i=0;i<=maxCacheSize;i++){
	    frequencyList.add(i, new LinkedList<CacheNode<Key, Value>>());
	}
    }
    
    public void set(Key k, Value v){
	Memory locStatus=statusCache.get(k);
	CacheNode<Key, Value> node = null;
	if(locStatus==null){
	    if(maxCacheSize==cache.size())
		doEviction();
	    LinkedList<CacheNode<Key, Value>> nodes=frequencyList.get(0);
	    node=new CacheNode(k, v, 0);
	    nodes.add(node);
	    cache.put(k, node);
	    lowestFrequency=0;
	}else if(locStatus.equals(Memory.INMEM)){
	    node=cache.get(k);
	    node.v=v;
	}else{
	    if(maxCacheSize==cache.size())
		doEviction();
	    node=persCache.load(k);
	    LinkedList<CacheNode<Key, Value>> nodes=frequencyList.get(node.frequency);
	    nodes.add(node);
	    lowestFrequency=0;	    
	}
	statusCache.put(k, Memory.INMEM);
	/*CacheNode<Key, Value> node=cache.get(k);
	if(node==null){
	    if(maxCacheSize==cache.size())
		doEviction();
	    LinkedList<CacheNode<Key, Value>> nodes=frequencyList.get(lowestFrequency);
	    node=new CacheNode(k, v, 0);
	    nodes.add(node);
	    cache.put(k, node);
	    lowestFrequency=0;
	}else{
	    node.v=v;   
	}*/
	postWriteCleanup();
    }
    
    private void doEviction(){
	int currentlyDelayed=0;
	float target=evictionFactor*maxCacheSize;
	while(currentlyDelayed<target){
	    LinkedList<CacheNode<Key, Value>> nodes=frequencyList.get(lowestFrequency);
	    if(nodes.isEmpty())
		throw new IllegalArgumentException("Lowest Frequency constraint violated");
	    else{
		Iterator<CacheNode<Key, Value>> it=nodes.iterator();
		while(it.hasNext() && currentlyDelayed++<target){
		    CacheNode<Key, Value> node=it.next();
		    removeEntry(node, RemovalCause.SIZE);
		    statusCache.put(node.k, Memory.ONDISK);
		    it.remove();
		    cache.remove(node.k);
		}
		if(!it.hasNext())
		    findNextLowestFrequency();
	    }
	}
    }
    
    private void findNextLowestFrequency(){
	while(lowestFrequency <= maxFrequency && frequencyList.get(lowestFrequency).isEmpty()){
	    lowestFrequency++;
	}
	if(lowestFrequency>maxFrequency)
	    lowestFrequency=0;
    }
    
    public Value get(Key k){
	Memory locStatus=statusCache.get(k);
	CacheNode<Key, Value> node=null;
	if(locStatus==null){
	    return null;
	}else if(locStatus.equals(Memory.INMEM)){
	    node=cache.get(k);
	    int currFreq=node.frequency;
	    int nextFreq=currFreq+1;
	    if(nextFreq<maxCacheSize){
		LinkedList<CacheNode<Key, Value>> prevFreqNodes=frequencyList.get(currFreq);
		LinkedList<CacheNode<Key, Value>> nextFreqNodes=frequencyList.get(currFreq+1);
		moveToNextFreq(node, prevFreqNodes, nextFreq, nextFreqNodes);
		if(prevFreqNodes.isEmpty() && lowestFrequency==currFreq)
		    lowestFrequency=nextFreq;
	    }else{
		LinkedList<CacheNode<Key, Value>> nodes=frequencyList.get(currFreq);
		nodes.remove(node);
		nodes.add(0, node);
	    }
	    return node.v;
	}else{
	    if(maxCacheSize==cache.size())
		doEviction();
	    node=persCache.load(k);
	    LinkedList<CacheNode<Key, Value>> nodes=frequencyList.get(lowestFrequency);
	    cache.put(k, node);
	    nodes.add(node);
	    statusCache.put(k, Memory.INMEM);
	    return node.v;
	}
	/*CacheNode<Key, Value> node=cache.get(k);
	if(node!=null){
	    int currFreq=node.frequency;
	    int nextFreq=currFreq+1;
	    if(nextFreq<maxCacheSize){
		LinkedList<CacheNode<Key, Value>> prevFreqNodes=frequencyList.get(currFreq);
		LinkedList<CacheNode<Key, Value>> nextFreqNodes=frequencyList.get(currFreq+1);
		moveToNextFreq(node, prevFreqNodes, nextFreq, nextFreqNodes);
		if(prevFreqNodes.isEmpty() && lowestFrequency==currFreq)
		    lowestFrequency=nextFreq;
	    }else{
		LinkedList<CacheNode<Key, Value>> nodes=frequencyList.get(currFreq);
		nodes.remove(node);
		nodes.add(0, node);
	    }
	    return node.v;
	    
	}else{
	    return null;
	}*/
    }
    
    private void moveToNextFreq(CacheNode<Key, Value> node, LinkedList<CacheNode<Key, Value>> prev, int nextFreq,
	    LinkedList<CacheNode<Key, Value>> next){
	prev.remove(node);
	next.add(node);
	node.frequency=nextFreq;
    }
    
    public Value remove(Key k){
	CacheNode<Key, Value> node=cache.remove(k);
	if(node!=null){
	    LinkedList<CacheNode<Key, Value>> nodes=frequencyList.get(node.frequency);
	    nodes.remove(node);
	    if(lowestFrequency==node.frequency)
		findNextLowestFrequency();
	    return node.v;
	}else
	    return null;
    }
    
    public int frequencyOf(Key k){
	CacheNode<Key,Value> node=cache.get(k);
	if(node!=null)
	    return node.frequency;
	else
	    return 0;
    }
    
    public void clear(){
	frequencyList.clear();
	cache.clear();
	lowestFrequency=0;
    }    

    public void removeEntry(CacheNode<Key, Value> entry, RemovalCause cause){
	RemovalNotification<Key, Value> notification=RemovalNotification.create(entry.k, entry.v, entry.frequency, cause);
	removalNotiQueue.offer(notification);
    }
    
    public void postWriteCleanup(){
	RemovalNotification<Key, Value> noti=null;
	while((noti=removalNotiQueue.poll())!=null){
	    try{
		persCache.onRemoval(noti);
	    }catch(Throwable e){
		logger.warn(String.format("Exception thrown by removal listener", e));
	    }
	}
    }
    
    public void persistAll(){
//	persCache.deleteAllPersisted();
	try{
	    persCache.persistAll(frequencyList);
	}catch(IOException e){
	    e.printStackTrace();
	}
    }
    static class CacheNode<Key, Value>{
	public Key k;
	public Value v;
	public int frequency;
	
	public CacheNode(Key k, Value v, int f){
	    this.k=k;
	    this.v=v;
	    this.frequency=f;
	}
    }
}
