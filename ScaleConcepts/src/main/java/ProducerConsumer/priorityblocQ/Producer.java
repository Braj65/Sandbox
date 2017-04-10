package ProducerConsumer.priorityblocQ;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{
    
    BlockingQueue<ClsCompare> q=null;
    int item=0;
    public Producer(BlockingQueue<ClsCompare> ww){
	q=ww;
    }
    
    public void run(){
	try{
	    while(true){
		ClsCompare work=new ClsCompare((int)((Math.random()*100)+20));
		System.out.println("Placing obj on queue "+work.get());
		q.put(work);
	    }
	}catch(Exception e){
	    
	}
    }

}
