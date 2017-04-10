package concurrency.monitors.rentrantreadwrites;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReadWriteLock;

public class Producer implements Runnable{

    BlockingQueue<Integer> bq=null;
    ReadWriteLock lock=null;
    public Producer(BlockingQueue b, ReadWriteLock l){
	bq=b;
	lock=l;
    }
    
    @Override
    public void run() {
	prod();	
    }
    
    public void prod(){
	System.out.println();
	for(int i=0;i<20;i++){
	    try{
		lock.writeLock().lock();
		bq.add(i);
	    }finally{
		lock.writeLock().unlock();
		
	    }
	    
	}
    }

}
