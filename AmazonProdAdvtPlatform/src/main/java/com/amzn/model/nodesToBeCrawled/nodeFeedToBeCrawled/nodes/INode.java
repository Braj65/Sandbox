package com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes;

import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.INodeStats;

public interface INode {
    
    void interpretChild();
    void loadChildren();
    void register(INode observer);
    void notifyObserver(INodeStats nodeStats);
}
