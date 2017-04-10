package All.blockQueueProdCon.producerConsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import All.blockQueueProdCon.Pool.AzCat;
import All.blockQueueProdCon.Pool.AzCatPool;

public class Consumer extends Thread{
    
    public BlockingQueue<AzCat> q=null;
    protected AzCatPool pool=null;
    public static int instance=0;
    
    public Consumer(BlockingQueue<AzCat> ww, AzCatPool poo){
	q=ww;
	pool=poo;
	setName("Consumer: " + instance++);
    }
    
    public void run(){
	System.out.println();
	try{
	    while(true){
		AzCat cat=q.poll(2000, TimeUnit.MILLISECONDS);
		if(cat==null)
		    break;
		System.out.println(cat.getText());
		pool.releaseCat(cat);
	    }	    
	}catch(Exception e){
	    e.printStackTrace();
	}
	System.out.println("Consumer over");
    }
    
    

}
