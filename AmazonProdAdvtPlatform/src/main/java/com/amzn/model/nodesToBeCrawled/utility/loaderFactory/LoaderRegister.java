package com.amzn.model.nodesToBeCrawled.utility.loaderFactory;

import java.util.HashMap;
import java.util.Map;

import com.amzn.model.nodesToBeCrawled.utility.ILoadChildrenFromProp;

public class LoaderRegister {
    
    private Map<String, ILoadChildrenFromProp> pool=new HashMap<String, ILoadChildrenFromProp>();
    
    public void register(String str, ILoadChildrenFromProp propLoadCLass){
	pool.put(str, propLoadCLass);
    }
    
    public ILoadChildrenFromProp getPropLoader(String str){
	if(pool.containsKey(str))
	    return pool.get(str);
	else{
	    System.out.println("Prop loader for the particular file name "+str+" doesn't exists");
	    throw new RuntimeException("Prop loader Not present");
	}
    }
    
    public void clearPropLoader(String str){
	pool.remove(str);
    }
}
