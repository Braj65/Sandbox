package com.amzn.model.nodesToBeCrawled.nodes.nodeEntity;

public interface INodeStats {
    
    String getNodeName();
    Long getNodeId();
    String toString();
    
    String getSrchIndex();
    void setSearchIndex(String index);

}
