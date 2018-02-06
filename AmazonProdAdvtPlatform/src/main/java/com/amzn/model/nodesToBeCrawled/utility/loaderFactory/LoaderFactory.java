package com.amzn.model.nodesToBeCrawled.utility.loaderFactory;

import com.amzn.model.nodesToBeCrawled.utility.ILoadChildrenFromProp;

public class LoaderFactory {
    static LoaderRegister register;
    public LoaderFactory(){
	register=new LoaderRegister();
    }
    
    public static ILoadChildrenFromProp getPropLoader(String str){
	return register.getPropLoader(str);
    }
    
    public static void registerPropLoader(String str, ILoadChildrenFromProp propLoader){
	register.register(str, propLoader);
    }
    
    public static void clearPropLoader(String str){
	register.clearPropLoader(str);
    }

}
