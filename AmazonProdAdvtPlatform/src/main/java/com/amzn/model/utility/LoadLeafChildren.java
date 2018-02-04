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
import com.amzn.model.utility.loaderFactory.LoaderFactory;

public class LoadLeafChildren implements ILoadChildrenFromProp{
    
    private PropertiesConfiguration childNodeProperties=null;
    private String fullLdapName;
    public LoadLeafChildren(String propFileName){
	try {
	    childNodeProperties=new PropertiesConfiguration(getChildFile(propFileName));
	    LoaderFactory.registerPropLoader(propFileName, this);
	} catch (ConfigurationException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    
/*    public void loadLeafNodesFromLdap(List<INode> childNodes,String fullLdapName){
	try {
	    if(ifLoadedChildNodesDifferentPromPreviousLoad(fullLdapName))
		childNodeProperties.load(getLdapFile(fullLdapName));
	} catch (ConfigurationException e) {
	    e.printStackTrace();
	}
	createChildObjectsFromChildFile(childNodes, fullLdapName);
    }*/
    
    /*public boolean ifLoadedChildNodesDifferentPromPreviousLoad(String fullLdapName){
	return (childNodeProperties.isEmpty() || 
		    !ifReceivedFullLdapNameHasRootLdapSameAsInThePrevLoadedProp(fullLdapName));
    }
    
    public boolean ifReceivedFullLdapNameHasRootLdapSameAsInThePrevLoadedProp(String fullLdapName){
	return childNodeProperties.getFile().getName()
		    .contains(fullLdapName.substring(0, fullLdapName.indexOf(".")));
    }*/
    
    public void preCreateChildObjects(List<INode> childNodes, String fullLdapName){
	this.fullLdapName=fullLdapName;
	createChildObjectsFromChildFile(childNodes);
    }
    
    //Netx improvement. Create all childNode in first visit. Then in subsequent visits based on
    //the dlap name, based on some part of ldap name, all childnodes created earlier will be
    //transfered from that repo to current list of childnodes of the ldap object
    //So the childnodes created in the first time needs to be created and categorized in a manner such
    //that all child which may belong too same ldap parent are in one bin
    //After visitng the last ldap object we may discard the bin.    
    public void createChildObjectsFromChildFile(List<INode> childNodes){
	Iterator<String> iter=childNodeProperties.getKeys();
	String key;
	while(iter.hasNext()){
	    key=iter.next();
	    if(key.contains(fullLdapName) && keyIsFirstBornOf(key, fullLdapName)){
		INode leafNode=new ChildNode(key, childNodeProperties.getLong(key));
		childNodes.add(leafNode);
		childNodeProperties.clearProperty(key);
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
    
    public File getChildFile(String childFileName){
	return new File(Property.getChildNodePath()+childFileName);
    }
    
    /*public LeafChildProperties getLeafPropConfig(String fullLdapName){
	if(leafPropertiesFile!=null && leafPropertiesFile.getLeafFile().equals(getLdapFile(fullLdapName)))
	    return leafPropertiesFile;
	return null;
    }*/
}
