package com.amzn.model.nodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.amzn.model.nodes.ldapchilds.LdapChild;
import com.amzn.model.nodes.nodeEntity.INodeStats;
import com.amzn.model.nodes.nodeEntity.NodeStats;
import com.amzn.model.nodes.nodeEntity.ldapNodeEntity.AbstractLdapNodeStats;
import com.amzn.model.utility.FetchFromPropertyFile;

public class RootNode extends AbstractNode{

    private FetchFromPropertyFile fetch=null;
    
    private boolean isCovered=false;
    
    private RootNode(){
	childNodes=new HashMap<INode, Boolean>();
	fetch=new FetchFromPropertyFile();
	currentLdapChild=fetch.loadOneHighestCat();
    }
    public static void main(String[] args) {
	RootNode n=new RootNode();
//	n.getOneHigestCategory();
	n.loadChildren();
	n.interpretChild();
    }

    public void getOneHigestCategory() {
	currentLdapChild=fetch.loadOneHighestCat();
	System.out.println(currentLdapChild.toString());
	/*root.status="Covered";
	fetch.markAsCovered(root);*/
    }
    
    public void loadChildren(){
	Map<String, Boolean> ldap= fetch.getAllLdaps(currentLdapChild.getLdapFile());
	Set<String> ldapCategories= ldap.keySet();
	Iterator<String> iter=ldapCategories.iterator();
	String key="";
	while(iter.hasNext()){
	    key=iter.next();
	    INode child=new LdapChild(key, ldap.get(key));
	    if(ldap.get(key)){
		childNodes.put(child, isCovered);
	    }
	}
    }

    @Override
    public void interpretChild() {
	Set<INode> childset=childNodes.keySet();
	Iterator<INode> iter=childset.iterator();
	while(iter.hasNext()){
	    child=iter.next();
	    if(!childNodes.get(child)){
		isCovered=true;
		childNodes.put(child, isCovered);
		child.loadChildren();
		break;		
	    }
	    
	}
	child.interpretChild();
    }
    
    public String toString(){
	return currentLdapChild.toString();
    }
    
    

}
