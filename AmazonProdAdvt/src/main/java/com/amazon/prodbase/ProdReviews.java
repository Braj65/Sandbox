package com.amazon.prodbase;

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

public class ProdReviews {

    public Double overallStars = null;
    public int[] allStars=new int[5];
    public Integer totalReviews = null;

    String path = "https://www.amazon.in/gp/customer-reviews/widgets/average-customer-review/popover/ref=dpx_acr_pop_?contextId=dpx&asin=";
    CloseableHttpResponse resp = null;

    public ProdReviews(String ASIN) {
	fetchStars(ASIN);
    }

    public void fetchStars(String asin) {
	int starStart=5;
	
	String fullpath = path + asin;
	String xresp = null;
	CloseableHttpClient c = HttpClients.custom().build();
	HttpUriRequest req = RequestBuilder.get().setUri(fullpath).setHeader(HttpHeaders.HOST, "www.amazon.in")
		.setHeader(HttpHeaders.USER_AGENT,
			"Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:46.0) Gecko/20100101 Firefox/46.0")
		.setHeader(HttpHeaders.ACCEPT, "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.setHeader(HttpHeaders.ACCEPT_LANGUAGE, "en-US,en;q=0.5")
		.setHeader(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate, br")
		.setHeader(HttpHeaders.CONNECTION, "keep-alive").build();
	try {
	    resp = c.execute(req);
	    xresp = IOUtils.toString(resp.getEntity().getContent());
	    xresp = xresp.replaceAll("&", "&amp;");
	    InputSource is = new InputSource(new StringReader(xresp));
	    DocumentBuilderFactory docFac = DocumentBuilderFactory.newInstance();
	    DocumentBuilder docBld = docFac.newDocumentBuilder();
	    Document doc = docBld.parse(is);
	    Element ele = doc.getDocumentElement();
	    NodeList starnodes = ele.getElementsByTagName("span");
	    String overall = starnodes.item(0).getTextContent().trim();
	    if(overall.contains("5 stars")){
		overallStars=new Double(overall.substring(0, overall.indexOf(" ")));
	    }
	    for(int i=1;i<starnodes.getLength();i+=4){
		if(starnodes.item(i).getTextContent().contains(starStart+" star")){
		    allStars[starStart-1]=Integer.parseInt(starnodes.item(i+3).getTextContent().trim());
		}else{
		    allStars[starStart-1]=1;
		}
		starStart--;
	    }
	    NodeList anch=ele.getElementsByTagName("a");
	    totalReviews=Integer.parseInt(anch.item(anch.getLength()-1).getTextContent().trim().replaceAll("[\\D]", ""));
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }

}
