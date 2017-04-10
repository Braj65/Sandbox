package concurrency.monitors;

import java.util.concurrent.locks.Lock;

public class Producer extends Thread{
    public ProductQueue pq=null;
    
    public Producer(ProductQueue p){
	pq=p;
	setName("Prod Thread");
    }
    
    public void run(){
	System.out.println();
	for(int i=0;i<4;i++){
	    pq.putProdInQ(i);
	}
    }
}
