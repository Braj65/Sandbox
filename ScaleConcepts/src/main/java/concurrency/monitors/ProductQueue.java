package concurrency.monitors;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProductQueue {
    
    public static Lock lock=null;
    public static Condition prodThread=null;
    public static Condition consThread=null;
    public int prodId=0;
    public int capa=3;
    
    public ProductQueue(){
	lock=new ReentrantLock();
	prodThread=lock.newCondition();
	consThread=lock.newCondition();
    }
    
    public void putProdInQ(int prod){
	lock.lock();
	try{
	    while(prodId==capa)
		prodThread.await();	    
	    prodId=prod;
	    System.out.println(Thread.currentThread().getName()+" Putting prod in q prodid= "+prodId);
	    
	    consThread.signal();
	}catch(Exception e){
	    e.printStackTrace();
	}finally{
	    lock.unlock();
	}
	
    }
    
    public void getProdFromQ(){
	lock.lock();
	try{
	    while(prodId==0)
		consThread.await();
	    
	    System.out.println(Thread.currentThread().getName()+" Getting prod from Q prodid= "+prodId);
	    prodThread.signal();
	}catch(Exception e){
	    e.printStackTrace();
	}finally{
	    lock.unlock();
	}
    }

}
