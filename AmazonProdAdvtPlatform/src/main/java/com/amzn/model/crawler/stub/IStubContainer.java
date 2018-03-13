package com.amzn.model.crawler.stub;

import java.rmi.RemoteException;

import com.amzn.model.crawler.commpacks.requests.IRequestHolder;
import com.amzn.model.crawler.commpacks.response.ResponseHolder;

public interface IStubContainer {
    
    public ResponseHolder executeOperation(IRequestHolder sarchReq) throws RemoteException;
}
