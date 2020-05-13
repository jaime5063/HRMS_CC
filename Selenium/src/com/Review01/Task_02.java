package com.Review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class Task_02 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
/*On your own, you will do exactly what I did
As an analyst, I want to be able to verify that when clicking on checkboxes, the first link is clickable and
the second checkbox is already checked by default
 * 
 */	
		// locating your browser and url 
	setUp("Chrome", Constants.welcomeToTheInternetURL);	
	
	// clicking first check box to make sure we can click 
	driver.findElement(By.linkText("Checkboxes")).click();
	// creating variable for first check box with WebElement
	WebElement chckBox = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		
	// is the check box 1 enabled 
	if(chckBox.isEnabled()) {
		System.out.println("CheckBox 1 is enabled");
	}else {
		System.out.println("CheckBox 1 is not clickable");
	}
	// creating variable for second check box with WebElement
	WebElement chchBox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
	
	// check if checkbox 2 is selected
	if(chchBox2.isSelected()) {
		System.out.println("CheckBox 2 is selected");
	}else {
		System.err.println("ChechkBox 2 is not selected");
	}
	Thread.sleep(1000);
	driver.quit();
}
}