package com.amzn.model.crawler;

public class Client {
    
    public static void main(String[] args) {
	Client c=new Client();
	String[] a={"Jammy", "Jammer", "Commer", "Silencer", "Jammy"};
	int result=0;
	result=c.rehash(a[0]);
	for(int i=1;i<a.length;i++){
	    result=c.bitwiseAnd(result, c.rehash(a[i]));
	}
	System.out.println(result);
    }
    
    public int rehash(String ASIN){
	int plainHash=ASIN.hashCode();
	plainHash+=(plainHash<<15)^0xffffcd7d;
	plainHash^=(plainHash>>>10);
	plainHash+=(plainHash<<3);
	plainHash^=(plainHash>>>6);
	plainHash+=(plainHash<<2)+(plainHash<<14);
	plainHash=plainHash&0xfffffff;
	return plainHash^(plainHash>>>16);
    }
    
    public int bitwiseAnd(int hash1, int hash2){
	return hash1 & hash2;
    }

}
