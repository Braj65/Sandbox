package ProducerConsumer.Simple.Myproducer;

import java.util.LinkedList;
import java.util.Queue;

import ProducerConsumer.Simple.Myconsumer.Consumer;



public class Client extends Thread{
    
    public static void main(String[] args) {
	Client c=new Client();
	c.run();
    }
    
    public void run(){
	Queue<String> q=new LinkedList<String>();
	Consumer cons=new Consumer(q);
	cons.start();
	Producer prod=new Producer(q);
	prod.start();
    }
    

}
