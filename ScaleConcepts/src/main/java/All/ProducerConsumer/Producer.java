package All.ProducerConsumer;


import java.util.Properties;
import java.util.Queue;

import All.Pool.AZCatPEPool;
import All.Pool.AzCat;
import All.Pool.AzCatManager;
import All.Pool.EOFToken;
import All.Pool.WorkQueue;

public class Producer extends Thread{
    WorkQueue q=null;
    AZCatPEPool pool=null;
    PoolLoader pload=null;
    private long maxToProcess=0;
    
    
    public Producer(WorkQueue qu, AZCatPEPool poo){
	this.q=qu;
	pool=poo;
	pload=new PoolLoader();
	maxToProcess=pload.getCapa();
	setName("producer::");
    }
    
    public void run() {
	System.out.println();
	while(true){
	    AzCat cat=pool.getCat();
	    try{
		/*if(!pload.hasNext()){
		    break;
		}*/
		pload.getNext(cat);
		q.enqueue(cat);
		--maxToProcess;
		if(endOfProcessingReached()){
		    break;
		}
	    }catch(Exception e){
		e.printStackTrace();
	    }
	}
	placeEofToken();
	Thread.currentThread().interrupt();
	System.out.println("Producer finished");
    }
    
    public boolean endOfProcessingReached(){
	if(maxToProcess==0)
	    return true;
	else
	    return false;
    }
    
    private void placeEofToken(){
	q.enqueue(new EOFToken());
    }
}
