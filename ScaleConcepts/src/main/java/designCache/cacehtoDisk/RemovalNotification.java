package designCache.cacehtoDisk;

public class RemovalNotification<Key, Value> {
    
    private Key k;
    private Value v;
    private int frequency;
    private final RemovalCause cause;
    
    public static <Key, Value> RemovalNotification<Key, Value> create(Key k, Value v,
	    int frequency, RemovalCause cause){
	return new RemovalNotification(k, v, frequency, cause);
    }
    
    private RemovalNotification(Key k, Value v, int frequency, RemovalCause cas){
	this.k=k;
	this.v=v;
	this.frequency=frequency;
	this.cause=cas;
    }
    
    public RemovalCause getCause(){
	return cause;
    }
    
    public Key getKey(){
	return k;
    }
    
    public Value getValue(){
	return v;
    }
    
    public int getFreq(){
	return frequency;
    }

}
