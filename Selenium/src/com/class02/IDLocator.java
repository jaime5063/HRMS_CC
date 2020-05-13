package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {

	public static void main(String[] args) throws InterruptedException {
// get waits for the page to fully load, 
//		navigate doesn't wait till the page loads as soon as it finds the element it will do some action		
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		// By ID (locator)
		WebElement userName = driver.findElement(By.id("txtUsername"));
		// what username do you want to send 
		userName.sendKeys("Admin");
		
		
		//By Name (locator)							// what password do you want to enter
		driver.findElement(By.name("txtPassword")).sendKeys("Hum@nhrm123");
		
		
		// By class
		driver.findElement(By.className("button")).click();
		
		
		Thread.sleep(2000);
		// Buy LinkText (locator)
		driver.findElement(By.linkText("Welcome Admin")).click();
		
		Thread.sleep(2000); //= only waits for the page to load not functionality
		driver.findElement(By.linkText("Logout")).click();
		
		
		driver.close();
		
		
		
	}

}

