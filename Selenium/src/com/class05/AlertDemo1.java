package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.Utils.CommonMethods;

public class AlertDemo1 extends CommonMethods{
		
		public static final String SYNTAX_PRACTICE_URL= "http://166.62.36.207/syntaxpractice/index.html";
		public static void main(String[] args){
			
			//The method is opening syntax practice web-site using Chrome browser
			CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
			
			driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
			
			//finding Javascript Alerts and clicking on it 
			driver.findElement(By.linkText("Javascript Alerts")).click();
			
			//finding the button and click it 
			driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
			
			
			Alert Alert = driver.switchTo().alert();
			
			Alert.accept(); 
			
			driver.findElement(By.xpath("//p[text()='Click the button to display']"));
			
			
			
			
			
			
			
			

}
	}
