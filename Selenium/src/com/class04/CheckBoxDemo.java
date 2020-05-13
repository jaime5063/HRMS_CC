package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;

public class CheckBoxDemo extends CommonMethods{
						 // Allows us to bring the object from the class
	
	public static final String HRMS_URL = "http://166.62.36.207/syntaxpractice/index.html";
	
	public static void main(String[] args) {
		
		CommonMethods.setUp("chrome", HRMS_URL);
		driver.manage().window().fullscreen();
		

		
		driver.quit();

		// COPY NOTES FROM 3HR:15MIN on video ---> code was pushed
	}
}
