package com.amzn.model;

import com.amzn.model.nodes.highestRootNodes.HighRootNode;

public class Client {
    
    public static void main(String[] args) {
	HighRootNode node=new HighRootNode();
	node.loadChildren();
	node.interpretChild();	
    }

}
