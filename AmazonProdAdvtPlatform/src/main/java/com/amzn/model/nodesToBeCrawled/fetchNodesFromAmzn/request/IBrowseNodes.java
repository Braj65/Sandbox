package com.amzn.model.nodesToBeCrawled.fetchNodesFromAmzn.request;

import com.amzn.model.nodesToBeCrawled.nodeFeedToBeCrawled.nodes.nodeEntity.ldapNodeEntity.AbstractParentNodeStats;

public interface IBrowseNodes {
    
    public AbstractParentNodeStats getParentNodeStats();

}
