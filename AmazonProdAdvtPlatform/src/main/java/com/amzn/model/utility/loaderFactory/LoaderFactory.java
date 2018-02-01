package com.amzn.model.utility.loaderFactory;

import com.amzn.model.utility.ILoadChildrenFromProp;

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

}
