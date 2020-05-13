package com.class05;

import org.openqa.selenium.By;

import com.Utils.CommonMethods;

public class AlertTask1 extends CommonMethods{

	public static void main(String[] args){
		
		//The method is opening syntax practice web-site using Chrome browser
		CommonMethods.setUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
		
		driver.findElement(By.linkText("Javascript Alerts")).click();
		
		driver.findElement(By.xpath(""));
		
	}

}
/*
TC 1: JavaScript alert text verification
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Alerts & Modals” links
Click on “Javascript Alerts” links
Click on button in “Java Script Alert Box” section
Verify alert box with text “I am an alert box!” is present
Click on button in “Java Script Confirm Box” section
Verify alert box with text “Press a button!” is present
Click on button in “Java Script Alert Box” section
Enter text in the alert box
Quit browser
*/
