package com.class03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebElementCommandDemo2 {
	
	public static final String URL = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");	// NEED PASSWORD 
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link : links) {
					String allLink = link.getText();
					
			if(!allLink.isEmpty()) {
				System.out.println(allLink);
			}
			
		}

	}

}
