package concurrency.monitors.uniquereentrant;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TaskRunner {
    
    public Map<Class<? extends Runnable>, ReadWriteLock> mLocks=
	    new ConcurrentHashMap<Class<? extends Runnable>, ReadWriteLock>();
    
    public void runTaskUniquely(Runnable r, int secondsToWait) throws Exception{
	ReadWriteLock l=getLock(r.getClass());
	boolean acquired=l.writeLock().tryLock(5000, TimeUnit.MILLISECONDS);
	if(acquired){
	    try{
		r.run();
	    }finally{
		l.writeLock().unlock();
	    }
	}
    }
    
    private synchronized ReadWriteLock getLock(Class clazz){
	ReadWriteLock l=mLocks.get(clazz);
	if(l==null){
	    l=new ReentrantReadWriteLock();
	    mLocks.put(clazz, l);
	}
	return l;
    }

}
