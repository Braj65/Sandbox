package com.amzn.model.crawler.commpacks.requests;

import java.util.HashMap;
import java.util.Map;

import org.apache.axis2.databinding.ADBBean;
import org.apache.axis2.databinding.types.PositiveInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amzn.model.crawler.commpacks.requestParams.RequestParams;

public abstract class AbsRequestHolder implements IRequestHolder{
    
    protected ADBBean request=null;
    public ADBBean[] requestArr=null;
    protected ItemSearch requestContainer=null;
    //
    protected RequestParams requestParams=null;
    
    //
    protected Map<String, String> strReqParams=new HashMap<String, String>();
    protected Map<String, PositiveInteger> posIntReqParams=new HashMap<String, PositiveInteger>();
    protected String[] responseGroup;

}
