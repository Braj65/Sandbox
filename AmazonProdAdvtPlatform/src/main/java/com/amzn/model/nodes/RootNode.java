package com.amzn.model.nodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.amzn.model.nodes.ldapchilds.ILdapChild;
import com.amzn.model.nodes.ldapchilds.LdapChild;
import com.amzn.model.utility.FetchFromPropertyFile;

public class RootNode extends AbstractNode{
    
    private NodeStats currentLdapChild=null;
    private FetchFromPropertyFile fetch=null;
    
    private RootNode(){
	childNodes=new ArrayList<ILdapChild>();
	fetch=new FetchFromPropertyFile();
    }
    public static void main(String[] args) {
	RootNode n=new RootNode();
	n.getOneHigestCategory();
	n.loadLdapChildren();
	n.processLdap();
    }

    public void getOneHigestCategory() {
	currentLdapChild=fetch.loadOneHighestCat();
	System.out.println(currentLdapChild.toString());
	/*root.status="Covered";
	fetch.markAsCovered(root);*/
    }
    
    public void loadLdapChildren(){
	Map<String, Boolean> ldap= fetch.getAllLdaps(currentLdapChild.getLdapFile());
	Set<String> ldapCategories= ldap.keySet();
	Iterator<String> iter=ldapCategories.iterator();
	String key="";
	while(iter.hasNext()){
	    key=iter.next();
	    ILdapChild child=new LdapChild(key, ldap.get(key));
	    if(ldap.get(key))
		childNodes.add(child);
	}
    }

    @Override
    public void processLdap() {
	for(ILdapChild child:childNodes){
	    child.processLdaps();
	}	
    }
    
    

}
