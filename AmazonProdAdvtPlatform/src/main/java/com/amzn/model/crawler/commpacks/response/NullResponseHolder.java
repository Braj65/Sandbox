package com.amzn.model.crawler.commpacks.response;

import org.apache.axis2.databinding.ADBBean;

public class NullResponseHolder implements IResponseHolder{
    private long currentTimeSec;
    public NullResponseHolder(ADBBean resp) {
	currentTimeSec=System.currentTimeMillis()/1000;
    }

}
