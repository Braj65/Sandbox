package concurrency.monitors.uniquereentrant;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    public BlockingDeque<Integer> bq=null;
    
    public Producer(BlockingDeque<Integer> b){
	bq=b;
    }

    @Override
    public void run() {
	try{
	    for(int i=0;i<20;i++){
		bq.putFirst(i);
	    }
	}catch(Exception e){
	    e.printStackTrace();
	}
	
    }

}
