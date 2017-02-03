package com.amazon.prodbase;

import java.util.ArrayList;

public interface Categories {
    
    public String getSrchIndex();
    public String getFullName();
    public void setSortParams(String nodeId);
    public ArrayList<String> getsortParams();

}
