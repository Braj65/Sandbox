package concurrency.semaphores;

import java.util.concurrent.Semaphore;

public class ProductQueue {
    
    static Semaphore semProd=new Semaphore(1);
    static Semaphore semCon=new Semaphore(0);
    
    int prodId;
    
    public void putProdinQ(int prodid){
	try{
	    semProd.acquire();
	    this.prodId=prodid;
	    System.out.println(Thread.currentThread().getName()+"putting in Q- prod id"+prodId);
	    semCon.release();
	}catch(Exception e){
	    e.printStackTrace();
	}
    }
    
    public void getprodFromQ(){
	try{
	    semCon.acquire();
	    System.out.println(Thread.currentThread().getName()+"Getting prod id"+prodId);
	    semProd.release();
	}catch(Exception e){
	    e.printStackTrace();
	}
    }

}
