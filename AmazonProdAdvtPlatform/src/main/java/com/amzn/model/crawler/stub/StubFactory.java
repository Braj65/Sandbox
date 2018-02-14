package com.amzn.model.crawler.stub;

public class StubFactory {
    
    public static AbsStubContainer getStubInstance(String Operation){
	if("ItemSearch".equals(Operation))
	    return StubContainerItemSearch.NULLINSTANCE;
	if("BrowseNodeLookup".equals(Operation))
	    return StubContainerNodeLookup.NULLINSTANCE;
	return AbsStubContainer.NULLINSTANCE;
    }

}
