package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		
		
		Scanner myScanner = new Scanner(System.in);
		
		//ask user to enter temp
		
		System.out.print("Please enter the temperature: ");
		  String answer = myScanner.nextLine();
		  
		  int temp = Integer.parseInt(answer);
		  
		  System.out.print("Is the temperature in (C)elsius C, or (F)ahrenheit? F");
			String input = myScanner.nextLine();
		
			if (input.equalsIgnoreCase("Celsius") || input.equalsIgnoreCase("C")) {
				  System.out.print(temp + "C" +" is " + temp *1.8 + 32  +"C");
				  
			}
			if (input.equalsIgnoreCase("Farenheit") || input.equalsIgnoreCase("F")){
				  System.out.print(temp + "F" +" is " + (temp- 32)/1.8  +"F");
			}

	
	}
	
	

}
