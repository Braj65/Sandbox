package designCache.lfucache;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

public class LFU<Key, Value> {
    private final Map<Key, CacheNode<Key, Value>> cache;
    private final LinkedHashSet[] frequencyList;
    private int lowestFrequency;
    private int maxFrequency;
    private final int maxCacheSize;
    private final float evictionFactor;
    
    public LFU(int maxCacheSize, float evictionFactor){
	if(evictionFactor<=0 || evictionFactor>=1)
	    throw new IllegalArgumentException("The evicitio n factor needs to be greater than 1 and less than 0");
	
	cache=new HashMap<Key, CacheNode<Key, Value>>(maxCacheSize-1);
	frequencyList=new LinkedHashSet[maxCacheSize];
	this.lowestFrequency=0;
	this.maxFrequency=maxCacheSize-1;
	this.maxCacheSize=maxCacheSize;
	this.evictionFactor=evictionFactor;
	initFrequencyList();
    }
    
    private void initFrequencyList(){
	for(int i=0;i<=maxFrequency;i++){
	    frequencyList[i]=new LinkedHashSet<CacheNode<Key, Value>>();
	}
    }
    
    public void put(Key k, Value v){
	CacheNode<Key, Value> currentNode=cache.get(k);
	if(currentNode==null){
	    if(cache.size()==maxCacheSize)
		doEviction();
	    
	    LinkedHashSet<CacheNode<Key, Value>> newNode=frequencyList[0];
	    currentNode=new CacheNode(k, v , 0);
	    newNode.add(currentNode);
	    cache.put(k, currentNode);
	    lowestFrequency=0;
	}else{
	    currentNode.v=v;
	}
    }
    
    public Value get(Key k){
	CacheNode<Key, Value> currentNode=cache.get(k);
	if(currentNode!=null){
	    int currFreq=currentNode.frequency;
	    if(currFreq<maxFrequency){
		int nextFreq=currFreq+1;
		LinkedHashSet<CacheNode<Key, Value>> currentNodes=frequencyList[currFreq];
		LinkedHashSet<CacheNode<Key, Value>> newNodes=frequencyList[nextFreq];
		moveToNextFreq(currentNode, nextFreq, currentNodes, newNodes);
		cache.put(k, currentNode);
		if(lowestFrequency==currFreq && currentNodes.isEmpty())
		    lowestFrequency=nextFreq;
	    }else{
		LinkedHashSet<CacheNode<Key, Value>> nodes=frequencyList[currFreq];
		nodes.remove(currentNode);
		nodes.add(currentNode);
	    }
	    return currentNode.v;
	}else{
	    return null;
	}
    }
    
    private void moveToNextFreq(CacheNode<Key, Value> currentNode, int nextFreq, LinkedHashSet<CacheNode<Key, Value>> currentNodes,
	    LinkedHashSet<CacheNode<Key, Value>> newNodes){
	currentNodes.remove(currentNode);
	newNodes.add(currentNode);
	currentNode.frequency=nextFreq;
    }
    
    private void doEviction(){
	int currentlyDelayed=0;
	float target=evictionFactor*maxCacheSize;
	while(currentlyDelayed<target){
	    LinkedHashSet<CacheNode<Key, Value>> nodes=frequencyList[lowestFrequency];
	    if(nodes.isEmpty()){
		throw new IllegalArgumentException("Lowest frequency constraint violated");
	    }else{
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
	while(lowestFrequency <= maxFrequency && frequencyList[lowestFrequency].isEmpty())
	    lowestFrequency++;
	if(lowestFrequency>maxFrequency)
	    lowestFrequency=0;
    }
    
    public Value remove(Key k){
	CacheNode<Key, Value> currNode=cache.remove(k);
	if(currNode!=null){
	    LinkedHashSet<CacheNode<Key, Value>> nodes=frequencyList[currNode.frequency];
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
	for(int i=0;i<=maxFrequency;i++){
	    frequencyList[i].clear();
	}
	
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
	
	public CacheNode(Key key, Value value, int frequency){
	    this.k=key;
	    this.v=value;
	    this.frequency=frequency;
		    
	}
    }

}
