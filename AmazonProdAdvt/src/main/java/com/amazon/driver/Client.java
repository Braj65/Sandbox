package com.amazon.driver;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.google.common.net.HttpHeaders;



public class Client {
    
    public static void main(String[] args) throws Exception {
	/*try{
	    Categories c=(Categories) Class.forName("categorybean.ClothingParams").newInstance();
	    System.out.println(c.getSrchIndex());
	    DateFormat dateFormat=new SimpleDateFormat("HH_mm");
		Date d=new Date();
		System.out.println("index_"+dateFormat.format(d));
	}catch(Exception e){
	    e.printStackTrace();
	}*/
	
	CloseableHttpResponse resp=null;
	
	String path="https://www.amazon.in/gp/customer-reviews/widgets/average-customer-review/popover/ref=dpx_acr_pop_?contextId=dpx&asin=";
	String asin="B00TO7K294";
	String full=path+asin;
	/*HttpGet get=new HttpGet();
	get.setURI(new URI(full));
	
	CloseableHttpClient httpClient=HttpClients.createDefault();
	resp=httpClient.execute(get);
	System.out.println(IOUtils.toString(resp.getEntity().getContent()));*/
	
	CloseableHttpClient c=HttpClients.custom().build();
	HttpUriRequest req=RequestBuilder.get().setUri(full)
		.setHeader(HttpHeaders.HOST, "www.amazon.in")
		.setHeader(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:46.0) Gecko/20100101 Firefox/46.0")
		.setHeader(HttpHeaders.ACCEPT, "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.setHeader(HttpHeaders.ACCEPT_LANGUAGE, "en-US,en;q=0.5")
		.setHeader(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate, br")
		.setHeader(HttpHeaders.CONNECTION, "keep-alive")
		.build();
	resp=c.execute(req);
	String xresp=IOUtils.toString(resp.getEntity().getContent());
	System.out.println(xresp);
	xresp=xresp.replaceAll("&", "&amp;");
	InputSource is=new InputSource(new StringReader(xresp));
	DocumentBuilderFactory docFac=DocumentBuilderFactory.newInstance();
	DocumentBuilder docBld=docFac.newDocumentBuilder();
	Document doc=docBld.parse(is);
	Element ele=doc.getDocumentElement();
	NodeList starnodes=ele.getElementsByTagName("span");
	String overall=starnodes.item(0).getTextContent().trim();
	System.out.println(overall);
	for(int i=1;i<starnodes.getLength();i+=4){
	    System.out.println(starnodes.item(i).getTextContent().trim());
	    System.out.println(starnodes.item(i+3).getTextContent().trim());
	}
	
	NodeList anch=ele.getElementsByTagName("a");
	System.out.println(anch.item(anch.getLength()-1).getTextContent().trim());	
	
    }

}
