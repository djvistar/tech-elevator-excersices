package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		
	Scanner myScanner = new Scanner(System.in);
		
		//ask user to enter length
		
		System.out.print("Please enter the length: ");
		  String answer = myScanner.nextLine();
		  
		  int length = Integer.parseInt(answer);
		  
		  System.out.print("Is the measurement in (m)eter, or (f)eet? f");
			String input = myScanner.nextLine();
		
			if (input.equalsIgnoreCase("meter") || input.equalsIgnoreCase("m")) {
				  System.out.print(length + "m" +" is " + length*3.2808399  +"f");
				  
			}
			if (input.equalsIgnoreCase("feet") || input.equalsIgnoreCase("f")){
				  System.out.print(length + "f" +" is " + length * 0.3048  +"m");
			}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
