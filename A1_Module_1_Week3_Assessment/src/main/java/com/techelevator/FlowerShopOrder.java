package com.techelevator;

public class FlowerShopOrder {

	private String bouquetType;
	private int numberOfRoses;
	private double subtotal;
	
	
	
	public FlowerShopOrder(String bouquetType, int numberOfRoses) {
		
		this.bouquetType = bouquetType;
		this.numberOfRoses = numberOfRoses;
		
	}
	
	
	
	
	
	
	
	
	
	//getters
	
	public String getBouquetType() {
		return bouquetType;
	}
	public int getNumberOfRoses() {
		return numberOfRoses;
	}
	public double getSubtotal() {
		return subtotal;
	}
	
	
	
}
