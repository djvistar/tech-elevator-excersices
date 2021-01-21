package com.techelevator.homes;

public class HomeApp {

	public static void main(String[] args) {
		
		
		Home home = new Home();//turning a class into an object
		
		home.setAcreage(10);
		home.setHasBasement(true);
		home.setNeighbourhoodName("THE CREEK");
		
		System.out.println("Home1: " + home.getAcreage());
		
		home.listHomeForSale("ABC345", 100000.00);
		
		home.setPrice(300000.00);
		
		Home home2 = new Home(); //creating another instance

		home2.setAcreage(5);
		home2.setActiveListing(true);
		home2.setNumberOfBathrooms(11.5);
		
		System.out.println("Home2: " + home2.getAcreage());
		
		
		
		
		
	}

}
