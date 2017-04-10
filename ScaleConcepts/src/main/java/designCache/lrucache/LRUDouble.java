package designCache.lrucache;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ConcurrentHashMap;


public class LRUDouble {
    
    List<Segment> dlist=new LinkedList<Segment>();
    Map<Integer, Segment> mMap=new ConcurrentHashMap<Integer, Segment>();
    int capa=3;
    int N;
    
    public static void main(String[] args) {
	LRUDouble d=new LRUDouble(3);
	d.set(1, 10);
	d.set(2, 20);
	d.set(3, 30);
	d.get(2);
	d.get(3);
	d.set(4, 60);
	
    }
    
    public LRUDouble(int capa){
	this.capa=capa;
    }
    
    
    public Segment get(Integer key){
	if(mMap.containsKey(key)){
	    Segment s=mMap.get(key);
	    int pos=dlist.indexOf(s);
	    dlist.remove(pos);
	    dlist.add(0, s);
	    return s;
	}
	return null;
    }
    
    public void set(Integer key, int value){
	if(mMap.containsKey(key)){
	    Segment temp=mMap.get(key);
	    temp.value=value;
	    int pos=dlist.indexOf(temp);
	    dlist.remove(pos);
	    dlist.add(0, temp);
	}else if(capa==N){
	    int x=dlist.size()-1;
	    dlist.remove(x);
	    mMap.remove(dlist.get(x));
	    Segment seg=new Segment(key, value);
	    dlist.add(0, seg);
	    mMap.put(key, seg);
	}else{
	    Segment seg=new Segment(key, value);
	    dlist.add(0, seg);
	    mMap.put(key, seg);
	    ++N;
	}
	
    }
    
    class Segment{
	int key;
	int value;
	public Segment(int key, int val){
	    this.key=key;
	    this.value=val;
	}
    }

}
