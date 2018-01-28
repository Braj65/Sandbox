package com.amzn.model.nodes;

import java.util.List;
import java.util.Map;

import com.amzn.model.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodes.nodeEntity.ldapNodeEntity.AbstractLdapNodeStats;
import com.amzn.model.utility.FetchFromPropertyFile;

public abstract class AbstractNode implements INode{
    
    protected List<INode> childNodes;
    //It shouldn't be of AbstractLdapNodeStats. Rather of RootNode type. Maybe change the 
    //AbstractLdapNodeStats class name
    protected AbstractLdapNodeStats currentRootCategory;
    protected FetchFromPropertyFile fetch;
    
    
    @Override
    public void register(INode observer) {
	// TODO Auto-generated method stub
	
    }
    @Override
    public INode getObserver() {
	// TODO Auto-generated method stub
	return null;
    }
}
