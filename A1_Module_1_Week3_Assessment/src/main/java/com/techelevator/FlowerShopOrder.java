package com.techelevator;

public class FlowerShopOrder extends FlowerShop {

	private String bouquetType;
	private int numberOfRoses;
	private double subtotal;
	
	
	
	public FlowerShopOrder(String bouquetType, int numberOfRoses) {
		
		this.bouquetType = bouquetType;
		this.numberOfRoses = numberOfRoses;
		
	}
	
	public double getSubtotalt() {
		subtotal = (numberOfRoses* 2.99)+ 19.99;
		return subtotal;
		
		
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
