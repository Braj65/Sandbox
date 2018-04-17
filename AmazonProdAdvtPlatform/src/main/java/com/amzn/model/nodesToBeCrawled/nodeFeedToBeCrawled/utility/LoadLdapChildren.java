package com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.PropertiesConfigurationLayout;

import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.constants.Property;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.INode;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.ldapchilds.LdapChild;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.AbstractNodeStats;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.ldapNodeEntity.AbstractParentNodeStats;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.loaderFactory.LoaderFactory;

public class LoadLdapChildren implements ILoadChildrenFromProp {
    private PropertiesConfiguration nodeProperties = null;
    private PropertiesConfigurationLayout layout = null;
    private String rootFileName = null;

    public LoadLdapChildren(String propFileName) {
	rootFileName=propFileName;
	File rootFile=new File(Property.getFilePathFromLdap(rootFileName));
	try {
	    nodeProperties = new PropertiesConfiguration(rootFile);
	    LoaderFactory.registerPropLoader(rootFileName, this);
	} catch (ConfigurationException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    
    // If we can abstract it to a parent class. SInce this method is almost same
    // in LoadLeafChidren.
    // Pass an object of the respective class(LDap or child) and delegate the
    // creation back to the object
    // Since we will be passing the object reference in INode the object will
    // know which method to call
    // to create the object and return
    @Override
    public void createChildObjectsFromChildFile(List<INode> childNodes) {
	String ldapKey;
	Iterator<String> iter = nodeProperties.getKeys();
	while (iter.hasNext()) {
	    ldapKey = iter.next();
	    if (nodeProperties.getBoolean(ldapKey)) {
		INode child = new LdapChild(ldapKey, nodeProperties.getBoolean(ldapKey));
		childNodes.add(child);
	    }
	    nodeProperties.clearProperty(ldapKey);
	}
    }


    public void markAsCovered(AbstractParentNodeStats overrideNode) {
	try {
	    FileWriter fw = new FileWriter(Property.Value.ROOT_CATEGORIES.getString());
	    layout = nodeProperties.getLayout();
	    nodeProperties.setProperty(overrideNode.getNodeStats().getNodeName(),
		    overrideNode.getNodeStats().getNodeId() + ", " + overrideNode.getLdapFile() + ", "
			    + overrideNode.getStatus());
	    nodeProperties.save(fw);
	    File destFile = new File(Property.Value.WRITEROOT_CATEGORIES.getString());
//	    FileUtils.copyFile(rootFile, destFile);
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    public INodeStats createNewNodeStats(List<Object> categories, String category) {
	return new AbstractNodeStats.Builder().setNodeName(category)
		.setNodeId(Long.parseLong((String) categories.get(0))).build();
    }

    @Override
    public void writeToFile(String fullAncestorName, String nodeId) {
	nodeProperties.setProperty(fullAncestorName, nodeId);
	try {
	    nodeProperties.save();
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
	nodeProperties.clear();
	PrintWriter writer=null;
	try {
	    writer = new PrintWriter(nodeProperties.getFile());
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
