package concurrency.executor.defaultpooltweaks.twk2;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DynamicBlockingQueue<E> implements TransferQueue<E>{
    private Lock mLock=new ReentrantLock();
    private final TransferQueue<E> delegate;
    private ThreadPoolExecutor exec;
    
    public DynamicBlockingQueue(final TransferQueue<E> delegate){
	this.delegate=delegate;
    }

    @Override
    public boolean offer(E o) {
	//If there are waiting threads, transfer to the tread directly
	boolean inserted=tryTransfer(o);
	if(!inserted){
	    final Lock lock=this.mLock;
	    lock.lock();
	    try{
		//Add to queue only, If pool size is reached max pool size allowed
		if(exec.getPoolSize()==exec.getMaximumPoolSize()){
		    inserted=this.delegate.offer(o);
		}else
		    inserted=false;
	    }finally{
		lock.unlock();
	    }
	}
	return inserted;
    }
    
    public void setExecutor(ThreadPoolExecutor ex){
	exec=ex;
    }
    
    @Override
    public boolean add(E e) {
	return this.delegate.add(e);
    }

    @Override
    public E remove() {
	return this.delegate.remove();
    }

    @Override
    public E poll() {
	return this.delegate.poll();
    }

    @Override
    public E element() {
	return this.delegate.element();
    }

    @Override
    public E peek() {
	return this.delegate.peek();
    }

    @Override
    public int size() {
	return this.delegate.size();
    }

    @Override
    public boolean isEmpty() {
	return this.delegate.isEmpty();
    }

    @Override
    public Iterator<E> iterator() {
	return this.delegate.iterator();
    }

    @Override
    public Object[] toArray() {
	return this.delegate.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
	return this.delegate.toArray(a);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
	return this.delegate.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
	return this.delegate.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
	return this.delegate.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
	return this.delegate.retainAll(c);
    }

    @Override
    public void clear() {
	this.delegate.clear();
    }

    @Override
    public void put(E e) throws InterruptedException {
	this.delegate.put(e);
    }

    @Override
    public boolean offer(E e, long timeout, TimeUnit unit) throws InterruptedException {
	return this.delegate.offer(e, timeout, unit);
    }

    @Override
    public E take() throws InterruptedException {
	return this.delegate.take();
    }

    @Override
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
	return this.delegate.poll(timeout, unit);
    }

    @Override
    public int remainingCapacity() {
	return this.delegate.remainingCapacity();
    }

    @Override
    public boolean remove(Object o) {
	return this.delegate.remove(o);
    }

    @Override
    public boolean contains(Object o) {
	return this.delegate.contains(o);
    }

    @Override
    public int drainTo(Collection<? super E> c) {
	return this.delegate.drainTo(c);
    }

    @Override
    public int drainTo(Collection<? super E> c, int maxElements) {
	return this.delegate.drainTo(c, maxElements);
    }

    @Override
    public boolean tryTransfer(E e) {
	return this.delegate.tryTransfer(e);
    }

    @Override
    public void transfer(E e) throws InterruptedException {
	this.delegate.transfer(e);
    }

    @Override
    public boolean tryTransfer(E e, long timeout, TimeUnit unit) throws InterruptedException {
	return this.delegate.tryTransfer(e, timeout, unit);
    }

    @Override
    public boolean hasWaitingConsumer() {
	return this.delegate.hasWaitingConsumer();
    }

    @Override
    public int getWaitingConsumerCount() {
	return this.delegate.getWaitingConsumerCount();
    }

}
