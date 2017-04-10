package concurrency.executor.defaultpooltweaks.twk2;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class CustomExecutor extends ThreadPoolExecutor{
    
    private CustomExecutor(int coresize, int maxsize, long keepalive, TimeUnit unit,
	    TransferQueue<Runnable> workqueue){
	super(coresize, maxsize, keepalive, unit, workqueue);
    }
    
    public static ThreadPoolExecutor get(int coresize, int maxsize, long keepalive, TimeUnit unit,
	    TransferQueue<Runnable> workQueue){
	DynamicBlockingQueue<Runnable> queue=new DynamicBlockingQueue<Runnable>(workQueue);
	ThreadPoolExecutor executor=new CustomExecutor(coresize, maxsize, keepalive, unit, workQueue);
	queue.setExecutor(executor);
	return executor;
    }
    
    public static ThreadPoolExecutor get(int coresize, int maxsize, long keepAlive, TimeUnit unit){
	DynamicBlockingQueue<Runnable> queue=new DynamicBlockingQueue<Runnable>(new LinkedTransferQueue<Runnable>());
	ThreadPoolExecutor exec=new CustomExecutor(coresize, maxsize, keepAlive, unit, queue);
	queue.setExecutor(exec);
	return exec;
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
