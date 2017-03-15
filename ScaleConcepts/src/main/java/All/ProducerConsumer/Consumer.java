package All.ProducerConsumer;

import java.util.Queue;

import All.Pool.AZCatPEPool;
import All.Pool.AzCat;
import All.Pool.EOFToken;
import All.Pool.WorkQueue;

public class Consumer extends Thread {
    public static int instance = 0;
    private final WorkQueue queue;
    protected AZCatPEPool pool = null;

    public Consumer(WorkQueue q, AZCatPEPool poo) {
	this.queue = q;
	pool = poo;
	setName("Consumer- " + instance++);
    }

    @Override
    public void run() {
	System.out.println();
	boolean run=true;
	while (run) {
	    try {
		AzCat work = null;
//		work = (AzCat) queue.dequeue(0);
		Object o=queue.dequeue(0);
		if(o instanceof EOFToken){
		   handleEOFToken();
		   run=false;
		   break;
		}else{
		    work=(AzCat)o;
		    System.out.println(work.text);
		    pool.releaseCat(work);		    
		}
		
	    } catch (Exception e) {
		break;
	    }
	}
	System.out.println("Consumer finished");
    }
    
    public void handleEOFToken(){
	
    }

}
