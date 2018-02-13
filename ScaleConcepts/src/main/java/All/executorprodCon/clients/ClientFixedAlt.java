package All.executorprodCon.clients;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import All.executorprodCon.pool.AzCat;
import All.executorprodCon.pool.AzCatPool;
import All.executorprodCon.prodcon.Consumer;
import All.executorprodCon.prodcon.Producer;

public class ClientFixedAlt {

    public static void main(String[] args) {
	ClientFixedAlt c = new ClientFixedAlt();
	c.act();
    }

    public void act() {
	BlockingQueue<AzCat> bq = new LinkedBlockingQueue<AzCat>();
	AzCatPool pool = new AzCatPool(3);
	Integer threadCount = 0;
	ExecutorService execpool = Executors.newFixedThreadPool(4);
	Consumer cons = new Consumer(bq, pool);
	Producer prod = new Producer(bq, pool);
	execpool.execute(cons);
	execpool.execute(prod);
	execpool.shutdown();
	try {
	    execpool.awaitTermination(10000, TimeUnit.MILLISECONDS);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
