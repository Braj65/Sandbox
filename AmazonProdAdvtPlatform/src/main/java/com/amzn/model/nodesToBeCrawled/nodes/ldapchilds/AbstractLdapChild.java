package com.amzn.model.nodesToBeCrawled.nodes.ldapchilds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.configuration.PropertiesConfiguration;

import com.amzn.model.nodesToBeCrawled.nodes.INode;
import com.amzn.model.nodesToBeCrawled.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodesToBeCrawled.utility.ILoadChildrenFromProp;
import com.amzn.model.nodesToBeCrawled.utility.LoadLeafChildren;

public abstract class AbstractLdapChild implements INode{
    
    public List<INode> children;
    public String parentCategory;
    protected INode observer;
    public boolean toBeCrawled;
    //The reason for removing loadlea could be keep this Ldap class focus on two things-
    //It should carry its own object fields and its chidren list and thats it
    protected ILoadChildrenFromProp loadLeafs;
    
    public AbstractLdapChild(String ldapName){
	children=new ArrayList<INode>();
	this.parentCategory=ldapName;
    }
    
    public INode getObserver(){
	return observer;
    }
    
    @Override
    public void notifyObserver(INodeStats stats) {
	observer.notifyObserver(stats);
    }
    
}