package com.amzn.model.crawlerx.stub;

import com.amzn.model.crawlerx.commpacks.RequestHolder;
import com.amzn.model.crawlerx.commpacks.ResponseHolder;

public interface IStubContainer {
    
    public ResponseHolder itemSearch(RequestHolder sarchReq);
    public ResponseHolder browseNodeLookup(RequestHolder nodeLookupReq);

}
