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
import com.amzn.model.nodes.nodeEntity.AbstractNodeStats;
import com.amzn.model.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodes.nodeEntity.NodeStats;

public class FetchFromPropertyFile {
    private static final String NODE_COVERED="Covered";
    private PropertiesConfiguration nodeProperties=null;
    private PropertiesConfigurationLayout layout=null;
    private File rootFile=null;
    
    public INodeStats loadOneHighestCat(){
	String category="";
	try{
	    rootFile=new File(Property.Value.ROOT_CATEGORIES.getString());
	    nodeProperties=new PropertiesConfiguration(rootFile); 
	    Iterator<String> iter=nodeProperties.getKeys();
	    List<Object> categories=new ArrayList<Object>();
	    
	    while(iter.hasNext()){
		category=iter.next();
		categories=nodeProperties.getList(category);
		if(categories.get(1).equals(NODE_COVERED))
		    continue;
		else
		    break;		
	    }	    
	    
	    if(categories.get(1).equals(NODE_COVERED)){
		return AbstractNodeStats.getNullNode();
	    }else
		return new AbstractNodeStats.Builder()
			.setNodeName(category)
			.setNodeId((String)categories.get(0))
			.setLdapFile((String)categories.get(1))
			.setStatus((String)categories.get(2))
			.build();
		
	}catch(Exception e){
	    e.printStackTrace();
	}
	
	return AbstractNodeStats.getNullNode();
    }
    
    public Map<String, Boolean> getAllLdaps(String ldapFileName){
	Map<String, Boolean> ldapMap=new HashMap<String, Boolean>();
	File ldpapPath=new File(Property.getFilePathFromLdap(ldapFileName));
	String ldapKey="";
	
	nodeProperties.clear();
	try {
	    nodeProperties.load(ldpapPath);
	    Iterator<String> iter=nodeProperties.getKeys();
	    while(iter.hasNext()){
		ldapKey=iter.next();
		ldapMap.put(ldapKey, nodeProperties.getBoolean(ldapKey));
	    }
	} catch (ConfigurationException e) {
	    e.printStackTrace();
	}
	return ldapMap;
    }
    
    public void markAsCovered(NodeStats overrideNode){
	try {
	    FileWriter fw=new FileWriter(Property.Value.ROOT_CATEGORIES.getString());
	    layout=nodeProperties.getLayout();
	    nodeProperties.setProperty(overrideNode.getNodeName(), overrideNode.getNodeId()+", "+
		    	overrideNode.getLdapFile()+", "+overrideNode.getStatus());
	    nodeProperties.save(fw);
	    File destFile=new File(Property.Value.WRITEROOT_CATEGORIES.getString());
	    FileUtils.copyFile(rootFile, destFile);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
}
