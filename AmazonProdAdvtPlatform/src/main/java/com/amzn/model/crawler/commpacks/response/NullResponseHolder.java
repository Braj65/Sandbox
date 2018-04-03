package com.amzn.model.crawler.commpacks.response;

import org.apache.axis2.databinding.ADBBean;

public class NullResponseHolder extends ResponseHolder{
    private long currentTimeSec;
    public NullResponseHolder(ADBBean resp) {
	super(resp);
	currentTimeSec=System.currentTimeMillis()/1000;
    }

}
