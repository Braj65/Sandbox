package com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.constants.Property;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.INode;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.highestRootNodes.HighRootNode;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.AbstractNodeStats;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.ldapNodeEntity.AbstractParentNodeStats;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.loaderFactory.LoaderFactory;

public class LoadHighRoots implements ILoadChildrenFromProp {
    private String rootFileName = null;
    private PropertiesConfiguration propConfigs;

    public LoadHighRoots(String propFileName) {
	rootFileName=propFileName;
	File rootFile = new File(Property.Value.ROOT_CATEGORIES.getString());
	try {
	    propConfigs = new PropertiesConfiguration(rootFile);
	    LoaderFactory.registerPropLoader(rootFileName, this);
	} catch (ConfigurationException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    
    @Override
    public void createChildObjectsFromChildFile(List<INode> childNodes) {
	Iterator<String> iter = propConfigs.getKeys();
	String highRootNode;
	while (iter.hasNext()) {
	    highRootNode = iter.next();
	    childNodes.add(new HighRootNode(new AbstractParentNodeStats.Builder()
		    .setNodeStats(createNewNodeStats(propConfigs.getList(highRootNode), highRootNode))
		    .setLdapFile((String) propConfigs.getList(highRootNode).get(1))
		    .setStatus((String) propConfigs.getList(highRootNode).get(2)).build()));
	    propConfigs.clearProperty(highRootNode);
	}
    }

    private INodeStats createNewNodeStats(List<Object> categories, String category) {
	return new AbstractNodeStats.Builder().setNodeName(category)
		.setNodeId(Long.parseLong((String) categories.get(0))).build();

    }

    @Override
    public void writeToFile(String fullAncestorName, String nodeId) {
	propConfigs.setProperty(fullAncestorName, nodeId);
	try {
	    propConfigs.save();
	} catch (ConfigurationException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    @Override
    public void createNewFile(String newFileName) {
	// TODO Auto-generated method stub
    }
    
    @Override
    public void clearPropertyFile(){
	propConfigs.clear();
	PrintWriter writer=null;
	try {
	    writer = new PrintWriter(propConfigs.getFile());
	    writer.print("");
	    writer.close();
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	}	
    }

    @Override
    public void savePropertyFile() {
	// TODO Auto-generated method stub
	
    }
}
