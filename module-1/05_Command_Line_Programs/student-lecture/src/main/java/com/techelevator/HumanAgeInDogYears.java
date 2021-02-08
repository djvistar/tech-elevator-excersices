package com.techelevator;

import java.util.Scanner;

public class HumanAgeInDogYears {

	public static void main(String[] args) {
		
		
		//create scanner
		
		Scanner myScanner =new Scanner(System.in);
		
		System.out.println("How old are you human?");
		
		String answer = myScanner.nextLine();
		
		int humanAge = Integer.parseInt(answer);
//		double ageAsDouble = Double.parseDouble(answer);
//		float ageAsFloat = Float.parseFloat(answer);
//		boolean ageAsBoolean = Boolean.parseBoolean(answer);
//		
				
		
		System.out.println("You are " + (humanAge * 7)  + " in dog years");
		
		System.out.println("What is the dog's age?");
		int age = myScanner.nextInt();
		myScanner.nextLine();
		
		System.out.println(age);
		
		
	
		System.out.println("Enter 4 values separated by spaces");
		String values = myScanner.nextLine();
		
		
		String[] inputValue = values.split(" ");
		
		for (int i = 0; i <inputValue.length; i++) {
		System.out.println("The value of index" + i + " is " + inputValue[i]);
		}
	}

}
