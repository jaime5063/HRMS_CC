package com.practice1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener{
	
	@Override
	public void onFinish(ITestContext arg0) {
		
		
	}
	
	@Override
	public void onStart(ITestContext arg0) {
		
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("TestCases Failed and Test Case details are "+result.getName());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("TestCases Skipped and Test Case details are "+result.getName());
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("TestCases Started and Test Case details are "+result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("TestCases Success and Test Case details are "+result.getName());
	}

}


