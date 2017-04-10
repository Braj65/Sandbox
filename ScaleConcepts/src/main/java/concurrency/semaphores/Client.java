package concurrency.semaphores;

import java.util.concurrent.Semaphore;

public class Client {
    
    public static void main(String[] args) {
	Client c=new Client();
	c.act();
    }
    
    public void act(){
	ProductQueue q=new ProductQueue();
	
	Producer prod=new Producer(q);
	
	Consumer cons=new Consumer(q);
	cons.start();
	prod.start();
    }
}
