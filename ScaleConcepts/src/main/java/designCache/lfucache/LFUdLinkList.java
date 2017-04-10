package designCache.lfucache;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class LFUdLinkList<Key, Value> {
    
    private final Map<Key, CacheNode<Key, Value>> cache;
    private final LinkedList<LinkedList<CacheNode<Key, Value>>> frequencyList;
    private int lowestFrequency;
    private int maxFrequency;
    private final int maxCacheSize;
    private final float evictionFactor;
    
    public LFUdLinkList(int maxCacheSize, float evictionFactor){
	if(evictionFactor<=0 || evictionFactor>=1)
	    throw new IllegalArgumentException("The eviction factor cam't be less than 0 or greater than 1");
	cache=new HashMap<Key, CacheNode<Key, Value>>(maxCacheSize);
	frequencyList=new LinkedList();
	this.lowestFrequency=0;
	this.maxFrequency=maxCacheSize-1;
	this.maxCacheSize=maxCacheSize;
	this.evictionFactor=evictionFactor;
	initFrequencyList();	
    }
    
    private void initFrequencyList(){
	for(int i=0;i<=maxFrequency;i++){
	    frequencyList.add(i, new LinkedList<CacheNode<Key, Value>>());
	}
    }
    
    public void put(Key k, Value v){
	CacheNode<Key, Value> currentNode=cache.get(k);
	if(currentNode==null){
	    if(cache.size()==maxCacheSize)
		doEviction();
	    
	    LinkedList<CacheNode<Key, Value>> newNode=frequencyList.get(0);
	    currentNode=new CacheNode(k, v, 0);
	    currentNode.parent=frequencyList.get(0);
	    newNode.add(currentNode);
	    cache.put(k, currentNode);
	    lowestFrequency=0;	    
	}else{
	    currentNode.v=v;
	}
    }
    
    public Value get(Key k){
	CacheNode<Key, Value> currNode=cache.get(k);
	if(currNode!=null){
	    int currFreq=currNode.frequency;
	    if(currFreq<maxFrequency){
		int nextFreq=currFreq+1;
		LinkedList<CacheNode<Key, Value>> currNodes=frequencyList.get(currFreq);
		LinkedList<CacheNode<Key, Value>> nextNodes=frequencyList.get(nextFreq);
		moveToNextFreq(currNode, currNodes, nextNodes);
		cache.put(k, currNode);
		if(currNodes.isEmpty() && lowestFrequency==currFreq)
		    lowestFrequency=nextFreq;
	    }else{
		LinkedList<CacheNode<Key, Value>> nodes=frequencyList.get(currFreq);
		nodes.remove(currNode);
		nodes.add(currNode);
	    }
	    return currNode.v;
	}else{
	    return null;
	}
    }
    
    private void moveToNextFreq(CacheNode<Key, Value> curr, LinkedList<CacheNode<Key, Value>> currNodes,
	    LinkedList<CacheNode<Key, Value>> nextNodes){
	currNodes.remove(curr);
	nextNodes.add(curr);
	curr.parent=nextNodes;
	curr.frequency=curr.frequency+1;
    }
    
    private void doEviction(){
	int currentlyDelayed=0;
	float target=evictionFactor*maxCacheSize;
	while(currentlyDelayed<target){
	    LinkedList<CacheNode<Key, Value>> nodes=frequencyList.get(lowestFrequency);
	    if(nodes.isEmpty())
		throw new IllegalArgumentException("Lowest frequency constraint violated");
	    else{
		Iterator<CacheNode<Key, Value>> it=nodes.iterator();
		while(it.hasNext() && currentlyDelayed++<target){
		    CacheNode<Key, Value> node=it.next();
		    it.remove();
		    cache.remove(node.k);
		}
		if(!it.hasNext())
		    findNextLowestFrequency();
	    }
	}
    }
    
    private void findNextLowestFrequency(){
	while(lowestFrequency <= maxFrequency && frequencyList.get(lowestFrequency).isEmpty())
	    lowestFrequency++;
	if(lowestFrequency>maxFrequency)
	    lowestFrequency=0;
    }
    
    public Value remove(Key k){
	CacheNode<Key, Value> currNode=cache.remove(k);
	if(currNode!=null){
	    LinkedList<CacheNode<Key, Value>> nodes=frequencyList.get(currNode.frequency);
	    nodes.remove(currNode);
	    if(lowestFrequency==currNode.frequency)
		findNextLowestFrequency();
	    
	    return currNode.v;
	}else
	    return null;
    }
    
    public int frequencyOf(Key k){
	CacheNode<Key, Value> node=cache.get(k);
	if(node!=null)
	    return node.frequency+1;
	else
	    return 0;
    }
    
    public void clear(){
	frequencyList.clear();
	cache.clear();
	lowestFrequency=0;
    }
    
    public int size(){
	return cache.size();
    }

    
    class CacheNode<Key, Value>{
	public final Key k;
	public Value v;
	public int frequency;
	public LinkedList<CacheNode<Key, Value>> parent; 
	
	public CacheNode(Key ke, Value val, int freq){
	    this.k=ke;
	    this.v=val;
	    this.frequency=freq;
	}
    }
}
