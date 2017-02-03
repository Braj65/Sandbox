package com.amazon.elastic.form;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

public class ElasticForm {
    public static TransportClient transClient=null;
    
    public ElasticForm(){
	if(transClient==null){
	    Settings settings = Settings.settingsBuilder().put("cluster.name", "myAZCluster").build();
	    try {
		    transClient = TransportClient.builder().settings(settings).build()
			    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300))
		    	.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9301));
		} catch (UnknownHostException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}   
	}	
    }
    
    public static TransportClient getElasticClient(){
	if(transClient==null){
	    new ElasticForm ();
	}
	return transClient;
    }

}
