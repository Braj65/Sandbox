package com.amzn.model.nodes.ldapchilds;

import com.amzn.model.nodes.INode;

public interface ILdapChild {
    
    void createAndLoadChildren(INode ldapParent);

}
