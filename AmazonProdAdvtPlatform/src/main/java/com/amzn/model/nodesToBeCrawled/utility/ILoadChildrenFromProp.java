package com.amzn.model.nodesToBeCrawled.utility;

import java.util.List;

import org.apache.commons.configuration.PropertiesConfiguration;

import com.amzn.model.nodesToBeCrawled.nodes.INode;

public interface ILoadChildrenFromProp {    
    void createChildObjectsFromChildFile(List<INode> childNodes);
}
