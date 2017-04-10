package All.sephamoreProdCon.pool;

import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.Semaphore;

public class AzCatPool {
    
    private Vector mAllInstances=new Vector();
    private LinkedList mCheckedOutInstances=new LinkedList();
    private Vector mFreeInstances=new Vector();
    private final int mNumInstances;
    
    public Semaphore semProd=new Semaphore(0);
    public Semaphore semCons=new Semaphore(0);
    
    public AzCatPool(int x){
	mNumInstances=x;
	fillPool();
    }
    
    public void fillPool(){
	for(int i=0;i<mNumInstances;i++){
	    AzCat c=new AzCat();
	    mAllInstances.add(c);
	    mFreeInstances.add(c);
	}
    }
    
    public AzCat getCat() throws InterruptedException{
	
	if(!mFreeInstances.isEmpty()){
	    AzCat c=(AzCat)mFreeInstances.remove(0);
	    if(c!=null){
		mCheckedOutInstances.add(c);
	    }
	    semCons.release();
	    return c;
	}else{
	    try{
//		this.wait(0);
		semProd.acquire();
	    }catch(Exception e){
		e.printStackTrace();
	    }
	    semCons.release();
	    return (AzCat)mFreeInstances.remove(0);
	}
    }
    
    public void releaseCat(AzCat c) throws InterruptedException{
	semCons.acquire();
	if(!mAllInstances.contains(c) || mFreeInstances.contains(c)){
	    
	}else{
	    c.reset();
	    mFreeInstances.add(c);
	    
	    int index=mCheckedOutInstances.indexOf(c);
	    if(index!=-1){
		mCheckedOutInstances.remove(index);
	    }
//	    this.notifyAll();
	    semProd.release();
	}
	
    }

}
