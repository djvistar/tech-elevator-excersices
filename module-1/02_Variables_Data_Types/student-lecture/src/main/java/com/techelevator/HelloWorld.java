package com.techelevator;

public class HelloWorld {

	public static void main(String[] args) {
		// This is a single line comment

		String firstName; // variable declaration 
		
		firstName = "Victor"; //Assignment --> assigning value of victor to first name
		
		String lastName = "G"; // DECLARING +ASSIGNMENT ON SAME LINE
		
		String checkingAccountNumber = "8794569";
		
		long age= 7;
		int age2= 7;
		
		age2 = (int)age;
		
		
		boolean isAdult = false;
		
		
		System.out.println("Hello" + firstName + " " + lastName);
		
		String name = "\"Let's let off some steam!\" " + firstName;
		System.out.println(name);
		
		//numeric data types
		
		age = 7;
		
		//floating point
		float myFloat = (float)2.76; //by default 2.76 will be interpreted as double 
		
		float  myFloat2 = 9.99F;
		
		double myDouble = 2.76;
		
		//truncation
		
		int sum = age2 / 2; //will truncation and return whole number
		System.out.println(sum);
		
		//modulus
		
		
	}

}
