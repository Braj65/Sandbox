package concurrency.monitors.uniquereentrant;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable{
    public BlockingDeque<Integer> bq=null;
    
    public Consumer(BlockingDeque<Integer> b){
	bq=b;
    }

    @Override
    public void run() {
	while(true){
	    try{
		Integer x=bq.poll(5000, TimeUnit.MILLISECONDS);
		if(x==null)
		    break;
		System.out.println(x);		
	    }catch(Exception e){
		e.printStackTrace();
	    }
	}
	
    }

}
