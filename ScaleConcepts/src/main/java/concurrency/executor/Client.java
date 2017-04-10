package concurrency.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Client {
    
    
    public static void main(String[] args) {
	Client j=new Client();
	j.act();
    }
    
    public void act(){
	Integer threadCounter=0;
	BlockingQueue<Runnable> bq=new ArrayBlockingQueue<Runnable>(6);
	final CustomExecutor exec=new CustomExecutor(3, 5, 5000, TimeUnit.MILLISECONDS, bq);
	exec.setRejectedExecutionHandler(new RejectedExecutionHandler(){
	    public void rejectedExecution(Runnable r, ThreadPoolExecutor execut){
		System.out.println("Demotask rejected: "+((Consumer)r).getName());
		System.out.println("Waiting for a second");
		try{
		    Thread.sleep(1000);
		}catch(Exception e){
		    e.printStackTrace();
		}
		System.out.println("Lets add another time: "+((Consumer)r).getName());
		exec.execute(r);
	    }
	});
	
	exec.prestartAllCoreThreads();
	while(true){
	    threadCounter++;
	    //Adding threads one by one
	    System.out.println("Adding demo task "+threadCounter);
	    List<Future<String>> futures=new ArrayList<Future<String>>(10);
	    CompletionService<String> pool=new ExecutorCompletionService<String>(exec);
	    
	    exec.submit(new Consumer(threadCounter.toString()));
	    
	    for(int i=0;i<10;i++){
		try {
		    System.out.println(pool.take().get());
		    System.out.println();
		} catch (InterruptedException | ExecutionException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	    }
	    
	    if(threadCounter==11){
		List<Runnable> l=exec.shutdownNow();
		l.get(0);
		break;
	    }
	}
	/*Consumer con=new Consumer(bq);
	Producer pro=new Producer(bq);
	for(int i=0;i<5;i++)
	    pool.submit(con);
	for(int i=0;i<5;i++)
	    pool.submit(pro);	
	while(true){
	    System.out.println();
	}*/
	
    }
    
        

}
