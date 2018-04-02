package com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.utility;

import java.util.List;

import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.INode;

public interface ILoadChildrenFromProp {    
    void createChildObjectsFromChildFile(List<INode> childNodes);
}
