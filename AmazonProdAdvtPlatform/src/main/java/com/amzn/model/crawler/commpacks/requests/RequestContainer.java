package com.amzn.model.crawler.commpacks.requests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.axis2.databinding.types.PositiveInteger;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;

public class RequestContainer {
    
    private Map<String, String> strReqParams=new HashMap<String, String>();
    private Map<String, PositiveInteger> posIntReqParams=new HashMap<String, PositiveInteger>();
    private String[] responseGroup;
    
    private ItemSearchRequest srchReq;
    private ItemSearchRequest srchReqArr[];
    private List<ItemSearchRequest[]> biGroupedList=new ArrayList<ItemSearchRequest[]>();
    
}
