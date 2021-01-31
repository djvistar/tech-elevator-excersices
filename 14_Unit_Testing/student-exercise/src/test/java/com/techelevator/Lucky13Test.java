package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Lucky13Test {
	
	
	/*
	 * Given an array of ints, return true if the array contains no 1's and no 3's.
	 * GetLucky([0, 2, 4]) → true GetLucky([1, 2, 3]) → false GetLucky([1, 2,
	 * 4]) → false
	 */
	
	
	private Lucky13 lucky13;
	
	@Before
	public void setup() {
		lucky13 = new Lucky13();
		 
	}
	
	@Test
	public void test_if_array_contains_no1s_and_no3s() {
		
		
		
		Assert.assertEquals("Testing other numbers: ",true, lucky13.getLucky(new int[] { 0, 2, 4 }));
		Assert.assertEquals("Testing for 1 and 3: ",false, lucky13.getLucky(new int[] { 1, 2, 3 }));
		Assert.assertEquals("Testing for 1 : ",false, lucky13.getLucky(new int[] { 1, 2, 4 }));
		
		
		
     }
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
