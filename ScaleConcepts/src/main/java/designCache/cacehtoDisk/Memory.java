package designCache.cacehtoDisk;

public enum Memory {
    
    INMEM{

	@Override
	boolean getStat() {
	    return true;
	}
	
    },
    ONDISK{

	@Override
	boolean getStat() {
	    return true;
	}
	
    };
    
    abstract boolean getStat();
}
