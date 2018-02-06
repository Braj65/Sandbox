package com.amzn.model.nodesToBeCrawled.nodes.highestRootNodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;

import com.amzn.model.nodesToBeCrawled.nodes.INode;
import com.amzn.model.nodesToBeCrawled.nodes.ldapchilds.AbstractLdapChild;
import com.amzn.model.nodesToBeCrawled.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodesToBeCrawled.nodes.nodeEntity.ldapNodeEntity.AbstractParentNodeStats;
import com.amzn.model.nodesToBeCrawled.utility.LoadLdapChildren;
import com.amzn.model.nodesToBeCrawled.utility.loaderFactory.LoaderFactory;

public class HighRootNode extends AbstractHighRootNode {

    public HighRootNode(AbstractParentNodeStats rootNodeStats) {
	childNodes = new ArrayList<INode>();
	ldapLoader = LoaderFactory.getPropLoader(rootNodeStats.getLdapFile());
	currentRootCategory = rootNodeStats;
    }

    public void loadChildren() {
	ldapLoader.createChildObjectsFromChildFile(childNodes);
    }

    public void interpretChild() {
	for (int i = 0; i < childNodes.size(); i++) {
	    childNodes.get(i).register(this);
	    childNodes.get(i).loadChildren();
	    childNodes.get(i).interpretChild();
	    childNodes.set(i, null); 
	}
    }

    public String toString() {
	return currentRootCategory.toString();
    }

    @Override
    public void notifyObserver(INodeStats nodeStats) {
	observer.notifyObserver(nodeStats);
    }
}
