package designCache.lrucache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//http://java2s.com/Tutorials/Java/Java_Collections/Tutorial_for_LinkedHashMap.htm
//https://www.tutorialspoint.com/java/java_linkedhashmap_class.htm
//https://www.tutorialspoint.com/java/util/linkedhashmap_removeeldestentry.htm
public class LRULinkedHashMap {
	
	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> map=new LinkedHashMap<Integer, Integer>(3, 0.75f ,true){
		
		protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest){
			return size()>3;
		}
		};
		map.put(1, 10);
		map.put(2, 12);
		map.put(3, 14);
		map.put(4, 16);
		map.put(4, 18);
		System.out.println(map);
		map.get(3);
		System.out.println(map);
		Set<Integer> x=map.keySet();
		ArrayList<Integer> l=new ArrayList<Integer>(x);
		Collections.reverse(l);
		System.out.println(l.get(0));
	}

}
