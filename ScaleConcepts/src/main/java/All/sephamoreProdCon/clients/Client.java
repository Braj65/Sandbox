package All.sephamoreProdCon.clients;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


import All.sephamoreProdCon.pool.AzCat;
import All.sephamoreProdCon.pool.AzCatPool;
import All.sephamoreProdCon.prodcon.Consumer;
import All.sephamoreProdCon.prodcon.Producer;

public class Client {
    
    public static void main(String[] args) {
	Client c=new Client();
	c.act();
    }
    
    public void act(){
	BlockingQueue<AzCat> bq=new LinkedBlockingQueue<AzCat>();
	AzCatPool pool=new AzCatPool(3);
	Producer prod=new Producer(bq, pool);
	Consumer cons=new Consumer(bq, pool);
	cons.start();
	prod.start();
	
    }

}
