package com.amzn.model.crawler.stub;

public class StubFactory {
    
    public static AbsStubContainer getStubInstance(String Operation){
//	    return StubContainerItemSearch.NULLINSTANCE;
	if("ItemSearch".equals(Operation))
	    return StubContainerItemSearch.ITEMSEARCHINSTANCE;
	if("BrowseNodeInfo".equals(Operation))
	    return StubContainerNodeLookup.NODELOOKUPINSTANCE;
	return AbsStubContainer.NULLINSTANCE;
    }

}
