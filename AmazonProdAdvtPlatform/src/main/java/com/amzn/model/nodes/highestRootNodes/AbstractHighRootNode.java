package com.amzn.model.nodes.highestRootNodes;

import java.util.List;
import java.util.Map;

import com.amzn.model.nodes.INode;
import com.amzn.model.nodes.nodeEntity.ldapNodeEntity.AbstractParentNodeStats;
import com.amzn.model.utility.LoadLdapChildren;

public abstract class AbstractHighRootNode implements INode{
    
    protected List<INode> childNodes;
    protected AbstractParentNodeStats currentRootCategory;
    protected LoadLdapChildren fetch;
    protected INode observer;
    
    
    @Override
    public void register(INode observer) {
	this.observer=observer;	
    }
}
