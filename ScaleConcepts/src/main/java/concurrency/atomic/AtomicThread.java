package concurrency.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicThread extends Thread{
    
    private int myCounter;
    private int myPrevCounter;
    private int myCounterPlusFive;
    private boolean isNine;
    private AtomicInteger at=null;
   
    public AtomicThread(AtomicInteger a){
	at=a;
    }
    
    public void run(){
	System.out.println();
	myCounter=at.incrementAndGet();
	System.out.println("Thread "+Thread.currentThread().getId()+" -Counter "+myCounter);
	myPrevCounter=at.getAndIncrement();
	System.out.println("Thread "+Thread.currentThread().getId()+" -Previous "+myPrevCounter);
	myCounterPlusFive=at.addAndGet(5);
	System.out.println("Thread "+Thread.currentThread().getId()+" -plus five "+myCounterPlusFive);
	isNine=at.compareAndSet(9, 3);
	if(isNine){
	    System.out.println("Thread "+Thread.currentThread().getId()+" -val was equal"
	    	+ "to 9 so updated to "+at.intValue());
	}
    }

}
