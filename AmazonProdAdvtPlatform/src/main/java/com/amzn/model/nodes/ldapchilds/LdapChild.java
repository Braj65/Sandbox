package com.amzn.model.nodes.ldapchilds;

import com.amzn.model.nodes.INode;

public class LdapChild extends AbstractLdapChild{

    public LdapChild(String ldapName, Boolean toBeScrapped) {
	super(ldapName, toBeScrapped);
    }

    @Override
    public void createAndLoadChildren() {
	
    }

}
