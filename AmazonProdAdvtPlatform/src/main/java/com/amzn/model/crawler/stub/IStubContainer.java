package com.amzn.model.crawler.stub;

import java.rmi.RemoteException;

import com.amzn.model.crawler.commpacks.ResponseHolder;
import com.amzn.model.crawler.commpacks.requests.IRequestHolder;

public interface IStubContainer {
    
    public ResponseHolder executeOperation(IRequestHolder sarchReq) throws RemoteException;
}
