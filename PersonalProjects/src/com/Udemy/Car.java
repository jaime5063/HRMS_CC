package com.Udemy;

public class Car {
	
	private String color;
	
	private String make;
	
	private String model;
	
	public int year;
	
	public void increaseSpeed() {
		System.out.println("Increase the speed");
	}
	// Setter --> used to set a value of a field or variable
	public void setMake(String make) {
		this.make = make; // --> this. to access the class variable
	} 
	
	// Getter --> return the value in the setter. You can print out in your Main class.
	public String getMake() {
		return this.make;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year > 1900) {
		this.year = year;
	} else {
		System.out.println("This year is not valid");
	}
}
}
	
