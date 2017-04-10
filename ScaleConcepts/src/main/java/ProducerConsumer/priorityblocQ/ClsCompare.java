package ProducerConsumer.priorityblocQ;

import java.util.Comparator;

public class ClsCompare implements Comparable<ClsCompare>{
    
    Integer x;
    
    public ClsCompare(Integer y){
	x=y;
    }
    
    public int get(){
	return this.x;
    }

    public int compare(Integer o1, Integer o2) {
	return o1.compareTo(o2);
    }

    public int compareTo(ClsCompare paramT) {
	return this.x-paramT.x;
    }   

}
