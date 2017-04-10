package concurrency.executor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Consumer implements Callable<String>{

    BlockingQueue<String> bq=null;
    private String name=null;
    public Consumer( String name){
	this.name=name;	
    }
    
    public String call() {
	System.out.println();
	try{
	    Thread.sleep(500);
	}catch(Exception e){
	    e.printStackTrace();
	}
	return "x";
	
	
	/*try{
	    System.out.println("Listener waiting for new client");
	    while(true){
		String s=bq.poll(30, TimeUnit.SECONDS);
		if(s==null)
		    break;
		System.out.println(s);		
	    }
	}catch(Exception e){
	    e.printStackTrace();
	}*/
    }

    public String getName() {
	return this.name;
    }

}
