package All.executorprodCon.clients;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import All.executorprodCon.executor.CustomExecutor;
import All.executorprodCon.executor.CustomThreadFactoryBuilder;
import All.executorprodCon.executor.MyThreadFactory;
import All.executorprodCon.pool.AzCat;
import All.executorprodCon.pool.AzCatPool;
import All.executorprodCon.prodcon.Consumer;
import All.executorprodCon.prodcon.ProdConAbs;
import All.executorprodCon.prodcon.Producer;

public class ClientExecCustom {
    
    public static void main(String[] args) {
	ClientExecCustom c=new ClientExecCustom();
	c.act();		
    }
    
    public void act(){
	BlockingQueue<AzCat> bq=new SynchronousQueue<AzCat>();
	AzCatPool pool=new AzCatPool(3);
	/*Producer prod=new Producer(bq, pool);
	Consumer cons=new Consumer(bq, pool);
	Thread trCon=new Thread(cons);
	trCon.setName("cons");
	trCon.start();
	
	Thread trProd=new Thread(prod);
	trProd.setName("prod");
	trProd.start();*/
	
	Integer threadCount=0;
	BlockingQueue<Runnable> bqu=new ArrayBlockingQueue<Runnable>(6);
//	final CustomExecutor exec=new CustomExecutor(3, 5, 5000, TimeUnit.MILLISECONDS, bqu);
//	final CustomExecutor exec=new CustomExecutor(3, 5, 5000, TimeUnit.MILLISECONDS, bqu, new MyThreadFactory());
	ThreadFactory customTrFactory=new CustomThreadFactoryBuilder().setNamePrefix("Daemon_pool").setDaemon(false)
		.setPriority(Thread.MAX_PRIORITY).build();
	final CustomExecutor exec=new CustomExecutor(3, 5, 5000, TimeUnit.MILLISECONDS, bqu, customTrFactory);
	
	exec.setRejectedExecutionHandler(new RejectedExecutionHandler() {
	    
	    @Override
	    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		System.out.println("Task rejected "+((ProdConAbs)r).getName());
		System.out.println("Waiting for a second");
		try{
		    Thread.sleep(1000);
		}catch(Exception e){
		    e.printStackTrace();
		}
		System.out.println("Lets add another time "+((ProdConAbs)r).getName());
		exec.execute(r);		
	    }
	});
	exec.prestartAllCoreThreads();
	while(true){
	    threadCount++;
	    //Adding threads one by one
	    System.out.println("Adding demo task "+threadCount);
	    exec.execute(new Consumer(bq, pool));
	    exec.execute(new Producer(bq, pool));
	    
	    if(threadCount==30)
		break;
	}
    }

}
