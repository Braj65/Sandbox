package com.amzn.model.nodesToBeCrawled.nodes.highestRootNodes;

import java.util.List;

import com.amzn.model.nodesToBeCrawled.nodes.INode;
import com.amzn.model.nodesToBeCrawled.nodes.nodeEntity.ldapNodeEntity.AbstractParentNodeStats;
import com.amzn.model.nodesToBeCrawled.utility.ILoadChildrenFromProp;

public abstract class AbstractHighRootNode implements INode{
    
    protected List<INode> childNodes;
    protected AbstractParentNodeStats currentRootCategory;
    protected ILoadChildrenFromProp ldapLoader;
    protected INode observer;
    
    
    @Override
    public void register(INode observer) {
	this.observer=observer;	
    }
}
