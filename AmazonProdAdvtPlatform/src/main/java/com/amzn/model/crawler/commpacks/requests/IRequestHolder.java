package com.amzn.model.crawler.commpacks.requests;

import org.apache.axis2.databinding.ADBBean;

import com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;

public interface IRequestHolder {
    
    public ADBBean getReqContainer();
    public ADBBean[] getReqArr();
    public void createItemSearchRequest();
}
