package com.amzn.model.utility;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import com.amzn.model.nodes.INode;
import com.amzn.model.nodes.highestRootNodes.HighRootNode;
import com.amzn.model.nodes.nodeEntity.AbstractNodeStats;
import com.amzn.model.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodes.nodeEntity.ldapNodeEntity.AbstractParentNodeStats;

public class LoadHighRoots {
    private File rootFile=null;
    private PropertiesConfiguration propConfigs;
    
    public LoadHighRoots(){
	propConfigs=new PropertiesConfiguration();
    }
    
    public void createChildObjectsFromChildFile(List<INode> childNodes, String propFileName){
	rootFile=new File(propFileName);
	try {
	    propConfigs.load(rootFile);
	    Iterator<String> iter=propConfigs.getKeys();
	    String highRootNode;
	    while(iter.hasNext()){
		highRootNode=iter.next();
		childNodes.add(new HighRootNode(new AbstractParentNodeStats.Builder()
			.setNodeStats(createNewNodeStats(propConfigs.getList(highRootNode), highRootNode))
			.setLdapFile((String)propConfigs.getList(highRootNode).get(1))
			.setStatus((String)propConfigs.getList(highRootNode).get(2))
			.build()));
	    }
	} catch (ConfigurationException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}	
    }
    private INodeStats createNewNodeStats(List<Object> categories, String category) {
	return new AbstractNodeStats.Builder()
		.setNodeName(category)
		.setNodeId(Long.parseLong((String) categories.get(0)))
		.build();
    
    }
}
