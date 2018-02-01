package com.amzn.model.nodes.highestRootNodes;

import java.util.List;

import com.amzn.model.nodes.INode;
import com.amzn.model.nodes.nodeEntity.ldapNodeEntity.AbstractParentNodeStats;
import com.amzn.model.utility.ILoadChildrenFromProp;

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
