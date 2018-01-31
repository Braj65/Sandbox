package com.amzn.model.utility;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.configuration.PropertiesConfiguration;

import com.amzn.model.nodes.INode;

public abstract class AbstractLoadPropFiles {
    
    private PropertiesConfiguration childConfigs;
    
    public void createChildObjectsFromChildFile(List<INode> childNodes, String childFileName){
	Iterator<String> iter=childConfigs.getKeys();
	String key;
	while(iter.hasNext()){
	    key=iter.next();
	}
    }

}
