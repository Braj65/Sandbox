package com.amzn.model.utility;

import java.io.File;

import org.apache.commons.configuration.PropertiesConfiguration;

public class LeafChildProperties {
    
    private File leafFileName;
    private PropertiesConfiguration config;
    
    protected LeafChildProperties(File leafFileName, PropertiesConfiguration config){
	this.leafFileName=leafFileName;
	this.config=config;
    }
    
    public File getLeafFile(){
	return leafFileName;
    }

}
