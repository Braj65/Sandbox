package com.amzn.model.nodes.ldapchilds;

import java.util.ArrayList;
import java.util.List;

import com.amzn.model.nodes.childnodes.IChildNode;

public abstract class AbstractLdapChild implements ILdapChild{
    
    protected List<IChildNode> children;
    protected Boolean toBeScrapped;
    protected String parentCategory;
    
    public AbstractLdapChild(String ldapName, Boolean toBeScrapped){
	children=new ArrayList<IChildNode>();
	this.parentCategory=ldapName;
	this.toBeScrapped=toBeScrapped;	
    }
}
