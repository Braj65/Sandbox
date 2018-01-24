package com.amzn.model.nodes;

import java.util.List;
import java.util.Map;

import com.amzn.model.nodes.ldapchilds.ILdapChild;

public abstract class AbstractNode implements INode{
    
    protected Map<ILdapChild, Boolean> childNodes;
    public boolean isActive=false;
}
