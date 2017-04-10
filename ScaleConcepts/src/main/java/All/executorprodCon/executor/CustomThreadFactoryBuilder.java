package All.executorprodCon.executor;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public class CustomThreadFactoryBuilder {
    
    private int priority=Thread.NORM_PRIORITY;
    private String trNamePrefix=null;
    private boolean daemon=false;
    
    public CustomThreadFactoryBuilder setNamePrefix(String prefix){
	if(prefix==null){
	    throw new NullPointerException();
	}
	this.trNamePrefix=prefix;
	return this;
    }
    
    public CustomThreadFactoryBuilder setPriority(int prio){
	if(prio==priority){
	    priority=Thread.MIN_PRIORITY;
	}
	if(prio>Thread.MAX_PRIORITY)
	    throw new IllegalArgumentException("Priority can't be higher than "+Thread.MAX_PRIORITY);
	this.priority=prio;
	return this;
    }
    
    public CustomThreadFactoryBuilder setDaemon(boolean dae){
	this.daemon=dae;
	return this;
    }
    
    public ThreadFactory build(){
	return build(this);
    }
    
    public ThreadFactory build(CustomThreadFactoryBuilder fact){
	final String prefix=fact.trNamePrefix;
	final Boolean daemon=fact.daemon;
	final Integer priority=fact.priority;
	
	final AtomicLong count=new AtomicLong(0);
	
	return new ThreadFactory(){

	    @Override
	    public Thread newThread(Runnable r) {
		Thread t=new Thread(r);
		if(prefix!=null)
		    t.setName(prefix+"-"+count.incrementAndGet());
		if(daemon!=null)
		    t.setDaemon(daemon);
		if(priority!=null)
		    t.setPriority(priority);
		return t;
	    }
	    
	};
    }

}
