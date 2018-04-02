package com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.highestRootNodes;

import java.util.List;

import com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.request.IBrowseNodes;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.INode;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.ldapNodeEntity.AbstractParentNodeStats;
import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility.ILoadChildrenFromProp;

public abstract class AbstractHighRootNode implements INode, IBrowseNodes{
    
    protected List<INode> childNodes;
    protected AbstractParentNodeStats currentRootCategory;
    protected ILoadChildrenFromProp ldapLoader;
    protected INode observer;
    
    
    @Override
    public void register(INode observer) {
	this.observer=observer;	
    }
}
