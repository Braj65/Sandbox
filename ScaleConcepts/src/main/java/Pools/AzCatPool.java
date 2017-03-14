package Pools;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class AzCatPool {
    
    public static final Class<AzCatPool> CLASS_NAME=AzCatPool.class;
    
    final private Set<AzCat> mAllInstances;
    final private Set<AzCat> mFreeInstances;
    final private int mNumInstances;
    final private Semaphore permits;
    
    private AzCatPool(int aNumInstances, Set<AzCat> allInstances){
	mNumInstances=aNumInstances;
	permits=new Semaphore(mNumInstances, true);
	mAllInstances=allInstances;
	Set<AzCat> free=Collections.newSetFromMap(new ConcurrentHashMap<AzCat, Boolean>());
	free.addAll(mAllInstances);
	mFreeInstances=free;
    }
    
    public AzCatPool(int aNumInstances, AzCatManager catMan, Properties perfTuneSetts){
	this(aNumInstances, fillPool(aNumInstances, catMan, perfTuneSetts));
    }
    
    private static Set<AzCat> fillPool(int aNumInstances, AzCatManager catManager, Properties performanceTuningSettings){
	Set<AzCat> all=new HashSet<AzCat>(aNumInstances);
	for(int i=0;i<aNumInstances;i++){
	    AzCat c=catManager.createNewCat(performanceTuningSettings);
	    all.add(c);
	}
	return all;
    }
    
    public AzCat getCat(){
	boolean gotPermit;
	gotPermit=permits.tryAcquire();
	if(!gotPermit){
	    return null;
	}
	
	return getCatAfterPermitAcquired();
    }
    
    public AzCat getCat(long aTimeout){
	if(aTimeout==0){
	    permits.acquireUninterruptibly();
	    return getCatAfterPermitAcquired();
	}
	boolean gotIt;
	try{
	    gotIt=permits.tryAcquire(aTimeout, TimeUnit.MILLISECONDS);
	}catch(InterruptedException e){
	    return null;
	}
	
	if(!gotIt)
	    return null;
	return getCatAfterPermitAcquired();
    }
    
    public AzCat getCatAfterPermitAcquired(){
	// synchronize so only one iterator is running
	synchronized(mFreeInstances){
	    final Iterator<AzCat> freeIterator=mFreeInstances.iterator();
	    if(!freeIterator.hasNext()){
		throw new RuntimeException("internal error");
	    }
	    final AzCat cat=freeIterator.next();
	    freeIterator.remove();
	    return cat;
	}
    }
    
    public void releaseCat(AzCat cat){
	cat.setCurrentComponentinfo(null);
	AzCat catView=cat.getView("_initialView");
	
	synchronized(catView){
	    if(!mAllInstances.contains(catView) || mFreeInstances.contains(catView)){
		
	    }else{
		catView.restoreClassLoaderUnlockCas();
		catView.reset();
		mFreeInstances.add(catView);
		permits.release();
	    }
	}
	
	synchronized(this){
	    notifyAll();
	}
    }

}
