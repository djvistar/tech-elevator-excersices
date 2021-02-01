package com.techelevator;



import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WordCountTest {
	
	
	
	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for
	 * each different string, with the value the number of times that string appears
	 * in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * getCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * getCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
	 * getCount([]) → {}
	 * getCount(["c", "b", "a"]) → {"c": 1, "b": 1, "a": 1}
	 *
	 */
	
	
//	  WordCount wordCount = new WordCount();
//      [TestMethod()]
//      public void WordCountTests()
//      {
//          CollectionAssert.AreEqual(new Dictionary<string, int>() { { "ba", 2 }, { "black", 1 }, { "sheep", 1 } }, wordCount.GetCount(new string[] { "ba", "ba", "black", "sheep" }), "Bloop");
//          CollectionAssert.AreEqual(new Dictionary<string, int>() { { "a", 2 }, { "b", 2 }, { "c", 1 } }, wordCount.GetCount(new string[] { "a", "b", "a", "c", "b" }), "Boop");
//          CollectionAssert.AreEqual(new Dictionary<string, int>(), wordCount.GetCount(new string[] { }), "Ploop");
//          CollectionAssert.AreEqual(new Dictionary<string, int>() { { "c", 1 }, { "b", 1 }, { "a", 1 } }, wordCount.GetCount(new string[] { "c", "b", "a" }), "Oop");
//      }
	
	


	private  WordCount  wordCount;
	
	
	
	@Before
	public void setup() {
		wordCount = new  WordCount();
		 
	}
	
	
	@Test
	
	public void test_to_return_number_of_times_the_string_appears() {
		//Map<String, Integer> getCount(String[] { });
		//Map<String, Integer> output = wordCount.getCount(new String[] { });
		//Map<String, Integer> output = new HashMap<>();
		
		
	
		
		
		Map<String, Integer> output = wordCount.getCount(new String[] { "a", "b", "a", "c", "b" });
		Assert.assertEquals("wordCount 	([\"a\", \"b\", \"a\", \"c\", \"b\"])", output.size(), equals(3));
		assertThat("wordCount([\"a\", \"b\", \"a\", \"c\", \"b\"])", output, hasEntry("a", 2));
		assertThat("wordCount([\"a\", \"b\", \"a\", \"c\", \"b\"])", output, hasEntry("b", 2));
		assertThat("wordCount([\"a\", \"b\", \"a\", \"c\", \"b\"])", output, hasEntry("c", 1));
		
		
		output = wordCount.getCount(new String[] { "c", "b", "a" });
		Assert.assertEquals("wordCount([\"c\", \"b\", \"a\"])", output.size(), equals(3));
		assertThat("wordCount([\"c\", \"b\", \"a\"])", output, hasEntry("a", 1));
		assertThat("wordCount([\"c\", \"b\", \"a\"])", output, hasEntry("b", 1));
		assertThat("wordCount([\"c\", \"b\", \"a\"])", output, hasEntry("c", 1));

		output = wordCount.getCount(new String[] { });
		Assert.assertEquals("wordCount([])", output.size(), equals(0));
		
		output = wordCount.getCount(new String[] { "ba", "ba", "black", "sheep" });
		Assert.assertEquals("wordCount([\"ba\", \"ba\", \"black\", \"sheep\"])", output.size(), equals(3));
		assertThat("wordCount([\"ba\", \"ba\", \"black\", \"sheep\"])", output, hasEntry("ba", 2));
		assertThat("wordCount([\"ba\", \"ba\", \"black\", \"sheep\"])", output, hasEntry("black", 1));
		assertThat("wordCount([\"ba\", \"ba\", \"black\", \"sheep\"])", output, hasEntry("sheep", 1));

		output = wordCount.getCount(new String[] { "ba", "ba", "black", "sheep", "ba", "ba", "black", "sheep" });
		Assert.assertEquals("wordCount([\"ba\", \"ba\", \"black\", \"sheep\", \"ba\", \"ba\", \"black\", \"sheep\"])", output.size(), equals(3));
		assertThat("wordCount([\"ba\", \"ba\", \"black\", \"sheep\", \"ba\", \"ba\", \"black\", \"sheep\"])", output, hasEntry("ba", 4));
		assertThat("wordCount([\"ba\", \"ba\", \"black\", \"sheep\", \"ba\", \"ba\", \"black\", \"sheep\"])", output, hasEntry("black", 2));
		assertThat("wordCount([\"ba\", \"ba\", \"black\", \"sheep\", \"ba\", \"ba\", \"black\", \"sheep\"])", output, hasEntry("sheep", 2));
		
	

		
		
		
	}


	private Matcher hasEntry(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	

}
