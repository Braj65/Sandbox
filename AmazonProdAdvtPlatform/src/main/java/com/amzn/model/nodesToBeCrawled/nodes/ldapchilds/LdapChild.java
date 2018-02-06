package com.amzn.model.nodes.ldapchilds;

import com.amzn.model.nodes.INode;
import com.amzn.model.utility.LoadLeafChildren;
import com.amzn.model.utility.loaderFactory.LoaderFactory;

public class LdapChild extends AbstractLdapChild{
    
    public LdapChild(String ldapName, boolean toBeCrawled) {
	super(ldapName);
	this.toBeCrawled=toBeCrawled;
	loadLeafs=LoaderFactory.getPropLoader(ldapName.substring(0, ldapName.indexOf("."))+".properties");
    }
    
    @Override
    public void loadChildren() {
	LoadLeafChildren childLoadLeaf=(LoadLeafChildren)loadLeafs;
	childLoadLeaf.preCreateChildObjects(children, parentCategory);
//	childLoadLeaf.beforeCreatingChildObjects(this);
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
