package com.Exception;

public class Exception_Handling {

	public static void main(String[] args) {
		
		
// #212		
		int a=10, b=0; 
		int result;
	     
		try{
	     result = a/b;
		}catch(ArithmeticException e) {
			System.out.println("/ by zero");
		}
// #213		
		 int [] array = {10,20,30};
		 	try {
		    System.out.println(array[4]);
		 	}catch(ArrayIndexOutOfBoundsException e) {
		 		e.printStackTrace();
		 	}
// #214	A	
	comparingNumber(9);
// #215	
		
		try {
			int num = Integer.parseInt ("akki") ;
			System.out.println(num);
		}catch(NumberFormatException e) {
			e.getClass();
			e.getMessage();
	
		}
	
		
	}
// #214	B
	public static void comparingNumber(int number) {
		if (number > 10) {
			String ten = "Number is greater than 10";
			System.out.println(ten);
		} else {
			try {
				System.out.println("Number is less than 10");
			} catch (ArithmeticException e) {
			}
		}
	}
}
