package com.amzn.model.crawler.stub;

import com.amzn.model.crawler.commpacks.RequestHolder;
import com.amzn.model.crawler.commpacks.ResponseHolder;

public interface IStubContainer {
    
    public ResponseHolder executeOperation(RequestHolder sarchReq);
}
