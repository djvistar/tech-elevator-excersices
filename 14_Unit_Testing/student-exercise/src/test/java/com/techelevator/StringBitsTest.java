package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringBitsTest {

	
	
	/*
	 * Given a string, return a new string made of every other char starting with
	 * the first, so "Hello" yields "Hlo". GetBits("Hello") → "Hlo" GetBits("Hi")
	 * → "H" GetBits("Heeololeo") → "Hello"
	 */
	

	

	private  StringBits  stringBits;
	
	
	
	@Before
	public void setup() {
		stringBits = new  StringBits();
		 
	}
	
	@Test
	public void test_to_return_new_string_made_of_every_other_char_starting_with_the_first() {
		
		
		Assert.assertEquals("Testing first case: ","Hlo", stringBits.getBits("Hello"));
		Assert.assertEquals("Testing second case: ","H", stringBits.getBits("Hi"));
		Assert.assertEquals("Testing third case: ","Hello", stringBits.getBits("Heeololeo"));
		
		
		
		
		
	}
	
	
	
	
	
	
}
