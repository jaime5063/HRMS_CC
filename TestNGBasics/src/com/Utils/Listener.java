package com.Utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test starterd =) "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed ;)"+"Passed/"+result.getName());
		CommonMethods.takeScreenShot("passed/"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed :( "+"Failed/"+result.getName());
		CommonMethods.takeScreenShot("failed/"+result.getName());
	}

}
