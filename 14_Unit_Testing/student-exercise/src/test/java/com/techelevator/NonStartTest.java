package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NonStartTest {
	
	
	
	  /*
    Given 2 strings, return their concatenation, except omit the first char of each. The strings will
    be at least length 1.
    GetPartialString("Hello", "There") → "ellohere"
    GetPartialString("java", "code") → "avaode"
    GetPartialString("shotl", "java") → "hotlava"
    */
	

//    NonStart nonStart = new NonStart();
//    [TestMethod()]
//    public void NonStartTest()
//    {
//        Assert.AreEqual("ellohere", nonStart.GetPartialString("Hello", "There"), "Just...wrong...");
//        Assert.AreEqual("avaode", nonStart.GetPartialString("Java", "Code"), "Just...wrong...");
//        Assert.AreEqual("hotlava", nonStart.GetPartialString("shotl", "java"), "Just...wrong...");
//    }
//	
	

	private  NonStart  nonStart;
	
	
	
	@Before
	public void setup() {
		 nonStart = new  NonStart();
		 
	}
	
	
	
	@Test
	
	public void test_to_return_concatenation_while_omitting_first_and_last_characters() {
		
		Assert.assertEquals("Testing first case: ","ellohere", nonStart.getPartialString("Hello", "There"));
		Assert.assertEquals("Testing second case: ","avaode", nonStart.getPartialString("Java", "Code"));
		Assert.assertEquals("Testing third case: ","hotlava", nonStart.getPartialString("shotl", "java"));
	
	
	
	
	}
	
	
	
	
	

}
