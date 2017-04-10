package designCache.cacehtoDisk;

public enum RemovalCause {
    
    EXPLICIT{
	@Override
	boolean wasEvicted() {
	    // TODO Auto-generated method stub
	    return false;
	}	
    },
    REPLACED{

	@Override
	boolean wasEvicted() {
	    // TODO Auto-generated method stub
	    return false;
	}
	
    },
    COLLECTED{

	@Override
	boolean wasEvicted() {
	    // TODO Auto-generated method stub
	    return true;
	}
	
    },
    EXPIRED{

	@Override
	boolean wasEvicted() {
	    // TODO Auto-generated method stub
	    return true;
	}
	
    },
    SIZE{

	@Override
	boolean wasEvicted() {
	    // TODO Auto-generated method stub
	    return true;
	}
	
    };
    abstract boolean wasEvicted();

}
