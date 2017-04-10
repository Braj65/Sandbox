package concurrency.monitors.rentrantreadwrites;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;

public class Consumer implements Runnable{

    public BlockingQueue<Integer> bq=null;
    public ReadWriteLock lock=null;
    public Consumer(BlockingQueue<Integer> q, ReadWriteLock l){
	lock=l;
	bq=q;
    }
    
    @Override
    public void run() {
	System.out.println();
	try{
	    while(true){
		try{
		    lock.readLock().lock();
		    Integer i=bq.poll(5000, TimeUnit.MILLISECONDS);
		    if(i==null)
			break;
		    System.out.println(i);		    
		}finally{
		    lock.readLock().unlock();
		}		    		    
	    }	    
	}catch(Exception e){
	    e.printStackTrace();
	}
	
	
    }

}
