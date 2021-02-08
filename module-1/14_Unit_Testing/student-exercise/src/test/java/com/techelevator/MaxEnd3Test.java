package com.techelevator;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxEnd3Test {

	/*
    Given an array of ints length 3, figure out which is larger between the first and last elements
    in the array, and set all the other elements to be that value. Return the changed array.
    MakeArray([1, 2, 3]) → [3, 3, 3]
    MakeArray([11, 5, 9]) → [11, 11, 11]
    MakeArray([2, 11, 3]) → [3, 3, 3]
    */
	
	
	
	
	private MaxEnd3 maxEnd3;
	
	
	
	@Before
	public void setup() {
		maxEnd3 = new  MaxEnd3();
		 
	}
	
	
 @Test
 public void test_which_int_is_larger_between_first_and_last_elements() {
	 
	 assertArrayEquals("Testing for (new int[]{1, 2, 3}): ",new int[] { 3, 3, 3 }, maxEnd3.makeArray(new int[] { 1, 2, 3 }));
	 assertArrayEquals("Testing for (new int[] { 11, 5, 9 }): ",new int[] { 11, 11, 11}, maxEnd3.makeArray(new int[] {  11, 5, 9 }));
	 assertArrayEquals("Testing for (new int[] { 2, 11, 3 }): ",new int[] { 3, 3, 3 }, maxEnd3.makeArray(new int[] { 2, 11, 3  }));
	 
 
	 
 }
	
	
	
	
}
