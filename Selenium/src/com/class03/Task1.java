package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static final String URL = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		WebElement errorMessage=driver.findElement(By.xpath("//span[@id='spanMessage']"));
		
		if(errorMessage.isDisplayed()) {
			String message = errorMessage.getText();
			if(message.equals("Password cannot be empty"));
			System.out.println("Correct error message is displayed");
		}else {
			System.out.println("Incorrect error message is displayed");
		}
	}

}
