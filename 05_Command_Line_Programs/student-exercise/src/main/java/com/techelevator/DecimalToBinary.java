package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {
	

	public static void main(String[] args) {

	
Scanner input = new Scanner(System.in);		

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		
		
		String decimalValues = input.nextLine();
		String[] values = decimalValues.split(" ");
		
		
		
		for(int i = 0;  i < values.length ; i++) {
		int num = Integer.parseInt(values[i]);
		System.out.print(num + " in binary is ");
		
		decimalToBinary(num);
		System.out.println(" ");
		}				     										
	}	
   public static void decimalToBinary(int num){
		
		int binary[] = new int[20];
		int a = 0;
	
		while (num >0){
			
			binary[a++] = num % 2 ;
			num = num / 2;						
		}
		for(int i = a-1;i >= 0;i--){
			
		       System.out.print(binary[i]);
		}		
	}		
		
		
		
}
	
	
	


