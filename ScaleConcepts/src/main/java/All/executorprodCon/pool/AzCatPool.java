package All.executorprodCon.pool;

import java.util.LinkedList;
import java.util.Vector;

public class AzCatPool {
    
    private Vector mAllInstances=new Vector();
    private LinkedList mCheckedoutInstances=new LinkedList();
    private Vector mFreeInstances=new Vector();
    private final int mNumInstances;
    
    
    public AzCatPool(int numInst){
	mNumInstances=numInst;
	fillPool();	
    }
    
    public void fillPool(){
	for(int i=0;i<mNumInstances;i++){
	   AzCat c=new AzCat();
	   mAllInstances.add(c);
	   mFreeInstances.add(c);
	}
	
    }
    
    public synchronized AzCat getCat(){
	if(!mFreeInstances.isEmpty()){
	    AzCat c=(AzCat)mFreeInstances.remove(0);
	    if(c!=null)
		mCheckedoutInstances.add(c);
	    return c;
	}else{
	    try{
		this.wait(0);
	    }catch(InterruptedException e){
		e.printStackTrace();
	    }
	    return (AzCat)mFreeInstances.remove(0);
	}
	    
    }
    
    public synchronized void releaseCat(AzCat c){
	if(!mAllInstances.contains(c) || mFreeInstances.contains(c)){
	    
	}else{
	    c.reset();
	    mFreeInstances.add(c);
	    
	    int index=mCheckedoutInstances.indexOf(c);
	    if(index!=-1)
		mCheckedoutInstances.remove(index);
	    this.notifyAll();
	}
    }

}
