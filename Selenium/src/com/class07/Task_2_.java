package com.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utils.CommonMethods;

public class Task_2_ extends CommonMethods{

/*
	Verify element is clickable
	Open chrome browser
	Go to “https://the-internet.herokuapp.com/”
	Click on “Click on the “Dynamic Controls” link
	Select checkbox and click Remove
	Click on Add button and verify “It’s back!” text is displayed
	Close the browser 	
 */
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("Chrome", "https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Dynamic Controls")).click();
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		
		// calling out explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@id='message']")));
		
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		String expectedText = "It's back!";
		String actualText = driver.findElement(By.xpath("//p[@id=\"message\"]")).getText();
		
		if(actualText.equals(expectedText)) {
			System.out.println("Test has passed!");
		}else {
			System.err.println("Text Failed!");
		}

		driver.quit();
		
		
		
		
		
		
		
	}

}
