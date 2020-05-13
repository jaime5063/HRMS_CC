package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

public static void main(String[] args) throws InterruptedException {
		
		
		// System is a class.	setProperty(); is a static method
		
		//				key (which browser)						Value (what folder is your browser is)
System.setProperty("webdriver.chrome.driver", "/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		//HTTP--> hypertext transfer protocol
		driver.get("http://google.com");
		
		// browser navigation commands.
		
		//it will navigate to a given URL
		driver.navigate().to("https://www.amazon.com/");
		
		// make sure you have: throws InterruptedException
		Thread.sleep(20000);
		
		//it will navigate back
		driver.navigate().back();
		
		//it will navigate forward
		driver.navigate().forward();

		// Get the tittle
		String actualTittle = driver.getTitle();
		System.out.println(actualTittle);

	}

}
