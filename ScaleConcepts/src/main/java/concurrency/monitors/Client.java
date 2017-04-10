package concurrency.monitors;

public class Client {
    
    public static void main(String[] args) {
	ProductQueue pq=new ProductQueue();
	Producer prod=new Producer(pq);
	Consumer cons=new Consumer(pq);
	
	cons.start();
	prod.start();
	
    }

}
