package concurrency.executor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    BlockingQueue<String> bq=null;
    Integer workItem=0;
    
    public Producer(BlockingQueue<String> q){
	bq=q;
    }

    public void run() {
	System.out.println();
	try{
	    while(true){
		    String work="Work item: ="+(++workItem);
		    System.out.println("Placing obj on queue"+work);
		    bq.put(work);
		}
	}catch(Exception e){
	    e.printStackTrace();
	}
	
	
    }

}
