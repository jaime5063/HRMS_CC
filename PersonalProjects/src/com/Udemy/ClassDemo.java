package com.Udemy;

public class ClassDemo {

	public static void main(String[] args) {
		
		// Getters and Setters = Encapsulation
		
// #1. Car Class (Getters and Setters)
		Car bmw = new Car(); // Create and initialize the object 
		bmw.setMake("BMW"); // set Private variable value from Public setter method (setter)
		System.out.println(bmw.getMake()); // return Private variable value from Public getter method (getter)
		
		Car benz = new Car();
		benz.setMake("Benz");
		System.out.println(benz.getMake());
		
		benz.setModel("C300");
		System.out.println(benz.getModel());
		
		// we did not need to create an object to access "Year" because the variable was Public
//		benz.year = 1889;
//		System.out.println(benz.getYear());
		
		// if we access the methods it allows us to do validation within it, such as: conditional statements etc.
		benz.setYear(2021);
		System.out.println(benz.getYear());
		
	/* Why use encapsulation?
	 * - set variables as Private so that only the Class can see them
	 * - Allows us to do a lot more functionality (such as conditional statements etc)
	*/	
		
	/* this. 
	 * 	- this value for this instance only 
	 */
		
		

	}
}
