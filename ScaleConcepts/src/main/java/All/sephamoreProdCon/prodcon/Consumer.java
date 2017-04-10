package All.sephamoreProdCon.prodcon;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import All.sephamoreProdCon.pool.AzCat;
import All.sephamoreProdCon.pool.AzCatPool;

public class Consumer extends Thread{
    
    private BlockingQueue<AzCat> bq=null;
    private AzCatPool pool=null;
    
    public Consumer(BlockingQueue<AzCat> b, AzCatPool p){
	bq=b;
	pool=p;
    }
    
    public void run(){
	System.out.println();
	try{
	    while(true){
		AzCat c=bq.take();
		System.out.println(c.getDocText());
		pool.releaseCat(c);
	    }
	}catch(Exception e){
	    e.printStackTrace();
	}
	System.out.println("Consumer consumed");
    }

}
