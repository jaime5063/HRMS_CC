package com.class3;

import org.testng.annotations.*;

public class AlwaysRun_01 {
	
	@BeforeMethod (alwaysRun=true)
	public void beforeMethod() {
		System.out.println("I am before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am after method");
	}
	
	@Test
	public void testMethod() {
		System.out.println("I am test");
	}

}
