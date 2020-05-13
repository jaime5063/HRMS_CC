package com.class38;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
	// calling directly from the division method	
	division(12,0);
	division(12,2);

	}
	
	public static void division(int num1, int num2) {
	
		int result;
		
		try {
			result = num1/num2;  // new ArithmeticException();
			System.out.println(result);
			Thread.sleep(2000);  // new InterruptedException();
		}catch(ArithmeticException e) {
			System.out.println("Please do not pass 0 as second number");
		}catch(InterruptedException e) {
			System.out.println("Someone interrupted program sleep");
			// even if you have to catch blocks only the first exception will be executed
		}	
	}
}
