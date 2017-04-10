package concurrency.executor.defaultpooltweaks.twk1;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class ForceQueuePolicy implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor exec) {
	try{
	    exec.getQueue().put(r);
	}catch(InterruptedException e){
	    throw new RejectedExecutionException(e);	    
	}	
    }

}
