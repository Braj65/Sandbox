package com.amzn.model.nodes.ldapchilds;

import com.amzn.model.nodes.INode;
import com.amzn.model.utility.LoadLeafChildren;

public class LdapChild extends AbstractLdapChild{
    
    public LdapChild(String ldapName, Boolean toBeCrawled) {
	super(ldapName, toBeCrawled);
	loadLeafs=new LoadLeafChildren();	
    }
    
    @Override
    public void loadChildren() {
	loadLeafs.loadLeafNodesFromLdap(children, this.parentCategory);
    }

    @Override
    public void interpretChild() {
	for(int i=0;i<children.size();i++){
	    children.get(i).register(this);
	    children.get(i).loadChildren();
	    children.get(i).interpretChild();
	    children.set(i, null);
	}	
    }

    @Override
    public void register(INode observer) {
	this.observer=observer;
    }
}
