package com.amzn.model.nodes.highestRootNodes;

import java.util.List;
import java.util.Map;

import com.amzn.model.nodes.INode;
import com.amzn.model.nodes.nodeEntity.ldapNodeEntity.AbstractLdapNodeStats;
import com.amzn.model.utility.LoadLdapChildren;

public abstract class AbstractHighRootNode implements INode{
    
    protected List<INode> childNodes;
    //It shouldn't be of AbstractLdapNodeStats. Rather of RootNode type. Maybe change the 
    //AbstractLdapNodeStats class name
    protected AbstractLdapNodeStats currentRootCategory;
    protected LoadLdapChildren fetch;
    protected INode observer;
    
    
    @Override
    public void register(INode observer) {
	this.observer=observer;
	
    }
    @Override
    public INode getObserver() {
	// TODO Auto-generated method stub
	return null;
    }
}
