package All.executorprodCon.clients;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;

import All.executorprodCon.pool.AzCat;
import All.executorprodCon.pool.AzCatPool;
import All.executorprodCon.prodcon.ConsumerCallable;
import All.executorprodCon.prodcon.ProducerCallable;

public class ClientCallable {
    
    public static void main(String[] args) {
	ClientCallable c=new ClientCallable();
	c.act();
    }
    
    public void act(){
	BlockingQueue<AzCat> bq=new SynchronousQueue<AzCat>();
	AzCatPool pool=new AzCatPool(3);
	ExecutorService execpool=Executors.newFixedThreadPool(4);
	Integer threadCount=0;
	List<Future<String>> fut=new ArrayList<Future<String>>();
	for(int i=0;i<5;i++){
	    fut.add(execpool.submit(new ConsumerCallable(bq, pool)));
	    fut.add(execpool.submit(new ProducerCallable(bq, pool)));
	}
	
	for(Future<String> f:fut){
	    try {
		System.out.println(f.get());
	    } catch (InterruptedException | ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
	
	execpool.shutdownNow();
	
    }

}
