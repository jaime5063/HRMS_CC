package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandsDemo3 {
	
	public static final String URL = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hum@nhrm123");	// NEED PASSWORD 
		String attribute = driver.findElement(By.xpath("//input[@id='btnLogin']")).getAttribute("id");
		System.out.println(attribute);
		
		driver.quit();

		
		
}
}
