package com.amzn.model.nodes.ldapchilds;

import java.util.List;

import com.amzn.model.nodes.INode;

public interface ILdapChild {
    
    void createAndLoadChildren();
    void processLdaps();

}
