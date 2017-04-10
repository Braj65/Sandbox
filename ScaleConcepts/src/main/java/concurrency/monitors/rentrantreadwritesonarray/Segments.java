package concurrency.monitors.rentrantreadwritesonarray;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Segments implements Runnable{

    public ReadWriteLock lock=null;
    public BlockingDeque<Integer> bq=null;
    
    
    public Segments(BlockingDeque<Integer> q){
	lock=new ReentrantReadWriteLock();
	bq=q;
    }
    
    public void run(){
	int x=0;
	try {
	    x = bq.take();
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	if(x%2!=0){
	    modify();
	}else{
	    get();
	}
	    
    }
    
    public void modify(){
	System.out.println();
	try{
	    lock.writeLock().lock();
	    System.out.println("modifying");
	}finally{
	    lock.writeLock().unlock();
	}
    }
    
    public void get(){
	System.out.println();
	try{
	    lock.readLock().lock();
	    modify();
	    System.out.println("fetching");
	}finally{
	    lock.readLock().unlock();
	}
    }

}
