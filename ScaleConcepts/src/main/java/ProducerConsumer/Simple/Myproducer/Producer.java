package ProducerConsumer.Simple.Myproducer;



import java.util.LinkedList;
import java.util.Queue;

public class Producer extends Thread{
    Queue<String> q=null;
    CategoryNamePool p=new CategoryNamePool("games", true);
    
    
    public Producer(Queue qu){
	this.q=qu;
	setName("producer::");
    }
    
    public void run() {
	System.out.println();
	while(true){
	    synchronized(q){
		q.add(p.get());
		q.notifyAll();
	    }	    	    
	}
	
    }
}
