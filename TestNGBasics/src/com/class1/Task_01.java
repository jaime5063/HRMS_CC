package com.class1;

import org.testng.annotations.*;
public class Task_01 {

	// Execution flow
	
	@BeforeClass // #1
	public void TbeforeClass() {
		System.out.println("I am before class annotation");
	}
	@AfterClass // #8
	public void TafterClass() {
		System.out.println("I am after class annotation");
	}
	@BeforeMethod // #2 and #5 will always execute before each @Test method
	public void tBeforeMethod() {
		System.out.println("I am the before method");
	}
	@AfterMethod // #4 and #7
	public void tAfterMethod() {
		System.out.println("I am the after method");
	}
	@Test // #3
	public void test1() {
		System.out.println("First Test");
	}
	@Test // #6
	public void test2() {
		System.out.println("Second Test");
	}
	
}
