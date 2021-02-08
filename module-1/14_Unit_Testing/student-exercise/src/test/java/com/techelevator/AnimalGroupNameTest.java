package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class AnimalGroupNameTest {


    /*
     * Given the name of an animal, return the name of a group of that animal
     * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
     *
     * The animal name should be case insensitive so "elephant", "Elephant", and
     * "ELEPHANT" should all return "herd".
     *
     * If the name of the animal is not found, null, or empty, return "unknown".
     *
     * Rhino -> Crash
     * Giraffe -> Tower
     * Elephant -> Herd
     * Lion -> Pride
     * Crow -> Murder
     * Pigeon -> Kit
     * Flamingo -> Pat
     * Deer -> Herd
     * Dog -> Pack
     * Crocodile -> Float
     *
     * GetHerd("giraffe") → "Tower"
     * GetHerd("") -> "unknown"
     * GetHerd("walrus") -> "unknown"
     * GetHerd("Rhino") -> "Crash"
     * GetHerd("rhino") -> "Crash"
     * GetHerd("elephants") -> "unknown"
     *
     */
	
	
	// public String getHerd(String animalName)
	
	
	
	private AnimalGroupName animalGroupName;
	
	@Before
	public void setup() {
		 animalGroupName = new AnimalGroupName();
	}
	
	@Test
	
	public void test_group_name_mateches_animal_name_and_found() {
		
		//Arrange
		
		
		//Act
		Assert.assertEquals("Testing value is: ", "Crash", animalGroupName.getHerd("Rhino"));
		Assert.assertEquals("Testing value is: ", "Tower", animalGroupName.getHerd("Giraffe"));
		Assert.assertEquals("Testing value is: ", "Herd", animalGroupName.getHerd("Elephant"));
		Assert.assertEquals("Testing value is: ", "Pride", animalGroupName.getHerd("Lion"));
		Assert.assertEquals("Testing value is: ", "Murder", animalGroupName.getHerd("Crow "));
		Assert.assertEquals("Testing value is: ", "Kit", animalGroupName.getHerd("Pigeon"));
		Assert.assertEquals("Testing value is: ", "Pat", animalGroupName.getHerd("Flamingo"));
		Assert.assertEquals("Testing value is: ", "Herd", animalGroupName.getHerd("Deer"));
		Assert.assertEquals("Testing value is: ", "Pack", animalGroupName.getHerd("Dog"));
		Assert.assertEquals("Testing value is: ", "Float", animalGroupName.getHerd("Crocodile"));
		//Assert
	}
	
	@Test
	public void test_group_name_mateches_animal_name_and_found_case_insenstive() {
		
	
		Assert.assertEquals("Testing value is: ", "Crash", animalGroupName.getHerd("RHINO"));
		Assert.assertEquals("Testing value is: ", "Crash", animalGroupName.getHerd("rhino"));
		Assert.assertEquals("Testing value is: ", "Tower", animalGroupName.getHerd("GIRAFFE"));
		Assert.assertEquals("Testing value is: ", "Tower", animalGroupName.getHerd("giraffe"));
		Assert.assertEquals("Testing value is: ", "Pride", animalGroupName.getHerd("LION"));
		Assert.assertEquals("Testing value is: ", "Pride", animalGroupName.getHerd("lion"));
		Assert.assertEquals("Testing value is: ", "Murder", animalGroupName.getHerd("CROW"));
		Assert.assertEquals("Testing value is: ", "Murder", animalGroupName.getHerd("crow"));
		Assert.assertEquals("Testing value is: ", "Kit", animalGroupName.getHerd("PIGEON"));
		Assert.assertEquals("Testing value is: ", "Kit", animalGroupName.getHerd("pigeon"));
		Assert.assertEquals("Testing value is: ", "Pat", animalGroupName.getHerd("FLAMINGO"));
		Assert.assertEquals("Testing value is: ", "Pat", animalGroupName.getHerd("flamingo"));
		Assert.assertEquals("Testing value is: ", "Herd", animalGroupName.getHerd("DEER"));
		Assert.assertEquals("Testing value is: ", "Herd", animalGroupName.getHerd("deer"));
		Assert.assertEquals("Testing value is: ", "Pack", animalGroupName.getHerd("dog"));
		Assert.assertEquals("Testing value is: ", "Pack", animalGroupName.getHerd("DOG"));
		Assert.assertEquals("Testing value is: ", "Float", animalGroupName.getHerd("CROCODILE"));
		Assert.assertEquals("Testing value is: ", "Float", animalGroupName.getHerd("crocodile"));
		
		
	}
	
	@Test
	public void test_sending_null_value() {
		Assert.assertEquals("Testing value is returning  ", "unknown", animalGroupName.getHerd("null"));
		
	}
	
	@Test
	public void test_sending_unknown_value() {
		Assert.assertEquals("Testing value is returning  ", "unknown", animalGroupName.getHerd(" "));
		
	}
	
	@Test
	public void test_sending_animal_not_found_value() {
	
			Assert.assertEquals("Testing value is returning  ", "unknown", animalGroupName.getHerd("buffalo"));
	}
	
	
}
