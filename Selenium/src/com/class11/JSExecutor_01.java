package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class JSExecutor_01 extends CommonMethods{
/*
 * Navigate to HRM
 * enter uid and pswd
 * click on login btn using JSExecutor
 */
	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", Constants.HRMS_URL);
		driver.findElement(By.id("txtUsername")).sendKeys("");
		driver.findElement(By.id("txtPassword")).sendKeys("");

		// 1. Type Cast
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
// 	NOTE: for below example change the id element to execute as it is in main page
		
		// highlight a specific section id
		WebElement loginBtn = driver.findElement(By.id("txtUsername"));
		js.executeScript("arguments[0].style.backgroundColor='Blue'", loginBtn);
		
		Thread.sleep(2000);;
		// 	// highlight a specific section password
		WebElement loginPswrd = driver.findElement(By.id("txtPassword"));
		js.executeScript("arguments[0].style.backgroundColor='Red'", loginPswrd);
				
		// To scroll (with pixels number)
		//js.executeScript(“window.scrollBy(0,150)“);
		js.executeScript("window.scrollBy(0,150)");
		
		// To scroll (until you view element)
		// js.executeScript("argument[0].scrollIntoView(true)", element);
		js.executeScript("arguments[0].scrollIntoView(true)", loginPswrd);
		
		
	}
}
