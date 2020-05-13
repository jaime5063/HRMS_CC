package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours_Task {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();;
		Thread.sleep(1000);
		
		driver.findElement(By.name("firstName")).sendKeys("Jaime");
	
		driver.findElement(By.name("lastName")).sendKeys("Syntax");
		
		driver.findElement(By.name("phone")).sendKeys("9992029999");
		
		driver.findElement(By.name("userName")).sendKeys("myname@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("1010 disneyland st");
		
		driver.findElement(By.name("city")).sendKeys("Walt Disney");
		
		driver.findElement(By.name("state")).sendKeys("Fanstasmic");
		
		driver.findElement(By.name("postalCode")).sendKeys("90000");
		
		driver.findElement(By.name("register")).click();
		Thread.sleep(4000);
		

		// finding differen locators (test 2)
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("Register here")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("test");;
		
		driver.findElement(By.name("password")).sendKeys("extensiveTest");;
		
		driver.close();

		
		
		
	}
// NOTE: Sohail is trying to show you why not to use locators with numbers, 
//	if the locator has a number it will change later	
	
	

/*
TC 2: Mercury Tours Registration: 
Open chrome browser
Go to “http://newtours.demoaut.com/”
Click on Register Link
Fill out all required info
Click Submit
User successfully registered
(Create 2 scripts using different locators)
 * 
 */
}


