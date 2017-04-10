package ProducerConsumer.BlockQueue;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{
    BlockingQueue<String> q=null;
    int workItem=0;
    public Producer(BlockingQueue in){
	q=in;
    }
    
    public void run(){
	try{
	    while(true){
		String work="Work item: ="+(++workItem);
		System.out.println("Placing obj on queue"+work);
		q.put(work);
	    }
	}catch(Exception e){
	    e.printStackTrace();
	}
    }

}
