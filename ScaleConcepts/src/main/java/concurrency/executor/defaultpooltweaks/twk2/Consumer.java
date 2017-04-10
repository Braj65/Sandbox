package concurrency.executor.defaultpooltweaks.twk2;

public class Consumer implements Runnable{

    private String name=null;
    public Consumer(String n){
	name=n;
    }
    
    public String getName(){
	return this.name;
    }
    
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
