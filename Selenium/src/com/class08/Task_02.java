package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;

public class Task_02 extends CommonMethods{

	public static void main(String[] args) {
		
		CommonMethods.setUp("Chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		// search for Bob Feather
		String expectedValue = "Bob Feather";
		
		
		
		
		
		
		
	}

}
