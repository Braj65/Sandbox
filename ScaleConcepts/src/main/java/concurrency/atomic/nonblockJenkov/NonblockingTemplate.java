package concurrency.atomic.nonblockJenkov;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicStampedReference;

public class NonblockingTemplate {
    
    public static class IntendedModification{
	public AtomicBoolean completed=new AtomicBoolean(false);
    }
    
    private AtomicStampedReference<IntendedModification> ongoingMod=
	    new AtomicStampedReference<IntendedModification>(null, 0);
    
    public void modify(){
	while(!attemptedModifyASR());
    }
    
    public boolean attemptedModifyASR(){
	boolean modified=false;
	
	IntendedModification currentlyOngoingMod=ongoingMod.getReference();
	int stamp=ongoingMod.getStamp();
	
	if(currentlyOngoingMod==null){
	    //copy data structure state- for use in intended modification
	    
	    //prepare intended modification
	    IntendedModification newMod=new IntendedModification();
	    boolean modSubmitted=ongoingMod.weakCompareAndSet(null, newMod, stamp, stamp+1);
	    
	    if(modSubmitted){
		//complete modification via a series of compare-and-swap operations.
		//note: other threads may assist in completing the compare-and-swap
                // operations, so some CAS may fail
		modified=true;
	    }
	}else{
	  //attempt to complete ongoing modification, so the data structure is freed up
            //to allow access from this thread.
	    modified=false;
	}
	return modified;
    }

}
