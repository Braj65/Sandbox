package concurrency.semaphores.bounded;

import java.util.concurrent.Semaphore;

public class Activity extends Thread{
    
    Semaphore smp=null;
    public Activity(Semaphore sph, String name){
	smp=sph;
	setName("name "+name);
    }
    
    public void run(){
	System.out.println();
	for(int i=0;i<2;i++){
	    try{
		    smp.acquire();
		    System.out.println("In critical");
		    critical(i);
		}catch(Exception e){
		    e.printStackTrace();	
		}finally{
		   smp.release();
		}   
	}
	for(int i=0;i<2;i++){
	    try{
		System.out.println("In non critical");
		noncritical(i);
	    }catch(Exception e){
		e.printStackTrace();
	    }
	}
		    
		
    }
    
    public void critical(int loop) throws Exception{
	System.out.println("Critical start- "+loop+" "+Thread.currentThread().getName());
	System.out.println("critikal1");
	Thread.sleep(500);
	System.out.println("Critical end- "+loop+" "+Thread.currentThread().getName());
	
	    /*for(int i=0;i<5;i++){
		 Thread.sleep(500);   
	    }*/
//	System.out.println("critikal2");
    }
    
    public void noncritical(int loop) throws Exception{
	System.out.println("NonCritical start- "+loop+" "+Thread.currentThread().getName());
	System.out.println("critikal1");
	Thread.sleep(500);   
	System.out.println("NonCritical end- "+loop+" "+Thread.currentThread().getName());
    }

}
