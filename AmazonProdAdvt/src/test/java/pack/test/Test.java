package pack.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axis2.databinding.types.NonNegativeInteger;
import org.apache.axis2.databinding.types.PositiveInteger;
import org.apache.axis2.transport.http.HTTPConstants;

import com.amazon.stubs.AWSECommerceServiceStub;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemAttributes_type0;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchRequest;
import com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearchResponse;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Item_type3;
import com.amazon.webservices.awsecommerceservice._2013_08_01.Items_type3;


public class Test extends junit.framework.TestCase{
	private static final String AWS_ACCESS_KEY_ID = "AKIAIKBQ6A3OURFXMVPQ";

    /*
     * Your AWS Secret Key corresponding to the above ID, as taken from the AWS
     * Your Account page.
     */
    private static final String AWS_SECRET_KEY = "srlql/D7sRjt5UhB6ZjHBUsTZdrwAnXnyUkoGGST";
	
	public static void main(String[] args) throws Exception {
		AWSECommerceServiceStub stub = new AWSECommerceServiceStub(); //the default implementation should point to the right endpoint
		
		stub._getServiceClient().getOptions().setProperty(HTTPConstants.CHUNKED, "false");
				
		OMFactory omFactory=OMAbstractFactory.getOMFactory();
		
		/*SOAPFactory fac=OMAbstractFactory.getSOAP12Factory();
		SOAPHeader header=fac.getDefaultEnvelope().getHeader();*/
		String timestamp=SignedRequestsHelper.soapTimestamp();
		OMElement hdChild1=omFactory.createOMElement("AWSAccessKeyId","http://security.amazonaws.com/doc/2007-01-01/", "aws");
		hdChild1.setText("AKIAIKBQ6A3OURFXMVPQ");
		/*OMElement hdChild2=omFactory.createOMElement("AssociateTag","http://security.amazonaws.com/doc/2007-01-01/", "aws");
		hdChild2.setText("isnnfoiwnit0d-21");*/
		OMElement hdChild3=omFactory.createOMElement("Timestamp","http://security.amazonaws.com/doc/2007-01-01/", "aws");
		hdChild3.setText(timestamp);
		
		SignedRequestsHelper helper = SignedRequestsHelper.getInstance(AWS_SECRET_KEY);
		OMElement hdChild4=omFactory.createOMElement("Signature","http://security.amazonaws.com/doc/2007-01-01/", "aws");
		hdChild4.setText(helper.sign("ItemSearch",timestamp));
//		hdChild3.setText(helper.sign(params));
		
		
//		header.addChild(hdChild);
		stub._getServiceClient().addHeader(hdChild1);
//		stub._getServiceClient().addHeader(hdChild2);
		stub._getServiceClient().addHeader(hdChild3);
		stub._getServiceClient().addHeader(hdChild4);		
		
		
		ItemSearchRequest isReq=new ItemSearchRequest();
		isReq.setSearchIndex("VideoGames");
		isReq.setBrowseNode("2591141031");
		isReq.setItemPage(new PositiveInteger("1"));
		isReq.setResponseGroup(new String[] {"ItemAttributes","Offers"});

        com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch itemSearch40 =
            (com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch) getTestObject(com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch.class);
        itemSearch40.addRequest(isReq);
        itemSearch40.setAssociateTag("isnnfoiwnit0d-21");
        // TODO : Fill in the itemSearch40 here
        ItemSearchResponse resp=stub.itemSearch(itemSearch40);
        Items_type3[] items=resp.getItems();
        List<Integer> listTots=new ArrayList<Integer>();
        NonNegativeInteger niTotPages=items[0].getTotalPages();
    	int intTotPages=niTotPages.intValue();
    	listTots.add(intTotPages);
        
        isReq=null;
        ItemSearchRequest[] itmSrchReqArr=null;
       	itmSrchReqArr=new ItemSearchRequest[2];
       	int cnt=0;
        for(int q=0;q<=listTots.get(0);q++){
        	isReq=new ItemSearchRequest();
        	isReq.setSearchIndex("VideoGames");
    		isReq.setBrowseNode("2591141031");
        	isReq.setItemPage(new PositiveInteger(Integer.toString(q+1)));
        	isReq.setResponseGroup(new String[] {"ItemAttributes","Offers"});
        	isReq.setSort("salesrank");
        	itmSrchReqArr[cnt]=isReq;
        	if(cnt==1){
        		batch(stub, itmSrchReqArr);
        		cnt=0;
        	}else{
        		++cnt;
        	}
        }
        
       /* itemSearch40.setRequest(itmSrchReqArr);
        itemSearch40.setAssociateTag("isnnfoiwnit0d-21");
        resp=stub.itemSearch(itemSearch40);
        items=resp.getItems();
        for(Items_type3 x:items){
        	for(Item_type3 y:x.getItem()){
        		ItemAttributes_type0 iat=y.getItemAttributes();
        		String price=y.getOfferSummary().getLowestNewPrice().getFormattedPrice();
        		System.out.println(iat.getTitle()+"--"+price);
        	}
    		
    	}*/
        System.out.println();
        	/*for(int q=1;q<=intTottPages;q++){
        		isReq.setItemPage(new PositiveInteger(Integer.toString(q)));
        		itemSearch40.addRequest(isReq);
                itemSearch40.setAssociateTag("isnnfoiwnit0d-21");
        	}
        	Item_type3[] x=i.getItem();
        	for(Item_type3 y:x){
        		ItemAttributes_type0 iat=y.getItemAttributes();
        		System.out.println(iat.getTitle());
        	}
        
        System.out.println();*/
	}
	
	public static org.apache.axis2.databinding.ADBBean getTestObject(
	        java.lang.Class type) throws java.lang.Exception {
	        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	    }
	
	public static void batch(AWSECommerceServiceStub stub, ItemSearchRequest[] batchReq) throws Exception{
		com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch itemSearch40 =
	            (com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch) getTestObject(com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch.class);
		itemSearch40.setRequest(batchReq);
        itemSearch40.setAssociateTag("isnnfoiwnit0d-21");
        ItemSearchResponse resp=stub.itemSearch(itemSearch40);
        Thread.sleep(1000);
        Items_type3[] items=resp.getItems();
        for(Items_type3 x:items){
        	for(Item_type3 y:x.getItem()){
        		ItemAttributes_type0 iat=y.getItemAttributes();
        		String price=y.getOfferSummary().getLowestNewPrice().getFormattedPrice();
        		System.out.println(iat.getTitle()+"--"+price);
        	}
    		
    	}
	}
}
