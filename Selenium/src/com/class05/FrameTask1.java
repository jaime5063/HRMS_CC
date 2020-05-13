package com.class05;

import org.openqa.selenium.By;

import com.Utils.CommonMethods;

public class FrameTask1 extends CommonMethods{

		public static void main(String[] args) throws InterruptedException{
			
			//The method is opening syntax practice web-site using Chrome browser
			CommonMethods.setUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
			
			driver.findElement(By.xpath("//a[@href='#' and text()='Others']")).click();
			driver.findElement(By.linkText("Iframe")).click();
			
			driver.switchTo().frame("FrameOne");
			driver.findElement(By.linkText("Home")).click();
			
			Thread.sleep(2000);
			
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame("FrameTwo");
			boolean logoDisp = driver.findElement(By.xpath("//img[@alt='Syntax Technologies']")).isDisplayed();
			
			System.out.println("Is Syntax logo displayed? "+logoDisp);
			
			driver.switchTo().defaultContent();
			
			Thread.sleep(2000);
			driver.quit();

	}
}
	
