package All.executorprodCon.prodcon;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import All.executorprodCon.pool.AzCat;
import All.executorprodCon.pool.AzCatPool;


public class Consumer extends ProdConAbs{

    public BlockingQueue<AzCat> q=null;
    protected AzCatPool pool=null;

    
    public Consumer(BlockingQueue<AzCat> ww, AzCatPool poo){
	q=ww;
	pool=poo;
    }
    
    @Override
    public void run() {
	System.out.println();
	try{
	    while(true){
		AzCat c=q.poll(3000, TimeUnit.MILLISECONDS);
		if(c==null)
		    break;
		System.out.println(c.getText());
		pool.releaseCat(c);
	    }
	}catch(Exception e){
	    e.printStackTrace();
	}
	System.out.println("Consumer finished");
	
    }

}
