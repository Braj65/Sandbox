package All.Pool;

import java.util.LinkedList;
import java.util.Properties;
import java.util.Vector;


public class AZCatPEPool {
    
    private Vector mAllInstances=new Vector();
    private Vector mFreeInstances=new Vector();
    private LinkedList checkedOutInstances=new LinkedList();
    private final int mNumInstances;
    
    public AZCatPEPool(int aNumInstances, AzCatManager catManager, Properties perfTuneSett){
	mNumInstances=aNumInstances;
	fillPool(catManager, perfTuneSett);
    }
    
    protected void fillPool(AzCatManager catManager, Properties perfTune){
	for(int i=0;i<mNumInstances;i++){
	    AzCat c=catManager.createNewCat(perfTune);
	    mAllInstances.add(c);
	    mFreeInstances.add(c);
	}
    }
    
    public synchronized AzCat getCat(){
	if(!mFreeInstances.isEmpty()){
	    AzCat cat=(AzCat)mFreeInstances.remove(0);
	    if(cat!=null){
		checkedOutInstances.add(cat);
	    }
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
	    if(index!=-1){
		checkedOutInstances.remove(index);
	    }
	    this.notifyAll();
	}
    }



}
