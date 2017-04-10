package concurrency.monitors.rentrantreadwrites;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public class CustThreadFactoryBuilder {
    
    private int trPriority=Thread.NORM_PRIORITY;
    private Boolean isDaemon=false;
    private String trPrefix=null;
    
    public CustThreadFactoryBuilder setPrefix(String pref){
	if(pref==null)
	    throw new NullPointerException();
	this.trPrefix=pref;
	return this;
    }
    
    public CustThreadFactoryBuilder setPriority(int prio){
	if(prio==trPriority)
	    this.trPriority=Thread.MIN_PRIORITY;
	if(prio>Thread.MAX_PRIORITY)
	    throw new IllegalArgumentException();
	this.trPriority=prio;
	return this;
    }
    
    public CustThreadFactoryBuilder setDaemon(boolean stat){
	this.isDaemon=stat;
	return this;
    }
    
    public ThreadFactory build(){
	return build(this);
    }
    
    public ThreadFactory build(CustThreadFactoryBuilder cust){
	final String prefix=cust.trPrefix;
	final Integer priority=cust.trPriority;
	final Boolean isDaemon=cust.isDaemon;
	
	final AtomicLong count=new AtomicLong(0);
	
	return new ThreadFactory(){
	    @Override
	    public Thread newThread(Runnable r) {
		Thread tr=new Thread(r);
		if(priority!=null)
		    tr.setPriority(priority);
		if(prefix!=null)
		    tr.setName(prefix+"-"+count.incrementAndGet());
		if(isDaemon!=null)
		    tr.setDaemon(isDaemon);
		return tr;
	    }
	    
	};
    }
    
    

}
