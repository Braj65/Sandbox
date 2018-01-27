package com.amzn.model.nodes;

import java.util.List;
import java.util.Map;

import com.amzn.model.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodes.nodeEntity.ldapNodeEntity.AbstractLdapNodeStats;

public abstract class AbstractNode implements INode{
    
    protected List<INode> childNodes;
    protected AbstractLdapNodeStats currentLdapChild;
    
    
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
