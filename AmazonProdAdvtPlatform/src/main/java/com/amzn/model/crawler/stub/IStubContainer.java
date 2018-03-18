package com.amzn.model.crawler.stub;

import java.rmi.RemoteException;

import org.apache.axis2.databinding.ADBBean;

import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch;
import com.amzn.model.crawler.commpacks.response.ResponseHolder;

public interface IStubContainer {
    
    public ResponseHolder executeOperation(ADBBean sarchReq) throws RemoteException;
}
