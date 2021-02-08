package com.techelevator.homes;

public class Home {
	//Instance(member) variables -->data that each object holds
	
	private String mlsNumber;
	private double numberOfBedrooms;
	private int squareFeet;
	private int acreage;
	private double numberOfBathrooms;
	private String neighbourhoodName;
	private boolean hasBasement;
	private double garageSize;
	private double price;	
	
	private boolean isSold;
	private boolean isActiveListing;
	
	
	//constructor(s)-->initializing
	
	
	
	
	
	
	//methods(public or private)
	
	public void listHomeForSale(String mlsNumber, double price) {
		this.isActiveListing =true;
		
		if (mlsNumber !=null || !mlsNumber.equals("")){
			this.mlsNumber = mlsNumber;
		}
		
		else {
			System.out.println("You need to supply a MLS number");
		}
		if (price <=0) {
			System.out.println("You don't like earning commission do you?");
		}
		this.price = price;
	}

	
	

	public String getMlsNumber() {
		return mlsNumber;
	}


	public void setMlsNumber(String mlsNumber) {
		this.mlsNumber = mlsNumber;
	}


	public double getNumberOfBedrooms() {
		return numberOfBedrooms;
	}


	public void setNumberOfBedrooms(double numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}


	public int getSquareFeet() {
		return squareFeet;
	}


	public void setSquareFeet(int squareFeet) {
		this.squareFeet = squareFeet;
	}


	public int getAcreage() {
		return acreage;
	}


	public void setAcreage(int acreage) {
		this.acreage = acreage;
	}


	public double getNumberOfBathrooms() {
		return numberOfBathrooms;
	}


	public void setNumberOfBathrooms(double numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}


	public String getNeighbourhoodName() {
		return neighbourhoodName;
	}


	public void setNeighbourhoodName(String neighbourhoodName) {
		this.neighbourhoodName = neighbourhoodName;
	}


	public boolean isHasBasement() {
		return hasBasement;
	}


	public void setHasBasement(boolean hasBasement) {
		this.hasBasement = hasBasement;
	}


	public double getGarageSize() {
		return garageSize;
	}


	public void setGarageSize(double garageSize) {
		this.garageSize = garageSize;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public boolean isSold() {
		return isSold;
	}


	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}


	public boolean isActiveListing() {
		return isActiveListing;
	}


	public void setActiveListing(boolean isActiveListing) {
		this.isActiveListing = isActiveListing;
	}
	
	
	
	
	//getter/setter methods
	

}
