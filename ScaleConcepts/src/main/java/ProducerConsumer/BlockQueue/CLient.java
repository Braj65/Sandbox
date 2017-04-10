package ProducerConsumer.BlockQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class CLient {
    
    public static void main(String[] args) {
//	BlockingQueue<String> queue=new SynchronousQueue<String>();
	BlockingQueue<String> queue=new ArrayBlockingQueue<String>(3);
	Producer p=new Producer(queue);
	for(int i=0;i<3;i++){
	    Consumer con=new Consumer(queue);
	    con.start();
	}
	p.start();
    }

}

