package All.Pool;

import java.util.LinkedList;

public class WorkQueue {
    
    protected LinkedList queue=new LinkedList();
    protected int numberElementsInQueue=0;
    
    public synchronized void enqueue(Object anObject){
	queue.add(anObject);
	numberElementsInQueue++;
	notifyAll();
    }
    
    public synchronized Object dequeue(){
	if(numberElementsInQueue==0)
	    return null;
	Object returnObj=queue.remove(0);
	--numberElementsInQueue;
	return returnObj;
    }
    
    public synchronized Object dequeue(long aTimeOut){
	Object resource=dequeue();
	
	if(resource==null){
	    try{
		this.wait();
		resource=dequeue();
		return resource;
	    }catch(Exception e){
		e.printStackTrace();
	    }
	    
	}
	return resource;
    }

}
