package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utils.CommonMethods;

public class Task_01 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", "https://the-internet.herokuapp.com");
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[text()='Hello World!']")));
		
		boolean message = driver.findElement(By.xpath("//h4[text()='Hello World!']")).isDisplayed();
		
		if(message) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		Thread.sleep(2000);
		driver.quit();

	}

}
