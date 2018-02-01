package com.amzn.model.utility;

import java.util.List;

import com.amzn.model.nodes.INode;

public interface ILoadChildrenFromProp {    
    void createChildObjectsFromChildFile(List<INode> childNodes, String childFileName);
}
