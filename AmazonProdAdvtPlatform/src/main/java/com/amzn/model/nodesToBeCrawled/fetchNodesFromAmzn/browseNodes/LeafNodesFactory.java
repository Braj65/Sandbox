package com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.browseNodes;

import java.util.HashMap;
import java.util.Map;

public class LeafNodesFactory {
    
    private static Map<String,String> repo=new HashMap<String, String>();
    
    protected static void addToRepo(String key, String value){
	String newVal=value;
	if(repo.containsKey(key)){
	    newVal=repo.get(key)+"\n"+value;
	    repo.put(key,"");
	}
	repo.put(key, newVal);
    }
    
    protected static void clearKey(String key){
	repo.remove(key);	
    }
    
    protected static String getValue(String key){
	return repo.get(key);
    }

}
