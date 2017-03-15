package All.ProducerConsumer;

import All.Clients.ClientPoolProdConsVolatile;
import All.Pool.AZCatPEPool;
import All.Pool.AzCat;
import All.Pool.EOFToken;
import All.Pool.WorkQueue;

public class ProducerVolatileFlag extends Thread{
    
    WorkQueue q=null;
    AZCatPEPool pool=null;
    PoolLoader pload=null;
    private long maxToProcess=0;
    public ClientPoolProdConsVolatile.Control ctrl=null;
    
    public ProducerVolatileFlag(WorkQueue qu, AZCatPEPool poo){
	this.q=qu;
	pool=poo;
	pload=new PoolLoader();
	maxToProcess=pload.getCapa();
	setName("producer::");
    }
    
    public void setFlag(ClientPoolProdConsVolatile.Control ctr){
	this.ctrl=ctr;
    }
    
    public void run(){
	System.out.println();
	while(maxToProcess!=0){
	    AzCat cat=pool.getCat();
	    try{
		/*if(!pload.hasNext()){
		    break;
		}*/
		pload.getNext(cat);
		q.enqueue(cat);
		--maxToProcess;
		if(endOfProcessingReached()){
		    ctrl.finishflag=false;
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
