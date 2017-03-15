package All.Clients;

import java.util.Properties;

import All.Pool.AZCatPEPool;
import All.Pool.AzCatManager;
import All.Pool.WorkQueue;
import All.ProducerConsumer.Consumer;
import All.ProducerConsumer.ConsumerVolatileFlag;
import All.ProducerConsumer.Producer;
import All.ProducerConsumer.ProducerVolatileFlag;

public class ClientPoolProdConsVolatile extends Thread{
    
    
    public static void main(String[] args) {
	ClientPoolProdConsVolatile c=new ClientPoolProdConsVolatile();
	c.start();
    }
    
    public class Control{
	public volatile boolean finishflag=true;
    }
    
    public void run(){
	Control ctrl=new Control();
	WorkQueue workQueue=new WorkQueue();
	AzCatManager catMan=new AzCatManager();
	Properties perfProp=new Properties();
	perfProp.put("cas_initial_heap_size", 500000);
	perfProp.put("socket_keepalive_enabled", true);
	perfProp.put("process_trace_enabled", true);
	AZCatPEPool catPool=new AZCatPEPool(3, catMan, perfProp);

	ConsumerVolatileFlag cons=new ConsumerVolatileFlag(workQueue, catPool);
	cons.setFlag(ctrl);
	cons.start();
	
	ProducerVolatileFlag prod=new ProducerVolatileFlag(workQueue, catPool);
	prod.setFlag(ctrl);
	prod.start();    
    }

}
