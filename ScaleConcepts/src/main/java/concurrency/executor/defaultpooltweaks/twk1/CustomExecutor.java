package concurrency.executor.defaultpooltweaks.twk1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class CustomExecutor extends ThreadPoolExecutor{

    public CustomExecutor(int coreSize, int maxSize, long keepAliveTime,
	    TimeUnit unit, ThreadFactory factory) {
	super(coreSize, maxSize, keepAliveTime, unit,
		new DynamicBlockingQueue<Runnable>(new LinkedTransferQueue<Runnable>()), 
		factory, new ForceQueuePolicy());
	// TODO Auto-generated constructor stub
    }
    
    public CustomExecutor(int coresize, int maxsize, long keepalive,
	    TimeUnit unit, TransferQueue<Runnable> workQueue){
	super(coresize, maxsize, keepalive, unit, 
		new DynamicBlockingQueue<Runnable>(workQueue), new ForceQueuePolicy());
    }
    
    public void setRejectedExecutionHandler(RejectedExecutionHandler handler){
	throw new IllegalArgumentException("can't set rejection handler");
    }
    
    protected void beforeExecute(Thread t, Runnable r){
	super.beforeExecute(t, r);
	System.out.println("Perform before execute logic");
    }
    
    protected void afterExecute(Runnable r, Throwable t){
	super.afterExecute(r, t);
	if(t!=null)
	    System.out.println("perform exception handler logic");
	
	System.out.println("Perform after execute logic");
    }

}
