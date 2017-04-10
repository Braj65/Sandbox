package designCache.lrupluslfu;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Segment<Key, Value> {
    
    ArrayDeque<CacheNode<Key, Value>> lfuArr=null;
//    List<CacheNode<Key, Value>> lfuList=new LinkedList<CacheNode<Key, Value>>();
    LinkedHashSet[] frequencyList;
    Map<Key, CacheNode<Key, Value>> cache;
    private final int maxCacheSize;
    private int lowestFrequency;
    private int highestFrequency;
    private final int maxFrequency;
    private final float evictionFactor;
    private int head=0;
    private int tail=0;
    private Entry<Key, Value>[] ent; 
    
    
    public Segment(int maxCache, float factor){
	lfuArr=new ArrayDeque<CacheNode<Key, Value>>(maxCache);
	cache=new ConcurrentHashMap<Key, CacheNode<Key, Value>>(maxCache);
	frequencyList=new LinkedHashSet[maxCache];
	maxCacheSize=maxCache;
	lowestFrequency=0;
	highestFrequency=0;
	maxFrequency=maxCache;
	evictionFactor=factor;
	initFrequencyList();
//	Double y=Math.ceil(Math.log(maxCacheSize)/Math.log(2));
	int y=Integer.highestOneBit(maxCacheSize)<<1;
	ent=new Entry[y];
    }
    
    public void initFrequencyList(){
	for(int i=0;i<maxCacheSize;i++){
	    frequencyList[i]=new LinkedHashSet<CacheNode<Key, Value>>();
	}
    }
    
    public void put(Key k, Value v){
	CacheNode<Key, Value> node=cache.get(k);
	if(node!=null){
	    lfuArr.remove(node);
	    lfuArr.push(node);
	    node.v=v;	    
	}else{
	    if(cache.size()==maxCacheSize)
		doEviction();
	    LinkedHashSet<CacheNode<Key, Value>> nodes= frequencyList[0];
	    node=new CacheNode(k, v, 0);
	    nodes.add(node);
	    cache.put(k, node);
	    lfuArr.push(node);
	    lowestFrequency=0;
	    int hash=rehash(k.hashCode());
	    int index=hash%ent.length;
	    Entry<Key, Value> cacheTrack=new Entry<Key, Value>(k, v);
	    if(ent[index]==null){		
		cacheTrack.hash=hash;
		ent[index]=cacheTrack;
	    }else{
		Entry<Key, Value> entry=ent[index];
		cacheTrack.hash=hash;
		for(Entry<Key, Value> e=entry;e!=null;e=e.next){
		    Object kk;
		    if(e.hash==hash &&((kk=e.k)==k || k.equals(kk))){
			Value oldVal=e.v;
			e.v=v;
		    }
		    if(e.next==null){
			e.next=cacheTrack;
			break;
		    }
		}
	    }
	    
	    
	}
    }
    
    public int rehash(int h){
	h+=(h<<15)^0xffffcd7d;
	h^=(h>>>10);
	h+=(h<<3);
	h^=(h>>>6);
	h+=(h<<2)+(h<<14);
	h=h&0xfffffff;
	return h^(h>>>16);
    }
    
    public CacheNode get(Key k){
	CacheNode<Key, Value> node=cache.get(k);
	if(node!=null){
	    if(!lfuArr.getFirst().equals(node)){
		lfuArr.remove(node);
		lfuArr.push(node);
	    }
	    LinkedHashSet<CacheNode<Key, Value>> nodes=frequencyList[node.frequency];
	    int currFreq=node.frequency;
	    int nextFreq=currFreq+1;
	    moveToNextFrequency(node, currFreq, nextFreq, nodes);
	    return node;
	}else{
	    return null;
	}
    }
    
    public void moveToNextFrequency(CacheNode<Key, Value> node, int curFreq, int nxtFreq, LinkedHashSet nodes){
	nodes.remove(node);
	LinkedHashSet<CacheNode<Key, Value>> nxtNodes=frequencyList[nxtFreq];
	highestFrequency=nxtFreq;
	nxtNodes.add(node);
	node.frequency=nxtFreq;
    }
    
    public void doEviction(){
	int currentDelay=0;
	float target=evictionFactor*maxFrequency;
	while(currentDelay<target){
	    LinkedHashSet<CacheNode<Key, Value>> nodes=frequencyList[lowestFrequency];
	    if(nodes.isEmpty())
		throw new IllegalArgumentException("Lowest frequency calcualtion has been incorrect");
	    else{
		Iterator<CacheNode<Key, Value>> it=nodes.iterator();
		while(it.hasNext() && currentDelay++<target){
		    CacheNode<Key, Value> node=it.next();
		    cache.remove(node.k);
		    nodes.remove(node);
		    it.remove();
		}
		if(!it.hasNext()){
//		    findNextLowestFrequency();
		}
	    }
	    
	}
    }
    
    public void findTop(int range){
	ArrayDeque<CacheNode<Key, Value>> collisionCache=new ArrayDeque<CacheNode<Key, Value>>();
	Entry<Key, Value>[] collEntry=new Entry[range];
	for(int i=frequencyList.length-1;i>=0;i--){
	    LinkedHashSet<CacheNode<Key, Value>> list=frequencyList[i];
	    for(CacheNode<Key, Value> c:list){
		int hash=rehash(c.k.hashCode());
		int index=hash%ent.length;
		int collIndex=hash%collEntry.length;
		Entry<Key, Value> entry=ent[index];
		enque(entry, hash, collIndex, collEntry, c);
	    }
	}
	
	for(CacheNode<Key, Value> node:lfuArr){
	    int hash=rehash(node.k.hashCode());
	    int index=hash%ent.length;
	    int collIndex=hash%collEntry.length;
	    Entry<Key, Value> entry=collEntry[collIndex];
	    while(entry.next!=null){
		if(entry.hash==hash && (entry.k==node.k || entry.k.equals(node.k))){
		    if(entry.covered.equals(true))
			System.out.println(entry.k);
		    break;
		}
		entry=entry.next;
	    }
	    if(entry.next==null){
		if(entry.hash==hash && (entry.k==node.k || entry.k.equals(node.k))){
		    if(entry.covered.equals(true))
			System.out.println(entry.k);
		}
	    }
	}
    }
    
    public void enque(Entry<Key, Value> oldEntry, int hash, int collIndex, Entry<Key, Value>[] collEntry, CacheNode node){
	while(oldEntry.next!=null){
	    if(oldEntry.hash==hash && (oldEntry.k==node.k || oldEntry.k.equals(node.k))){
		oldEntry.covered=true;
		break;
	    }
	    oldEntry=oldEntry.next;
	}
	if(oldEntry.next==null){
	    oldEntry.covered=true;	    
	}
	Entry entry=collEntry[collIndex];
	if(entry==null){
	    entry=new Entry(oldEntry.k, oldEntry.v, oldEntry.hash, null, oldEntry.covered);
	    collEntry[collIndex]=entry;
	}else{
	    while(entry.next!=null){
		entry=entry.next;
	    }
	    entry.next=new Entry(oldEntry.k, oldEntry.v, oldEntry.hash, null, oldEntry.covered);
	}
	
    }
    
    class CacheNode<Key, Value>{
	Key k;
	Value v;
	int frequency=0;
	int hash;
	
	public 	CacheNode(Key k, Value v, int freq){
	    this.k=k;
	    this.v=v;
	    this.frequency=freq;
	}
    }
    
    class Entry<Key, Value>{
	Key k;
	Value v;
	int hash;
	Entry<Key, Value> next;
	Boolean covered=false;
	
	public Entry(Key k, Value v){
	    this.k=k;
	    this.v=v;
	}
	
	public Entry(Key k, Value v, int hash, Entry next, Boolean covered){
	    this.k=k;
	    this.v=v;
	    this.hash=hash;
	    this.next=next;
	    this.covered=covered;
	}
	
    }

}
