package All.sephamoreProdCon.prodcon;

import java.util.concurrent.BlockingQueue;

import All.sephamoreProdCon.pool.AzCat;
import All.sephamoreProdCon.pool.AzCatPool;
import All.sephamoreProdCon.pool.PoolLoader;

public class Producer extends Thread{
    
    private BlockingQueue<AzCat> bq=null;
    private AzCatPool pool=null;
    private PoolLoader pLoad=null;
    private long maxToProcess=0;
    
    public Producer(BlockingQueue<AzCat> b, AzCatPool p){
	bq=b;
	pool=p;
	pLoad=new PoolLoader();
	maxToProcess=pLoad.getCapa();
    }
    
    public void run(){
	System.out.println();
	try{
	    while(pLoad.hasNext()){
		AzCat c=pool.getCat();
		pLoad.loadCat(c);
		bq.put(c);
	    }
	}catch(Exception e){
	    e.printStackTrace();
	}
	Thread.currentThread().interrupt();
	System.out.println("Producer produced");
    }

}
