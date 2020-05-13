package com.class38;

public class RecapException {

	public static void main(String[] args) throws InterruptedException {
		
		int num = 1;
		
		// runtime - unchecked exception
		int[] nums = {20, 33};
		
		try {
		System.out.println(nums[2]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("trying to access element outside of the coundary");
		}
		
		// compile time - checked exception
		Thread.sleep(10000);
		System.out.println("End of code");
		
	}

}

// Diego Jaurez