package com.amzn.model.nodes.ldapchilds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.configuration.PropertiesConfiguration;

import com.amzn.model.nodes.INode;
import com.amzn.model.nodes.nodeEntity.INodeStats;
import com.amzn.model.utility.LoadLeafChildren;

public abstract class AbstractLdapChild implements INode{
    
    protected List<INode> children;
    protected String parentCategory;
    protected INode observer;
    //The reason for removing loadlea could be keep this Ldap class focus on two things-
    //It should carry its own object fields and its chidren list and thats it
    protected LoadLeafChildren loadLeafs;
    
    public AbstractLdapChild(String ldapName, Boolean toBeScrapped){
	children=new ArrayList<INode>();
	this.parentCategory=ldapName;
    }
    
    public INode getObserver(){
	return observer;
    }
    
    @Override
    public void notifyObserver(INodeStats stats) {
	// TODO Auto-generated method stub
    }
    
    //loadLeafs is used heavily in three methods. Maybe move method is required for it
    public PropertiesConfiguration getLeafNodeProperties(){
	return this.loadLeafs.getLeafNodeProperties();
    }
    
    public void setLeafNodeProperties(PropertiesConfiguration prevPropertiesConfig){
	this.loadLeafs.setLeafNodeProperties(prevPropertiesConfig);
    }
    
}
