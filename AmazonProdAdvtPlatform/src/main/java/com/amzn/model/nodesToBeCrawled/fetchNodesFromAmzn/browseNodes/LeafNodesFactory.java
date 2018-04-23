package com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.browseNodes;

import java.util.HashMap;
import java.util.Map;

public class LeafNodesFactory {
    
    public static Map<String,String> repo=new HashMap<String, String>();
    
    public static void addToRepo(String key, String value){
	if(repo.containsKey(key)){
	    String newVal=repo.get(key)+"\n"+value;
	    repo.put(key,"");
	    repo.put(key, newVal);
	}else{
	    repo.put(key, value);
	}
    }
    
    public static void clearRepo(){
	repo.clear();
    }
    
    public static void clearKey(String key){
	if(repo.containsKey(key)){
	    repo.remove(key);
	}
    }
    
    public static String getValue(String key){
	return repo.get(key);
    }

}
