package com.amzn.model.nodes.childnodes;

import java.util.List;

public class AbstractChildNode implements IChildNode{
    
    protected List<IChildNode> children;
    private String childNodeName;
    private Integer nodeId;

}
