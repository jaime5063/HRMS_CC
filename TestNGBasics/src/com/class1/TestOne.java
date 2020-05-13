package com.class1;

import org.testng.annotations.Test;

public class TestOne {

	@Test
	public void testOne() {
		System.out.println("Test One");
	}
	@Test
	public void testTwo() {
		int a = 10 + 20;
		System.out.println(a);
	}
	@Test
	public void testThree() {
		String name = "Test "+" Three"; 
		System.out.println(name);
		
	}
	
	
}
