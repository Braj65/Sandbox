package com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.highestRootNodes;

import java.util.ArrayList;

import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.INode;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.ldapNodeEntity.AbstractParentNodeStats;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.loaderFactory.LoaderFactory;

public class HighRootNode extends AbstractHighRootNode {

    public HighRootNode(AbstractParentNodeStats rootNodeStats) {
	childNodes = new ArrayList<INode>();
	currentRootCategory = rootNodeStats;
    }

    public void loadChildren() {
	ldapLoader = LoaderFactory.getPropLoader(currentRootCategory.getLdapFile());
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
    
    @Override
    public AbstractParentNodeStats getParentNodeStats(){
	return currentRootCategory;
    }
}
