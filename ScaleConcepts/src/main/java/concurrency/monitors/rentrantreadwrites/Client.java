package concurrency.monitors.rentrantreadwrites;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Client {
    
    public static void main(String[] args) {
	Client c=new Client();
	c.act();
    }
    
    public void act(){
	BlockingQueue<Integer> bq=new LinkedBlockingQueue<Integer>();
	ReadWriteLock lock=new ReentrantReadWriteLock();
	
	ThreadFactory cust=new CustThreadFactoryBuilder().setDaemon(false)
		.setPrefix("exec").setPriority(Thread.MAX_PRIORITY).build();
	ExecutorService exec=Executors.newCachedThreadPool(cust);
	
	while(true){
	    exec.submit(new Producer(bq, lock));
	    exec.submit(new Consumer(bq, lock));
	}
    }

}
