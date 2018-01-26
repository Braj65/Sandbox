package com.amzn.model.nodes.ldapchilds;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.configuration.PropertiesConfiguration;

import com.amzn.model.nodes.INode;
import com.amzn.model.nodes.nodeEntity.INodeStats;
import com.amzn.model.utility.LoadLeafChildren;

public abstract class AbstractLdapChild implements INode{
    
    protected Map<INode, Boolean> children;
    protected Boolean toBeScrapped;
    protected String parentCategory;
    protected INode observer;
    protected LoadLeafChildren loadLeafs;
    
    public AbstractLdapChild(String ldapName, Boolean toBeScrapped){
	children=new HashMap<INode, Boolean>();
	this.parentCategory=ldapName;
	this.toBeScrapped=toBeScrapped;	
    }
    
    public INode getObserver(){
	return observer;
    }
    
    @Override
    public void notifyObserver(INodeStats stats) {
	// TODO Auto-generated method stub
    }
    
    public PropertiesConfiguration getLeafNodeProperties(){
	return this.loadLeafs.getLeafNodeProperties();
    }
    
    public void setLeafNodeProperties(PropertiesConfiguration prevPropertiesConfig){
	this.loadLeafs.setLeafNodeProperties(prevPropertiesConfig);
    }
    
}
