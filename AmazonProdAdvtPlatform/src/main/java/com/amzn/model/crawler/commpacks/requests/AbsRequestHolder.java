package com.amzn.model.crawler.commpacks.requests;

import org.apache.axis2.databinding.ADBBean;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amzn.model.crawler.commpacks.requestParams.RequestParams;

public abstract class AbsRequestHolder implements IRequestHolder{
    
    protected ADBBean request=null;
    public ADBBean[] requestArr=null;
    protected ItemSearch requestContainer=null;
    //
    protected RequestParams requestParams=null;

}
