package concurrency.monitors.uniquereentrant;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class Client {
    public static void main(String[] args) throws Exception{
	Client c=new Client();
	c.act();
    }
    
    public void act() throws Exception{
	BlockingDeque<Integer> bq=new LinkedBlockingDeque<Integer>();
	ExecutorService exec=Executors.newCachedThreadPool();
	
	TaskRunner trun=new TaskRunner();
	while(true){
	    trun.runTaskUniquely(new Producer(bq), 5000);
	    exec.submit(new Consumer(bq));
	}
    }

}
