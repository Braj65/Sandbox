package com.amzn.model.utility;

import java.util.List;

import org.apache.commons.configuration.PropertiesConfiguration;

import com.amzn.model.nodes.INode;

public interface ILoadChildrenFromProp {    
    void createChildObjectsFromChildFile(List<INode> childNodes);
    void setLeafNodeProperties(PropertiesConfiguration prevPropertiesConfig);
}
