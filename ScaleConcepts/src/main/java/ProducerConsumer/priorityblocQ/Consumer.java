package ProducerConsumer.priorityblocQ;

import java.util.concurrent.BlockingQueue;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Consumer extends Thread{
    
    BlockingQueue<ClsCompare> q=null;
    
    public Consumer(BlockingQueue<ClsCompare> ww){
	q=ww;
    }
    
    public void run(){
	System.out.println();
	try{
	    System.out.println("Waiting...");
	    while(true){
		ClsCompare s=q.take();
		System.out.println("Obtained "+s.get());
	    }
	}catch(Exception e){
	    
	}
    }

}
