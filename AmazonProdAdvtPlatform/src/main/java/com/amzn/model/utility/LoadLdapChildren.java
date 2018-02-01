package com.amzn.model.utility;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.PropertiesConfigurationLayout;
import org.apache.commons.io.FileUtils;

import com.amzn.model.constants.Property;
import com.amzn.model.nodes.INode;
import com.amzn.model.nodes.ldapchilds.LdapChild;
import com.amzn.model.nodes.nodeEntity.AbstractNodeStats;
import com.amzn.model.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodes.nodeEntity.NodeStats;
import com.amzn.model.nodes.nodeEntity.ldapNodeEntity.AbstractParentNodeStats;

public class LoadLdapChildren implements ILoadChildrenFromProp{
    private PropertiesConfiguration nodeProperties=null;
    private PropertiesConfigurationLayout layout=null;
    private File rootFile=null;
    
    public LoadLdapChildren(){
	nodeProperties=new PropertiesConfiguration();
    }
    
    //If we can abstract it to a parent class. SInce this method is almost same in LoadLeafChidren.
    //Pass an object of the respective class(LDap or child) and delegate the creation back to the object
    //Since we will be passing the object reference in INode the object will know which method to call
    //to create the object and return
    public void createChildObjectsFromChildFile(List<INode> childNodes, String ldapFileName){
	File ldpapPath=new File(Property.getFilePathFromLdap(ldapFileName));
	String ldapKey="";
	
	nodeProperties.clear();
	try {
	    nodeProperties.load(ldpapPath);
	    Iterator<String> iter=nodeProperties.getKeys();
	    while(iter.hasNext()){
		ldapKey=iter.next();
		if(nodeProperties.getBoolean(ldapKey)){
		    INode child=new LdapChild(ldapKey, nodeProperties.getBoolean(ldapKey));
		    childNodes.add(child);
		}
		    
	    }
	} catch (ConfigurationException e) {
	    e.printStackTrace();
	}
    }
    
    public void markAsCovered(AbstractParentNodeStats overrideNode){
	try {
	    FileWriter fw=new FileWriter(Property.Value.ROOT_CATEGORIES.getString());
	    layout=nodeProperties.getLayout();
	    nodeProperties.setProperty(overrideNode.getNodeStats().getNodeName(), overrideNode.getNodeStats().getNodeId()+", "+
		    	overrideNode.getLdapFile()+", "+overrideNode.getStatus());
	    nodeProperties.save(fw);
	    File destFile=new File(Property.Value.WRITEROOT_CATEGORIES.getString());
	    FileUtils.copyFile(rootFile, destFile);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    
    public INodeStats createNewNodeStats(List<Object> categories, String category){
	return new AbstractNodeStats.Builder()
		.setNodeName(category)
		.setNodeId(Long.parseLong((String) categories.get(0)))
		.build();
    }
}
