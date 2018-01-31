package com.amzn.model.nodes.highestRootNodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.configuration.PropertiesConfiguration;

import com.amzn.model.nodes.INode;
import com.amzn.model.nodes.ldapchilds.AbstractLdapChild;
import com.amzn.model.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodes.nodeEntity.ldapNodeEntity.AbstractParentNodeStats;
import com.amzn.model.utility.LoadLdapChildren;

public class HighRootNode extends AbstractHighRootNode{
    
    public HighRootNode(AbstractParentNodeStats rootNodeStats){
	childNodes=new ArrayList<INode>();
	fetch=new LoadLdapChildren();
	currentRootCategory=rootNodeStats;
//	currentRootCategory=fetch.loadOneHighestCat();
    }
    //Here we need to do the same we have done in Ldapchild. Instead of loading a highest category and its
    //parameters to a variable. We need to structure this class/AbstractLdapNodestats to carry the parameters
    //of the highestRootIds keys as object fields and get populated int he constructor
    public void getOneHigestCategory() {
	currentRootCategory=fetch.loadOneHighestCat();
	System.out.println(currentRootCategory.toString());
	/*root.status="Covered";
	fetch.markAsCovered(root);*/
    }
    //Move method since it uses currentLdapchild more 
    public void loadChildren(){
	fetch.createChildObjectsFromChildFile(childNodes, currentRootCategory.getLdapFile());
    }
    
    @Override
    public void interpretChild(){
	PropertiesConfiguration tempLeafChildProp=null;
	for(int i=0;i<1;i++){
	    tempLeafChildProp=processFirstLdapObjectAndNestedChildren(childNodes.get(i));
	    childNodes.set(i, null);
	}
	for(int i=1;i<childNodes.size();i++){
	    tempLeafChildProp=processRestLdapObjectAndNestedChildren(childNodes.get(i), tempLeafChildProp);
	    childNodes.set(i, null);
	}
    }
    
    public PropertiesConfiguration processFirstLdapObjectAndNestedChildren(INode child){
	child.register(this);
	child.loadChildren();
	child.interpretChild();
	return ((AbstractLdapChild) child).getLeafNodeProperties();	
    }
    
    public PropertiesConfiguration processRestLdapObjectAndNestedChildren(INode child, 
	    PropertiesConfiguration prevLdapChildLeafNodeProp){
	child.register(this);
	((AbstractLdapChild) child).setLeafNodeProperties(prevLdapChildLeafNodeProp);
	child.loadChildren();
	child.interpretChild();
	return ((AbstractLdapChild) child).getLeafNodeProperties();
    }
    
    public String toString(){
	return currentRootCategory.toString();
    }
    @Override
    public void notifyObserver(INodeStats nodeStats) {
	observer.notifyObserver(nodeStats);	
    }
}
