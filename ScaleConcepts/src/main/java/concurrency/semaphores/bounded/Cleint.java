package concurrency.semaphores.bounded;

import java.util.concurrent.Semaphore;

public class Cleint {
    public static void main(String[] args) {
	Semaphore smp=new Semaphore(1);
	Activity a1=new Activity(smp, "Thread 1");
	a1.start();
	Activity a2=new Activity(smp, "Thread 2");
	
	a2.start();
    }

}
