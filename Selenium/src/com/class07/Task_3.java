package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utils.CommonMethods;

public class Task_3 extends CommonMethods{
/*
	Verify element is enabled
	Open chrome browser
	Go to “https://the-internet.herokuapp.com/”
	Click on “Click on the “Dynamic Controls” link
	Click on enable button
	Enter “Hello” and verify text is entered successfully
	Close the browser 
 */
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("Chrome", "https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		
		boolean msg = driver.findElement(By.xpath("//input[@type='text']")).isDisplayed();
		
		if(msg) {
			System.out.println("Text Entered Successfully");
		}else {
			System.err.println("Text Failed");
		}
		
		Thread.sleep(2000);
		driver.quit();
	// need to used getAttribute("value"), instead of isDisplayed to make sure your entered text is matching	
		
		
	}
}
