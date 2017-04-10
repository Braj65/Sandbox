package All.blockQueueProdCon.Pool;

import java.util.LinkedList;
import java.util.Vector;

public class AzCatPool {
    
    private Vector mAllInstances=new Vector();
    private LinkedList checkedOutInstances=new LinkedList();
    private Vector mFreeInstances=new Vector();;
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
	    AzCat cat=(AzCat) mFreeInstances.remove(0);
	    if(cat!=null)
		checkedOutInstances.add(cat);
	    return cat;
	}else{
	    try{
		this.wait(0);
	    }catch(InterruptedException e){
		e.printStackTrace();
	    }
	    return (AzCat)mFreeInstances.remove(0);
	}
	
    }
    
    public synchronized void releaseCat(AzCat cat){
	if(!mAllInstances.contains(cat) || mFreeInstances.contains(cat)){
	    
	}else{
	    cat.reset();
	    mFreeInstances.add(cat);
	    
	    int index=checkedOutInstances.indexOf(cat);
	    if(index!=-1)
		checkedOutInstances.remove(index);
	    this.notifyAll();
	}
    }
    

}
