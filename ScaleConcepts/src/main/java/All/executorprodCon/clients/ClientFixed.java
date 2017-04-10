package All.executorprodCon.clients;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;

import All.executorprodCon.pool.AzCat;
import All.executorprodCon.pool.AzCatPool;
import All.executorprodCon.prodcon.Consumer;
import All.executorprodCon.prodcon.Producer;

public class ClientFixed {
    
    public static void main(String[] args) {
	ClientFixed cf=new ClientFixed();
	cf.act();
    }
    
    public void act(){
	BlockingQueue<AzCat> bq=new SynchronousQueue<AzCat>();
	AzCatPool pool=new AzCatPool(3);
	Integer threadCount=0;
	ExecutorService execpool=Executors.newFixedThreadPool(4);
	while(true){
	    execpool.execute(new Consumer(bq, pool));
	    execpool.execute(new Producer(bq, pool));
	    threadCount+=2;
	    if(threadCount==6){
		List<Runnable> x=execpool.shutdownNow();
		System.out.println(x.size());
	    }
		
	}
    }

}
