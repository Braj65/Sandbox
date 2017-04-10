package All.executorprodCon.prodcon;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

import All.executorprodCon.pool.AzCat;
import All.executorprodCon.pool.AzCatPool;

public class ConsumerCallable implements Callable{
    
    private BlockingQueue<AzCat> bq=null;
    private AzCatPool pool=null;
    
    public ConsumerCallable(BlockingQueue b, AzCatPool p){
	bq=b;
	pool=p;
    }

    @Override
    public Object call() throws Exception {
	System.out.println();
	try{
	    while(true){
		AzCat c=bq.poll(5000, TimeUnit.MILLISECONDS);
		System.out.println(c.getText());
		pool.releaseCat(c);
	    }
	}catch(Exception e){
	    e.printStackTrace();
	}
	return "y";
    }

}
