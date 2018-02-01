package com.amzn.model.utility;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

import com.amzn.model.constants.Property;
import com.amzn.model.nodes.INode;
import com.amzn.model.nodes.highestRootNodes.HighRootNode;
import com.amzn.model.nodes.nodeEntity.AbstractNodeStats;
import com.amzn.model.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodes.nodeEntity.ldapNodeEntity.AbstractParentNodeStats;
import com.amzn.model.utility.loaderFactory.LoaderFactory;

public class LoadHighRoots implements ILoadChildrenFromProp {
    private File rootFile = null;
    // find a way to share the same Properties config between all the objects of
    // same child level
    // If the child has different file to laod properties config from then only
    // load the other file
    // else reuse the existing config object. Same what we have done in loading
    // leafChildren class
    private PropertiesConfiguration propConfigs;

    public LoadHighRoots(String propFileName) {
	rootFile = new File(Property.Value.ROOT_CATEGORIES.toString());
	try {
	    propConfigs = new PropertiesConfiguration(rootFile);
	    LoaderFactory.registerPropLoader(propFileName, this);
	} catch (ConfigurationException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    
    @Override
    public void createChildObjectsFromChildFile(List<INode> childNodes, String childFileName) {
	// TODO Auto-generated method stub
	
    }

    public void createChildObjectsFromChildFilex(List<INode> childNodes, PropertiesConfiguration prop) {
	Iterator<String> iter = propConfigs.getKeys();
	String highRootNode;
	while (iter.hasNext()) {
	    highRootNode = iter.next();
	    childNodes.add(new HighRootNode(new AbstractParentNodeStats.Builder()
		    .setNodeStats(createNewNodeStats(propConfigs.getList(highRootNode), highRootNode))
		    .setLdapFile((String) propConfigs.getList(highRootNode).get(1))
		    .setStatus((String) propConfigs.getList(highRootNode).get(2)).build()));
	}
    }

    private INodeStats createNewNodeStats(List<Object> categories, String category) {
	return new AbstractNodeStats.Builder().setNodeName(category)
		.setNodeId(Long.parseLong((String) categories.get(0))).build();

    }

    public PropertiesConfiguration getPropConfigObj() {
	return propConfigs;
    }

    @Override
    public void setLeafNodeProperties(PropertiesConfiguration prevPropertiesConfig) {
	// TODO Auto-generated method stub
	
    }
}
