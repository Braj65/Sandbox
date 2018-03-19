package com.amzn.model.crawler.commpacks.requests;

import java.util.Map;

import org.apache.axis2.databinding.ADBBean;
import org.apache.axis2.databinding.types.PositiveInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;

public interface IRequestHolder {
    
    public ADBBean getReqContainer();
    public ADBBean[] getReqArr();
    public void createItemSearchRequest();
    
    public Map<String, String> getStrReqParams();
    public Map<String, PositiveInteger> getposIntReqParams();
    public void setRespGroup(String[] respGrp);
}
