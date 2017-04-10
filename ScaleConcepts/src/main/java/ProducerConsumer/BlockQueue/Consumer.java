package ProducerConsumer.BlockQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{
    BlockingQueue<String> q=null;
    public Consumer(BlockingQueue in){
	q=in;
    }
    
    public void run(){
	try{
	    while(true){
		Thread.sleep(1000);
		    String s=q.take();
		    System.out.println(s);
		}	    
	}catch(Exception e){
	    e.printStackTrace();
	}
	
    }
}
