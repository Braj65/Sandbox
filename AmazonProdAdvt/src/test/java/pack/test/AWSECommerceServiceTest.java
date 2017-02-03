/**
 * AWSECommerceServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package pack.test;

import com.amazon.stubs.AWSECommerceServiceStub;

/*
 *  AWSECommerceServiceTest Junit test case
 */
public class AWSECommerceServiceTest extends junit.framework.TestCase {
    /**
     * Auto generated test method
     */
    public void testcartModify() throws java.lang.Exception {
        AWSECommerceServiceStub stub = new AWSECommerceServiceStub(); //the default implementation should point to the right endpoint

        com.amazon.webservices.awsecommerceservice._2013_08_01.CartModify cartModify36 =
            (com.amazon.webservices.awsecommerceservice._2013_08_01.CartModify) getTestObject(com.amazon.webservices.awsecommerceservice._2013_08_01.CartModify.class);
        // TODO : Fill in the cartModify36 here
        assertNotNull(stub.cartModify(cartModify36));
    }

    /**
     * Auto generated test method
     */
    public void testitemLookup() throws java.lang.Exception {
        AWSECommerceServiceStub stub = new AWSECommerceServiceStub(); //the default implementation should point to the right endpoint

        com.amazon.webservices.awsecommerceservice._2013_08_01.ItemLookup itemLookup38 =
            (com.amazon.webservices.awsecommerceservice._2013_08_01.ItemLookup) getTestObject(com.amazon.webservices.awsecommerceservice._2013_08_01.ItemLookup.class);
        // TODO : Fill in the itemLookup38 here
        assertNotNull(stub.itemLookup(itemLookup38));
    }

    /**
     * Auto generated test method
     */
    public void testitemSearch() throws java.lang.Exception {
        AWSECommerceServiceStub stub = new AWSECommerceServiceStub(); //the default implementation should point to the right endpoint

        com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch itemSearch40 =
            (com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch) getTestObject(com.amazon.webservices.awsecommerceservice._2013_08_01.ItemSearch.class);
        // TODO : Fill in the itemSearch40 here
        assertNotNull(stub.itemSearch(itemSearch40));
    }

    /**
     * Auto generated test method
     */
    public void testcartCreate() throws java.lang.Exception {
        AWSECommerceServiceStub stub = new AWSECommerceServiceStub(); //the default implementation should point to the right endpoint

        com.amazon.webservices.awsecommerceservice._2013_08_01.CartCreate cartCreate42 =
            (com.amazon.webservices.awsecommerceservice._2013_08_01.CartCreate) getTestObject(com.amazon.webservices.awsecommerceservice._2013_08_01.CartCreate.class);
        // TODO : Fill in the cartCreate42 here
        assertNotNull(stub.cartCreate(cartCreate42));
    }

    /**
     * Auto generated test method
     */
    public void testbrowseNodeLookup() throws java.lang.Exception {
        AWSECommerceServiceStub stub = new AWSECommerceServiceStub(); //the default implementation should point to the right endpoint

        com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup browseNodeLookup44 =
            (com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup) getTestObject(com.amazon.webservices.awsecommerceservice._2013_08_01.BrowseNodeLookup.class);
        // TODO : Fill in the browseNodeLookup44 here
        assertNotNull(stub.browseNodeLookup(browseNodeLookup44));
    }

    /**
     * Auto generated test method
     */
    public void testcartGet() throws java.lang.Exception {
        AWSECommerceServiceStub stub = new AWSECommerceServiceStub(); //the default implementation should point to the right endpoint

        com.amazon.webservices.awsecommerceservice._2013_08_01.CartGet cartGet46 =
            (com.amazon.webservices.awsecommerceservice._2013_08_01.CartGet) getTestObject(com.amazon.webservices.awsecommerceservice._2013_08_01.CartGet.class);
        // TODO : Fill in the cartGet46 here
        assertNotNull(stub.cartGet(cartGet46));
    }

    /**
     * Auto generated test method
     */
    public void testcartClear() throws java.lang.Exception {
        AWSECommerceServiceStub stub = new AWSECommerceServiceStub(); //the default implementation should point to the right endpoint

        com.amazon.webservices.awsecommerceservice._2013_08_01.CartClear cartClear48 =
            (com.amazon.webservices.awsecommerceservice._2013_08_01.CartClear) getTestObject(com.amazon.webservices.awsecommerceservice._2013_08_01.CartClear.class);
        // TODO : Fill in the cartClear48 here
        assertNotNull(stub.cartClear(cartClear48));
    }

    /**
     * Auto generated test method
     */
    public void testcartAdd() throws java.lang.Exception {
        AWSECommerceServiceStub stub = new AWSECommerceServiceStub(); //the default implementation should point to the right endpoint

        com.amazon.webservices.awsecommerceservice._2013_08_01.CartAdd cartAdd50 =
            (com.amazon.webservices.awsecommerceservice._2013_08_01.CartAdd) getTestObject(com.amazon.webservices.awsecommerceservice._2013_08_01.CartAdd.class);
        // TODO : Fill in the cartAdd50 here
        assertNotNull(stub.cartAdd(cartAdd50));
    }

    /**
     * Auto generated test method
     */
    public void testsimilarityLookup() throws java.lang.Exception {
        AWSECommerceServiceStub stub = new AWSECommerceServiceStub(); //the default implementation should point to the right endpoint

        com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarityLookup similarityLookup52 =
            (com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarityLookup) getTestObject(com.amazon.webservices.awsecommerceservice._2013_08_01.SimilarityLookup.class);
        // TODO : Fill in the similarityLookup52 here
        assertNotNull(stub.similarityLookup(similarityLookup52));
    }

    //Create an ADBBean and provide it as the test object
    public org.apache.axis2.databinding.ADBBean getTestObject(
        java.lang.Class type) throws java.lang.Exception {
        return (org.apache.axis2.databinding.ADBBean) type.newInstance();
    }
}
