package com.amzn.model.utility;

import java.io.File;
import java.util.List;

import org.apache.commons.configuration.PropertiesConfiguration;

import com.amzn.model.nodes.INode;

public class LoadHighRoots {
    private File rootFile=null;
    private PropertiesConfiguration propConfigs;
    public void loadHighRootLevelChildren(List<INode> childNodes, String propFileName){
	rootFile=new File(propFileName);
	
    }
}
