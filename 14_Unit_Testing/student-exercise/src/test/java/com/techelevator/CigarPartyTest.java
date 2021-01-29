package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CigarPartyTest {
	
	

    /*
     When squirrels get together for a party, they like to have cigars. A squirrel party is successful
     when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case
     there is no upper bound on the number of cigars. Return true if the party with the given values is
     successful, or false otherwise.
     haveParty(30, false) → false
     haveParty(50, false) → true
     haveParty(70, true) → true
     */
	
	// public boolean haveParty(int cigars, boolean isWeekend)
	
	private CigarParty cigarParty;
	
	
	@Before
	public void setup() {
		cigarParty = new CigarParty();
		 
	}
	
	@Test
	public void test_party_successful_in_range_inlusive_not_weekend() {
		
		
		//Assert
		
		Assert.assertEquals("Testing not weekend cigars in range: ", true, cigarParty.haveParty(40, false));
		Assert.assertEquals("Testing not weekend cigars in range: ", true, cigarParty.haveParty(41, false));
		Assert.assertEquals("Testing not weekend cigars in range: ", true, cigarParty.haveParty(60, false));
	
	}
	
	
	@Test
	public void test_party_not_successful_out_of_range_inlusive_not_weekend() {
		
		
		//Assert
		
		Assert.assertEquals("Testing not weekend cigars out range: ", false, cigarParty.haveParty(39, false));
		Assert.assertEquals("Testing not weekend cigars out range: ", false, cigarParty.haveParty(4, false));
		Assert.assertEquals("Testing not weekend cigars out range: ", false, cigarParty.haveParty(64, false));
	
	}
	
	
	
	
	
	
	
	

}
