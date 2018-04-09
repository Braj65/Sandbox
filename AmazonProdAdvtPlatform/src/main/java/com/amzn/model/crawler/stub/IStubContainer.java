package com.amzn.model.crawler.stub;

import java.rmi.RemoteException;

import org.apache.axis2.databinding.ADBBean;

import com.amzn.model.crawler.commpacks.response.IResponseHolder;

public interface IStubContainer {
    
    public IResponseHolder executeOperation(ADBBean sarchReq) throws RemoteException;
}
