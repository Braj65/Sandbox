package concurrency.semaphores;

import java.util.concurrent.Semaphore;

public class Producer extends Thread{
	ProductQueue q=null;
	
	public Producer(ProductQueue q){
	    this.q=q;
	    this.setName("prod thread");
	}
	
	public void run(){
	    System.out.println();
	    for(int i=0;i<5;i++){
		q.putProdinQ(i);
	    }
	}


}
