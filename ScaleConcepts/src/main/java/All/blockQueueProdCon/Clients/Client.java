package All.blockQueueProdCon.Clients;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

import All.blockQueueProdCon.Pool.AzCat;
import All.blockQueueProdCon.Pool.AzCatPool;
import All.blockQueueProdCon.producerConsumer.Consumer;
import All.blockQueueProdCon.producerConsumer.Producer;

public class Client extends Thread{
    
    public static void main(String[] args) {
	Client c=new Client();
	c.start();
    }
    
    public void run(){
//	BlockingQueue<AzCat> q=new SynchronousQueue<AzCat>();
	BlockingQueue<AzCat> q=new ArrayBlockingQueue<AzCat>(3);
	AzCatPool pool=new AzCatPool(3);
	
	Consumer con=new Consumer(q, pool);
	con.start();
	
	Producer pro=new Producer(q, pool);
	pro.start();
    }

}
