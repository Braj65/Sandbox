package com.amzn.model.utility;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import com.amzn.model.constants.Property;

public class LoadLeafChildren {
    
    private PropertiesConfiguration childNodeProperties=null;
    private Map<String, Long> leafNodeIds;
    
    public LoadLeafChildren(){
	childNodeProperties=new PropertiesConfiguration();
	leafNodeIds=new HashMap<String, Long>();
    }
    
    public Map<String, Long> loadRequiredChildren(String fullLdapName){
	try {
	    if(childNodeProperties.isEmpty() || 
		    !childNodeProperties.getFile().getName()
		    .contains(fullLdapName.substring(0, fullLdapName.indexOf("."))))
		childNodeProperties.load(getLdapFile(fullLdapName));
	} catch (ConfigurationException e) {
	    e.printStackTrace();
	}
	
	Iterator<String> iter=childNodeProperties.getKeys();
	String key;
	while(iter.hasNext()){
	    key=iter.next();
	    if(key.contains(fullLdapName) && keyIsFirstBornOf(key, fullLdapName)){
		leafNodeIds.put(key, Long.parseLong(childNodeProperties.getString(key)));
	    }
	}
	return leafNodeIds;
    }
    
    public File getLdapFile(String fullLdapName){
	return new File(Property.getChildNodePath()+
		fullLdapName.substring(0, fullLdapName.indexOf("."))+".properties");
    }
    
    public PropertiesConfiguration getLeafNodeProperties(){
	return childNodeProperties;
    }
    
    public void setLeafNodeProperties(PropertiesConfiguration prevPropertiesConfig){
	this.childNodeProperties=prevPropertiesConfig;
    }
    
    public boolean keyIsFirstBornOf(String child, String parentLdap){
	String[] splitChild=child.split("\\.");
	String[] splitParent=parentLdap.split("\\.");
	return splitChild.length-splitParent.length==1;
    }
    
    /*public LeafChildProperties getLeafPropConfig(String fullLdapName){
	if(leafPropertiesFile!=null && leafPropertiesFile.getLeafFile().equals(getLdapFile(fullLdapName)))
	    return leafPropertiesFile;
	return null;
    }*/
}
