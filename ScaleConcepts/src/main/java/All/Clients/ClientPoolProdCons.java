package All.Clients;

import java.util.LinkedList;
import java.util.Properties;
import java.util.Queue;

import All.Pool.AZCatPEPool;
import All.Pool.AzCat;
import All.Pool.AzCatManager;
import All.Pool.WorkQueue;
import All.ProducerConsumer.Consumer;
import All.ProducerConsumer.Producer;

public class ClientPoolProdCons extends Thread{
    
    public static void main(String[] args) {
	ClientPoolProdCons cl=new ClientPoolProdCons();
	cl.start();
	
    }
    
    public void run(){
	WorkQueue workQueue=new WorkQueue();
	AzCatManager catMan=new AzCatManager();
	Properties perfProp=new Properties();
	perfProp.put("cas_initial_heap_size", 500000);
	perfProp.put("socket_keepalive_enabled", true);
	perfProp.put("process_trace_enabled", true);
	AZCatPEPool catPool=new AZCatPEPool(3, catMan, perfProp);

	Consumer cons=new Consumer(workQueue, catPool);
	cons.start();
	
	Producer prod=new Producer(workQueue, catPool);
	prod.start();
    }

}
