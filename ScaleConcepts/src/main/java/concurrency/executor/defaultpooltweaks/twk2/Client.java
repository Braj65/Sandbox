package concurrency.executor.defaultpooltweaks.twk2;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

//first to the queue
public class Client {
    
    public static void main(String[] args) {
	Client c=new Client();
	c.act();
    }
    
    public void act(){
	final ThreadPoolExecutor exec=CustomExecutor.get(3, 5, 5000, TimeUnit.MILLISECONDS);
	exec.setRejectedExecutionHandler(new RejectedExecutionHandler(){

	    @Override
	    public void rejectedExecution(Runnable r, ThreadPoolExecutor execut) {
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
	AtomicLong count=new AtomicLong(1);
	while(true){
	    exec.submit(new Consumer(Long.toString(count.getAndIncrement())));
	}
    }

}
