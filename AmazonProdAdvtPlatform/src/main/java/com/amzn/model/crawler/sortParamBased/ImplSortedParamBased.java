package com.amzn.model.crawler.sortParamBased;

public class ImplSortedParamBased extends AbstractSortApplied{
    
    public void gamesSorted(){
	super.gamesSearchRequest();
	super.applySortParam();
	super.loadItemSearchArr();
    }
}
