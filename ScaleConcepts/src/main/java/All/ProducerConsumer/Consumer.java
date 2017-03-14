package All.ProducerConsumer;

import java.util.Queue;

import All.Pool.AZCatPEPool;
import All.Pool.AzCat;
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
	while (true) {
	    try {
		AzCat work = null;
		work = (AzCat) queue.dequeue(0);
		if(work==null)
		    break;
		System.out.println(work.text);
		pool.releaseCat(work);
	    } catch (Exception e) {
		break;
	    }
	}
    }

}
