package com.class1;

import org.testng.annotations.*;

public class DifferentAnnotations {

	// Execution sequence execute in a predefined order
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after Test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	
	@Test
	public void test() {
		System.out.println("I am actual test with @Test annotation");
	}
/*
		[RemoteTestNG] detected TestNG version 7.0.0
		Before Suite
		Before Test
		Before Class
		Before method
		I am actual test with @Test annotation
		After method
		after Class
		after Test
		PASSED: test
		============================================
		After Suite 	
 */
	// MUST KNOW THE ORDER
}
