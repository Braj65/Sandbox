package concurrency.executor.defaultpooltweaks.twk1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public class CustomThreadFactoryBuilder {
    
    private int trPriority=Thread.NORM_PRIORITY;
    private String trPrefix=null;
    private Boolean trDaemon=false;
    
    public CustomThreadFactoryBuilder setNamePrefix(String prefix){
	if(prefix==null)
	    throw new NullPointerException();
	this.trPrefix=prefix;
	return this;
    }
    
    public CustomThreadFactoryBuilder setPriority(Integer priority){
	if(priority==null)
	    trPriority=Thread.MIN_PRIORITY;
	if(priority>Thread.MAX_PRIORITY)
	    throw new IllegalArgumentException();
	this.trPriority=priority;
	return this;
    }
    
    public CustomThreadFactoryBuilder setDaemon(Boolean daemon){
	if(daemon==null){
	    trDaemon=false;
	    return this;
	}
	this.trDaemon=daemon;
	return this;	    
    }
    
    public ThreadFactory build(){
	return build(this);
    }
    
    public ThreadFactory build(CustomThreadFactoryBuilder cust){
	final String prefix=cust.trPrefix;
	final Boolean daemon=cust.trDaemon;
	final Integer priority=cust.trPriority;
	
	final AtomicLong count=new AtomicLong(0);
	
	return new ThreadFactory(){

	    @Override
	    public Thread newThread(Runnable r) {
		Thread tr=new Thread(r);
		tr.setPriority(priority);
		tr.setDaemon(daemon);
		tr.setName(prefix+"-"+count.incrementAndGet());
		return tr;
	    }	    
	};
    }

}
