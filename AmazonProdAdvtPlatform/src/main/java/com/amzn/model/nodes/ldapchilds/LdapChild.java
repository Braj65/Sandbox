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
	for(INode child:children){
	    child.register(this);
	    child.loadChildren();
	    child.interpretChild();
	}	
    }

    @Override
    public void register(INode observer) {
	this.observer=observer;
    }
}
