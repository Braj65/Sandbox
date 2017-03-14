package ProducerConsumer.Simple.Myconsumer;

import java.util.Queue;

public class Consumer extends Thread{
    public static int instance=0;
    private final Queue<String> queue;
    
    public Consumer(Queue q){
	this.queue=q;
	setName("Consumer- "+ instance++);
    }
    
    @Override
    public void run(){
	System.out.println();
	while(true){
	    try{
		String work=null;
		
		synchronized(queue){
		    while(queue.isEmpty())
			queue.wait();
		    
		    work=queue.remove();
		    System.out.println(work);
		}
		
		
		
	    }catch(Exception e){
		break;
	    }
	}
    }

}
