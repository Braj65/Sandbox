package com.amzn.model.nodes;

import java.util.List;

import com.amzn.model.nodes.ldapchilds.ILdapChild;

public abstract class AbstractNode implements INode{
    
    protected List<ILdapChild> childNodes;
    public boolean isActive=false;
}
