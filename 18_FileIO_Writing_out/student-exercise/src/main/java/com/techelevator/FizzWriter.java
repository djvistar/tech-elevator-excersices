package com.techelevator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) throws IOException {

		
		
		String result = "";
		for(int i = 1; i <= 300; i++) {
			result += fizzWriter(i) +" ";
		}
		
		File fileName = new File("FizzBuzz.txt");
		
		fileName.createNewFile();
		try ( PrintWriter writer = new PrintWriter(fileName)){
			writer.println(result);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
	
		}		
		System.out.println("FizzBuzz.txt has been created.");
		
				
	} 
	
	public static String fizzWriter(int number) {
		//result.valueOf(number);
		//return result;
		
		String numberAsString = new Integer(number).toString();
		
		if(number >= 1 && number <= 100) {
			if(number % 3 == 0 && number % 5 == 0) {
				return "FizzBuzz";
			}
			else {
				if(numberAsString.contains("3")) {
					if(numberAsString.contains("5")) {
						return "FizzBuzz";
				}
				
				return "Fizz";
		
			}
			 if(numberAsString.contains("5")) {
				 if(numberAsString.contains("3")) {
					 return "FizzBuzz";
				 }
				 return "Buzz";
			
			}
			else {
						if(number % 3 == 0)  {
							return "Fizz";
						}
						if(number % 5 == 0) {
							return "Buzz";
					
						}
					
					return numberAsString;
					}
			
			}
		}
			
		return " " ;
		
		
	}
		

}


