package Pools.Client;

import java.util.Properties;

import Pools.AZCatPEPool;
import Pools.AzCat;
import Pools.AzCatManager;

public class Client {
    public static void main(String[] args) {
	AzCatManager catMng=new AzCatManager();
	Properties perfTuneSett=new Properties();
	AZCatPEPool catPool=new AZCatPEPool(3, catMng, perfTuneSett);
	AzCat cat1=catPool.getCat();
	
    }

}
