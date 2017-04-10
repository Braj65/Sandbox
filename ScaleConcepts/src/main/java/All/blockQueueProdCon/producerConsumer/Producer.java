package All.blockQueueProdCon.producerConsumer;

import java.util.concurrent.BlockingQueue;

import All.blockQueueProdCon.Pool.AzCat;
import All.blockQueueProdCon.Pool.AzCatPool;
import All.blockQueueProdCon.Pool.PoolLoader;

public class Producer extends Thread{
    
    BlockingQueue<AzCat> q=null;
    AzCatPool pool=null;
    PoolLoader pLoad=null;
    private long maxToProcess=0;
    
    public Producer(BlockingQueue ww, AzCatPool poo){
	q=ww;
	pool=poo;
	pLoad=new PoolLoader();
	maxToProcess=pLoad.getCapa();
	setName("Producer::");
    }
    
    public void run(){
	System.out.println();
	try{
	    while(pLoad.hasNext()){
		AzCat cat=pool.getCat();
		pLoad.loadCat(cat);
		q.put(cat);
	    }
	}catch(Exception e){
	    e.printStackTrace();
	}
	Thread.currentThread().interrupt();
	System.out.println("Producer finished");
    }

}
