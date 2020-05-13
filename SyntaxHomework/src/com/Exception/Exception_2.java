package com.Exception;

public class Exception_2 {

	public static void main(String[] args) {
		
		try {
		int num = Integer.parseInt ("akki") ; // locate where the exception may take place 		
											  // then try+catch exception	
		}catch(NumberFormatException e) {
			System.out.println(e.getClass()); // get the class exception
			System.out.println(e.getMessage()); // get the message we are trying to print out 
			
		}	
		
	}

}
