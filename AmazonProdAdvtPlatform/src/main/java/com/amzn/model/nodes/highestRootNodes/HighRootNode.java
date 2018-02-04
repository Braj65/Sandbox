package com.amzn.model.nodes.highestRootNodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;

import com.amzn.model.nodes.INode;
import com.amzn.model.nodes.ldapchilds.AbstractLdapChild;
import com.amzn.model.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodes.nodeEntity.ldapNodeEntity.AbstractParentNodeStats;
import com.amzn.model.utility.LoadLdapChildren;
import com.amzn.model.utility.loaderFactory.LoaderFactory;

public class HighRootNode extends AbstractHighRootNode {

    public HighRootNode(AbstractParentNodeStats rootNodeStats) {
	childNodes = new ArrayList<INode>();
	ldapLoader = LoaderFactory.getPropLoader(rootNodeStats.getLdapFile());
	currentRootCategory = rootNodeStats;
    }

    public void loadChildren() {
	ldapLoader.createChildObjectsFromChildFile(childNodes, ldapLoader.getPropConfigObj());
    }

    public void interpretChild() {
	for (int i = 0; i < childNodes.size(); i++) {
	    childNodes.get(i).register(this);
	    childNodes.get(i).loadChildren();
	    childNodes.get(i).interpretChild();
	    childNodes.set(i, null);	    
	}
    }

/*    public void interpretChildx() {
	PropertiesConfiguration tempLeafChildProp = null;
	for (int i = 0; i < 1; i++) {
	    tempLeafChildProp = processFirstLdapObjectAndNestedChildren(childNodes.get(i));
	    childNodes.set(i, null);
	}
	for (int i = 1; i < childNodes.size(); i++) {
	    tempLeafChildProp = processRestLdapObjectAndNestedChildren(childNodes.get(i), tempLeafChildProp);
	    childNodes.set(i, null);
	}
    }

    public PropertiesConfiguration processFirstLdapObjectAndNestedChildren(INode child) {
	child.register(this);
	child.loadChildren();
	child.interpretChild();
	return ((AbstractLdapChild) child).getLeafNodeProperties();
    }

    public PropertiesConfiguration processRestLdapObjectAndNestedChildren(INode child,
	    PropertiesConfiguration prevLdapChildLeafNodeProp) {
	child.register(this);
	((AbstractLdapChild) child).setLeafNodeProperties(prevLdapChildLeafNodeProp);
	child.loadChildren();
	child.interpretChild();
	return ((AbstractLdapChild) child).getLeafNodeProperties();
    }*/

    public String toString() {
	return currentRootCategory.toString();
    }

    @Override
    public void notifyObserver(INodeStats nodeStats) {
	observer.notifyObserver(nodeStats);
    }
}
