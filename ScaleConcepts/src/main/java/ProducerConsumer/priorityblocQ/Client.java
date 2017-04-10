package ProducerConsumer.priorityblocQ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Client {
    
    public static void main(String[] args) {
	/*Integer[] x={5, 7,34, 33, 67,2};
	ClsCompare[] a=new ClsCompare[6];
	
	for(int i=0;i<x.length;i++){
	    a[i]=new ClsCompare(x[i]);
	}
	
	PriorityBlockingQueue<ClsCompare> pq=new PriorityBlockingQueue<ClsCompare>();
	for(ClsCompare e:a){
	    pq.add(e);
	}*/
	/*ArrayList<ClsCompare> al=new ArrayList<ClsCompare>();
	pq.drainTo(al);*/
	
	BlockingQueue<ClsCompare> qq=new PriorityBlockingQueue<ClsCompare>();
	Producer p=new Producer(qq);
	Consumer con1=new Consumer(qq);
	con1.start();
	Consumer con2=new Consumer(qq);
	con2.start();
	p.start();
    }

}
