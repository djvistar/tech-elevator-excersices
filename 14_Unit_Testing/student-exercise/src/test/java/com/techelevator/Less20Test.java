package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Less20Test {

	
	
	 /*
    Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38
    and 39 return true, but 40 returns false.
    (Hint: Think "mod".)
    less20(18) → true
    less20(19) → true
    less20(20) → false
*/
	
	
	
	
	
	
	
private Less20  less20;
	
	
	
	@Before
	public void setup() {
		less20 = new  Less20();
		 
	}
	
@Test
public void test_to_return_true_if_number_is_1or2_less_than_multiple_of_20() {
	
	
	Assert.assertEquals("Input: less20(18)", true, less20.isLessThanMultipleOf20(18));
	Assert.assertEquals("Input: less20(19)", true, less20.isLessThanMultipleOf20(19));
	Assert.assertEquals("Input: less20(20)", false, less20.isLessThanMultipleOf20(20));
	Assert.assertEquals("Input: less20(38)", true, less20.isLessThanMultipleOf20(38));
	Assert.assertEquals("Input: less20(39)", true, less20.isLessThanMultipleOf20(39));
	Assert.assertEquals("Input: less20(40)", false, less20.isLessThanMultipleOf20(40));
	Assert.assertEquals("Input: less20(21)", false, less20.isLessThanMultipleOf20(21));
	Assert.assertEquals("Input: less20(41)", false, less20.isLessThanMultipleOf20(41));
	
	
	
	
	
}
	
	
	
	
	
	
}
