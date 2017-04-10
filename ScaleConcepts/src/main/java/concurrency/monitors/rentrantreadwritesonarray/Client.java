package concurrency.monitors.rentrantreadwritesonarray;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Client {
    
    public static void main(String[] args) throws Exception {
	Client c=new Client();
	c.act();
    }
    
    public void act() throws Exception{
	ExecutorService exec=Executors.newFixedThreadPool(5);
	Segments[] seg=new Segments[5];
	BlockingDeque<Integer> bq=new LinkedBlockingDeque<Integer>();
	for(int i=0;i<5;i++){
	    seg[i]=new Segments(bq);
	}
	int j=0;
	while(true){
	    bq.put(j);
	    exec.submit(seg[j]);
	    bq.put(j);
	    exec.submit(seg[j]);
	    ++j;
	    
	}
	
    }

}
