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
import com.amzn.model.nodes.nodeEntity.ldapNodeEntity.AbstractLdapNodeStats;

public class FetchFromPropertyFile {
    private static final String NODE_COVERED="Covered";
    private PropertiesConfiguration nodeProperties=null;
    private PropertiesConfigurationLayout layout=null;
    private File rootFile=null;
    
    public AbstractLdapNodeStats loadOneHighestCat(){
	String category="";
	try{
	    rootFile=new File(Property.Value.ROOT_CATEGORIES.getString());
	    nodeProperties=new PropertiesConfiguration(rootFile); 
	    return rootNodeParameters();
		
	}catch(Exception e){
	    e.printStackTrace();
	}
	return AbstractLdapNodeStats.getNullLdapNode();
    }
    
    public AbstractLdapNodeStats rootNodeParameters(){
	String rootNode=null;
	Iterator<String> iter=nodeProperties.getKeys();
	while(iter.hasNext()){
	    rootNode=iter.next();
	    if(nodeProperties.getList(rootNode).get(2).equals(NODE_COVERED))
		continue;
	    else
		break;		
	}
	if(nodeProperties.getList(rootNode).get(2).equals(NODE_COVERED))
	    return AbstractLdapNodeStats.getNullLdapNode();
	else
	    return new AbstractLdapNodeStats.Builder()
			.setNodeStats(createNewNodeStats(nodeProperties.getList(rootNode), rootNode))
			.setLdapFile((String)nodeProperties.getList(rootNode).get(1))
			.setStatus((String)nodeProperties.getList(rootNode).get(2))
			.build();
    }
    
    public void createLdapObjectsFromLdapFileLoadToMap(List<INode> childNodes, String ldapFileName){
	File ldpapPath=new File(Property.getFilePathFromLdap(ldapFileName));
	String ldapKey="";
	
	nodeProperties.clear();
	try {
	    nodeProperties.load(ldpapPath);
	    Iterator<String> iter=nodeProperties.getKeys();
	    while(iter.hasNext()){
		ldapKey=iter.next();
		INode child=new LdapChild(ldapKey, nodeProperties.getBoolean(ldapKey));
		if(nodeProperties.getBoolean(ldapKey))
		    childNodes.add(child);
	    }
	} catch (ConfigurationException e) {
	    e.printStackTrace();
	}
    }
    
    public void markAsCovered(AbstractLdapNodeStats overrideNode){
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
