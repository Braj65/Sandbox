package com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.PropertiesConfiguration.PropertiesWriter;
import org.apache.commons.configuration.PropertiesConfigurationLayout;
import org.apache.commons.io.FileUtils;

import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.constants.Property;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.INode;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.childnodes.ChildNode;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.ldapchilds.AbstractLdapChild;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.loaderFactory.LoaderFactory;

public class LoadLeafChildren implements ILoadChildrenFromProp {

    private PropertiesConfiguration childNodeProperties = null;
    private PropertiesConfigurationLayout layout = null;
    private String fullLdapName;

    public LoadLeafChildren(String propFileName) {
	try {
	    childNodeProperties = new PropertiesConfiguration(getChildFile(propFileName));
	    layout = childNodeProperties.getLayout();
	    // preCreateChildObjects();
	    LoaderFactory.registerPropLoader(propFileName, this);
	} catch (ConfigurationException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    /*
     * public void loadLeafNodesFromLdap(List<INode> childNodes,String
     * fullLdapName){ try {
     * if(ifLoadedChildNodesDifferentPromPreviousLoad(fullLdapName))
     * childNodeProperties.load(getLdapFile(fullLdapName)); } catch
     * (ConfigurationException e) { e.printStackTrace(); }
     * createChildObjectsFromChildFile(childNodes, fullLdapName); }
     */

    /*
     * public boolean ifLoadedChildNodesDifferentPromPreviousLoad(String
     * fullLdapName){ return (childNodeProperties.isEmpty() ||
     * !ifReceivedFullLdapNameHasRootLdapSameAsInThePrevLoadedProp(fullLdapName)
     * ); }
     * 
     * public boolean
     * ifReceivedFullLdapNameHasRootLdapSameAsInThePrevLoadedProp(String
     * fullLdapName){ return childNodeProperties.getFile().getName()
     * .contains(fullLdapName.substring(0, fullLdapName.indexOf("."))); }
     */

    public void preCreateChildObjects(List<INode> childNodes, String fullLdapName) {
	this.fullLdapName = fullLdapName;
	createChildObjectsFromChildFile(childNodes);

    }

    /*
     * public void beforeCreatingChildObjects(AbstractLdapChild ldap){
     * this.fullLdapName=ldap.parentCategory; if(ldap.toBeCrawled){
     * newCreateChildObjectsFromChildren(ldap.children); }
     * childNodeProperties.clearProperty(ldap.parentCategory); }
     * 
     * public void newCreateChildObjectsFromChildren(List<INode> childNodes){
     * try{ childNodes.addAll((List<INode>)(Object)childNodeProperties.getList(
     * fullLdapName)); }catch(Exception e){ // e.printStackTrace();
     * childNodes.add((INode)(Object)childNodeProperties.getProperty(
     * fullLdapName)); }
     * 
     * }
     */
    // Netx improvement. Create all childNode in first visit. Then in subsequent
    // visits based on
    // the dlap name, based on some part of ldap name, all childnodes created
    // earlier will be
    // transfered from that repo to current list of childnodes of the ldap
    // object
    // So the childnodes created in the first time needs to be created and
    // categorized in a manner such
    // that all child which may belong too same ldap parent are in one bin
    // After visitng the last ldap object we may discard the bin.
    public void createChildObjectsFromChildFile(List<INode> childNodes) {
	Iterator<String> iter = childNodeProperties.getKeys();
	String key;
	while (iter.hasNext()) {
	    key = iter.next();
	    if (key.contains(fullLdapName) && keyIsFirstBornOf(key, fullLdapName)) {
		INode leafNode = new ChildNode(key, childNodeProperties.getLong(key));
		childNodes.add(leafNode);
		childNodeProperties.clearProperty(key);
	    }
	}
    }

    public boolean keyIsFirstBornOf(String child, String parentLdap) {
	return child.split("\\.").length - parentLdap.split("\\.").length == 1;
    }

    public File getLdapFile(String fullLdapName) {
	return new File(
		Property.getChildNodePath() + fullLdapName.substring(0, fullLdapName.indexOf(".")) + ".properties");
    }

    public File getChildFile(String childFileName) {
	return new File(Property.getChildNodePath() + childFileName);
    }

    public void preCreateChildObjects() {
	PropertiesConfiguration extracted = new PropertiesConfiguration();
	Iterator<String> iter = childNodeProperties.getKeys();
	String key;
	String parentLdap;
	while (iter.hasNext()) {
	    key = iter.next();
	    parentLdap = key.substring(0, key.lastIndexOf("."));
	    extracted.addProperty(parentLdap, new ChildNode(key, childNodeProperties.getLong(key)));
	}
	childNodeProperties = extracted;
    }

    /*
     * public void writeToFile(String fullAncestorName, String nodeId){
     * childNodeProperties.setProperty(fullAncestorName, nodeId);
     * layout.setComment(fullAncestorName, fullAncestorName.substring(0,
     * fullAncestorName.lastIndexOf(".")));
     * 
     * }
     */

    public void writeToFile(String value, String comment) {
	// childNodeProperties.addProperty(value, null);
	if(value==null)
	    return;
	String[] fullPropVals = value.split("\\n");
	String[] onePropAndVal = fullPropVals[0].split("=");
	childNodeProperties.setProperty(onePropAndVal[0], onePropAndVal[1]);
	layout.setComment(onePropAndVal[0], comment);
	for (int i = 1; i < fullPropVals.length; i++) {
	    onePropAndVal = fullPropVals[i].split("=");
	    childNodeProperties.setProperty(onePropAndVal[0], onePropAndVal[1]);
	}
    }

    public void createNewFile(String fileName) {
	File rootFile = new File(Property.getChildNodePath() + fileName);
	try {
	    FileUtils.copyFile(childNodeProperties.getFile(), rootFile);
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

    public void clearPropertyFile() {
	childNodeProperties.clear();
	PrintWriter writer = null;
	try {
	    writer = new PrintWriter(childNodeProperties.getFile());
	    writer.print("");
	    writer.close();
	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	}
    }

    public void savePropertyFile() {
	try {
	    childNodeProperties.save();
	} catch (ConfigurationException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
}
