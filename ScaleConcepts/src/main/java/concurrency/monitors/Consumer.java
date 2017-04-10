package concurrency.monitors;

public class Consumer extends Thread{
    
    ProductQueue pq=null;
    
    public Consumer(ProductQueue p){
	pq=p;
	setName("Con thread");
    }
    
    public void run(){
	System.out.println();
	for(int i=0;i<3;i++){
	    pq.getProdFromQ();
	}
    }

}
