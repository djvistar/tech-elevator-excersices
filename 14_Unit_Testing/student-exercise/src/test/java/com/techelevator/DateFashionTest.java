package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateFashionTest {

	 /*
    You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness
    of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result
    getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very
    stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of
    2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
    dateFashion(5, 10) → 2
    dateFashion(5, 2) → 0
    dateFashion(5, 5) → 1
    */
	
	
	
	
private DateFashion  dateFashion;
	
	
	
	@Before
	public void setup() {
		dateFashion = new  DateFashion();
		 
	}
	
@Test
public void test_to_see_if_you_and_date_will_get_a_table() {
	
	
	Assert.assertEquals("dateFashion(5, 10) ", 2, dateFashion.getATable(5, 10));
	Assert.assertEquals("dateFashion(10, 5) ", 2, dateFashion.getATable(10, 5));
	Assert.assertEquals("dateFashion(8, 8) ", 2, dateFashion.getATable(8, 8));
	Assert.assertEquals("dateFashion(2, 10) ", 0, dateFashion.getATable(2, 10));
	Assert.assertEquals("dateFashion(10, 1) ", 0, dateFashion.getATable(10, 1));
	Assert.assertEquals("dateFashion(5, 2) ", 0, dateFashion.getATable(5, 2));
	Assert.assertEquals("dateFashion(2, 2) ", 0, dateFashion.getATable(2, 2));
	Assert.assertEquals("dateFashion(5, 5) ", 1, dateFashion.getATable(5, 5));
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
