package concurrency.executor;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomExecutor extends ThreadPoolExecutor{

    public CustomExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime,
	    TimeUnit unit, BlockingQueue<Runnable> workQueue) {
	super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
	// TODO Auto-generated constructor stub
    }
    
    protected void beforeExecute(Thread t, Runnable r){
	super.beforeExecute(t, r);
	System.out.println("Peform before execute logic");
    }
    
    protected void afterExecute(Runnable r, Throwable t){
	super.afterExecute(r, t);
	if(t!=null){
	    System.out.println("Perform exception handler logic");
	}
	System.out.println("Peform after execute logic");
    }

}
