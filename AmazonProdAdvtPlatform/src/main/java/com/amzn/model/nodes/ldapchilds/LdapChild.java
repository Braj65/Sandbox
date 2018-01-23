package com.amzn.model.nodes.ldapchilds;

import java.util.List;
import java.util.Map;

import com.amzn.model.utility.LoadLeafChildren;

public class LdapChild extends AbstractLdapChild{

    private LoadLeafChildren loadLeafs;
    
    public LdapChild(String ldapName, Boolean toBeScrapped) {
	super(ldapName, toBeScrapped);
	loadLeafs=new LoadLeafChildren();	
    }
    
    @Override    
    public void processLdaps(){
	this.createAndLoadChildren();
    }

    @Override
    public void createAndLoadChildren() {
	Map<String, Integer> leafChildrens=loadLeafs.loadRequiredChildren(this.parentCategory);
	System.out.println(leafChildrens);
    }

}
