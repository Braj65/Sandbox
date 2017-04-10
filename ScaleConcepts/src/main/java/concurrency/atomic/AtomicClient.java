package concurrency.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicClient {
    
    public static void main(String[] args) {
	AtomicInteger a=new AtomicInteger(0);
	AtomicThread t1=new AtomicThread(a);
	AtomicThread t2=new AtomicThread(a);
	t1.start();
	t2.start();
    }

}
