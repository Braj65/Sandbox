package concurrency.executor.defaultpooltweaks.twk1;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

//override offer method of the queue
public class Client {
    
    public static void main(String[] args) {
	Client c=new Client();
	c.act();
    }
    
    public void act(){
	ThreadFactory fact=new CustomThreadFactoryBuilder().setNamePrefix("queueOff-").setDaemon(false).setPriority(Thread.MAX_PRIORITY).build();
	TransferQueue<Runnable> tq=new LinkedTransferQueue<Runnable>();
	CustomExecutor exec=new CustomExecutor(3, 5, 5000, TimeUnit.MILLISECONDS, fact);
	exec.prestartAllCoreThreads();
	
	while(true){
	    exec.submit(new Consumer());
	}
    }

}
