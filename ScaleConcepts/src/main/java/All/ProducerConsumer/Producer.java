package All.ProducerConsumer;


import java.util.Properties;
import java.util.Queue;

import All.Pool.AZCatPEPool;
import All.Pool.AzCat;
import All.Pool.AzCatManager;
import All.Pool.WorkQueue;

public class Producer extends Thread{
    WorkQueue q=null;
    AZCatPEPool pool=null;
    PoolLoader pload=null;
    
    
    public Producer(WorkQueue qu, AZCatPEPool poo){
	this.q=qu;
	pool=poo;
	pload=new PoolLoader();
	setName("producer::");
    }
    
    public void run() {
	System.out.println();
	while(true){
	    AzCat cat=pool.getCat();
	    try{
		if(!pload.hasNext()){
		    break;
		}
		pload.getNext(cat);
		q.enqueue(cat);
	    }catch(Exception e){
		e.printStackTrace();
	    }
	}
    }
}
