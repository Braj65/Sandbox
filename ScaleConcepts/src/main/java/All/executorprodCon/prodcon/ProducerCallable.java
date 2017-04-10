package All.executorprodCon.prodcon;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

import All.executorprodCon.pool.AzCat;
import All.executorprodCon.pool.AzCatPool;
import All.executorprodCon.pool.PoolLoader;

public class ProducerCallable implements Callable{

    private BlockingQueue<AzCat> bq=null;
    private AzCatPool pool=null;
    private PoolLoader pload=null;
    private long maxToProcess=0;
    
    public ProducerCallable(BlockingQueue b, AzCatPool p){
	bq=b;
	pool=p;
	pload=new PoolLoader();
	maxToProcess=pload.getCapa();	
    }
    
    @Override
    public Object call() throws Exception {
	System.out.println();
	try{
	    while(pload.hasNext()){
		AzCat c=new AzCat();
		pload.loadCat(c);
		bq.put(c);
	    }
	}catch(Exception e){
	    e.printStackTrace();
	}
	Thread.currentThread().interrupt();
	System.out.println("Producer produced");
	return "x";
    }

}
