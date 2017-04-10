package concurrency.semaphores;

import java.util.concurrent.Semaphore;

public class Consumer extends Thread{
    	ProductQueue q=null;
	
	public Consumer(ProductQueue qq){
	    this.q=qq;
	    this.setName("Cons thread");
	}
	
	public void run(){
	    System.out.println();
	    for(int i=0;i<5;i++){
		q.getprodFromQ();
	    }
	}
	


}
