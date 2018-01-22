package All.executorprodCon.prodcon;

import java.util.concurrent.BlockingQueue;

import All.executorprodCon.pool.AzCat;
import All.executorprodCon.pool.AzCatPool;
import All.executorprodCon.pool.PoolLoader;

public class Producer extends ProdConAbs{

    BlockingQueue<AzCat> q=null;
    AzCatPool pool=null;
    PoolLoader pLoad=null;
    private long maxToProcess=0;
    
    public Producer(BlockingQueue ww, AzCatPool poo){
	q=ww;
	pool=poo;
	pLoad=new PoolLoader();
	maxToProcess=pLoad.getCapa();
    }
    
    @Override
    public void run() {
	System.out.println();
	try{
	    while(pLoad.hasNext()){
//		AzCat c=new AzCat();
		AzCat c=pool.getCat();
		pLoad.loadCat(c);
		q.put(c);
	    }
	    Thread.currentThread().interrupt();
	}catch(Exception e){
	    e.printStackTrace();
	}
	
//	Thread.currentThread().interrupt();
	System.out.println("Producer finished");
    }

}
