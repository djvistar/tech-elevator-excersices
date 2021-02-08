package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTest {

	
	  /*
    Given an array of ints, return true if the array is length 1 or more, and the first element and
    the last element are equal.
    IsItTheSame([1, 2, 3]) → false
    IsItTheSame([1, 2, 3, 1]) → true
    IsItTheSame([1, 2, 1]) → true
    */
	
	
	
	
	private SameFirstLast sameFirstLast;
	
	
	
	@Before
	public void setup() {
		sameFirstLast = new SameFirstLast();
		 
	}

	
	@Test
	 public void test_to_see_if_length_is_more_than_1_and_first_and_last_elements_are_equal() {
		
		Assert.assertEquals("More than one but not equal: ",false, sameFirstLast.isItTheSame(new int[] {1, 2, 3}));
		Assert.assertEquals("More than one and equal: ",true, sameFirstLast.isItTheSame(new int[] { 1, 2, 3, 1 }));
		Assert.assertEquals("More than one and equal: ",true, sameFirstLast.isItTheSame(new int[] { 1, 2, 1 }));
	
	
	
	
	
	}
	
	
	
}
