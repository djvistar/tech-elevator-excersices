package com.techelevator;

public abstract class Wall {
	
	
	private String name;
	private String color;
	
	
	//constructor
	
	
	public Wall(String name, String color) {
		
		this.name = name;
		this.color = color;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	
	
	//method
   public abstract int getArea();

}


