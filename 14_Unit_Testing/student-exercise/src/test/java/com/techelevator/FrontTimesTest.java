package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FrontTimesTest {

	
	/*
	 * Given a string and a non-negative int n, we'll say that the front of the
	 * string is the first 3 chars, or whatever is there if the string is less than
	 * length 3. Return n copies of the front; frontTimes("Chocolate", 2) →
	 * "ChoCho" frontTimes("Chocolate", 3) → "ChoChoCho" frontTimes("Abc", 3) →
	 * "AbcAbcAbc"
	 */
	
	
private  FrontTimes frontTimes;
	
	
	
	@Before
	public void setup() {
		frontTimes = new  FrontTimes();
		 
	}
	
	@Test
	public void test_to_return_copies_of_the_front_three_characters() {
		
		
		Assert.assertEquals("Testing first case: ","ChoCho", frontTimes.generateString("Chocolate", 2));
		Assert.assertEquals("Testing second case: ","ChoChoCho", frontTimes.generateString("Chocolate", 3));
		Assert.assertEquals("Testing third case: ","AbcAbcAbc", frontTimes.generateString("Abc", 3));
		
		
	}
	
	
	
	
	
}
