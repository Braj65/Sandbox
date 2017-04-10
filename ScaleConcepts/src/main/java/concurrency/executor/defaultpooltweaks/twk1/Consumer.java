package concurrency.executor.defaultpooltweaks.twk1;

public class Consumer implements Runnable{

    @Override
    public void run() {
	System.out.println();
	try{
	    while(true){
		System.out.println();
	    }
	}catch(Exception e){
	    e.printStackTrace();
	}
	
    }

}
