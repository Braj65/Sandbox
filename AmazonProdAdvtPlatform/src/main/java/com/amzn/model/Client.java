package com.amzn.model;

import com.amzn.model.nodes.RootNode;

public class Client {
    
    public static void main(String[] args) {
	RootNode node=new RootNode();
	node.loadChildren();
	node.interpretChild();	
    }

}
