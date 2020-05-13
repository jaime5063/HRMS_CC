package com.Review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class Locating extends CommonMethods{

	public static void main(String[] args) {
		
		setUp("Chrome", Constants.welcomeToTheInternetURL);
		
		// Created a variable (for cleaner code)
//		WebElement partialLinkTex = driver.findElement(By.partialLinkText("Check"));
//		partialLinkTex.click();
		
		// Created another variable (for cleaner code)
		WebElement linktext = driver.findElement(By.linkText("Dropdown"));
		linktext.click();
		
	}
}
