package com.amzn.model.utility;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import com.amzn.model.constants.Property;
import com.amzn.model.nodes.INode;
import com.amzn.model.nodes.childnodes.ChildNode;

public class LoadLeafChildren {
    
    private PropertiesConfiguration childNodeProperties=null;
    
    public LoadLeafChildren(){
	childNodeProperties=new PropertiesConfiguration();
    }
    
    public void loadLeafNodesFromLdap(List<INode> childNodes,String fullLdapName){
	try {
	    if(ifLoadedChildNodesDifferentPromPreviousLoad(fullLdapName))
		childNodeProperties.load(getLdapFile(fullLdapName));
	} catch (ConfigurationException e) {
	    e.printStackTrace();
	}
	iterateAndLoadLeafNodes(childNodes, fullLdapName);
    }
    
    public boolean ifLoadedChildNodesDifferentPromPreviousLoad(String fullLdapName){
	return (childNodeProperties.isEmpty() || 
		    !ifReceivedFullLdapNameHasRootLdapSameAsInThePrevLoadedProp(fullLdapName));
    }
    
    public boolean ifReceivedFullLdapNameHasRootLdapSameAsInThePrevLoadedProp(String fullLdapName){
	return childNodeProperties.getFile().getName()
		    .contains(fullLdapName.substring(0, fullLdapName.indexOf(".")));
    }
    
    public void iterateAndLoadLeafNodes(List<INode> childNodes, String fullLdapName){
	Iterator<String> iter=childNodeProperties.getKeys();
	String key;
	while(iter.hasNext()){
	    key=iter.next();
	    if(key.contains(fullLdapName) && keyIsFirstBornOf(key, fullLdapName)){
		INode leafNode=new ChildNode(key, childNodeProperties.getLong(key));
		childNodes.add(leafNode);
	    }
	}
    }
    
    public boolean keyIsFirstBornOf(String child, String parentLdap){
	return child.split("\\.").length-parentLdap.split("\\.").length==1;
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
    
    
    
    
    
    /*public LeafChildProperties getLeafPropConfig(String fullLdapName){
	if(leafPropertiesFile!=null && leafPropertiesFile.getLeafFile().equals(getLdapFile(fullLdapName)))
	    return leafPropertiesFile;
	return null;
    }*/
}
