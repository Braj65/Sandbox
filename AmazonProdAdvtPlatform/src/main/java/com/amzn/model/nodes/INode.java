package com.amzn.model.nodes;

import com.amzn.model.nodes.nodeEntity.INodeStats;

public interface INode {
    
    void interpretChild();
    void loadChildren();
    void register(INode observer);
    void notifyObserver(INodeStats nodeStats);
}
