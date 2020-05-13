package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo_ESPN {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		

		driver.navigate().to("http://166.62.36.207/syntaxpractice/index.html");

		String actualURL = driver.getCurrentUrl();
		System.out.println("URL for this Automation test is: "+actualURL);
		
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"treemenu\"]/li/ul/li[2]/ul/li[1]/a")).click();;
	
		Thread.sleep(3000);

		
		driver.quit();
		
	}
}

// //*[@id="navbar-brand-centered"]/ul[1]/li[3]/a