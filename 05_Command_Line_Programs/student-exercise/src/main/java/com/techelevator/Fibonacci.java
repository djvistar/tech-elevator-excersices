package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		 Scanner myScanner = new Scanner(System.in);
		 
		 //ask user for to enter number
		 
		 System.out.println("Please enter the Fibonacci number:");
		 String answer = myScanner.nextLine();
		 
		 int number = Integer.parseInt(answer);
		 
		 
		 System.out.println("The sequence for "+ number +" is:");
		 
		 
		 int sum, a=0, b = 1;
		 for (int i = 1; i <= number; ++i) {
			 
			 System.out.print(a +" , ");

	            
	            sum = a + b;
	            a = b;
	            b = sum;
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
