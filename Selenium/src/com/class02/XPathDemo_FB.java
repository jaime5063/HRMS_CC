package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo_FB {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String realURL = "https://www.facebook.com/";
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Haime");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Zalcedo");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("testauto@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123AutomationTest");
		
		driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		
		driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
		
		driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		
		driver.findElement(By.xpath("//label[@for='u_0_a']")).click();
	//<input type="radio" class="_8esa" name="sex" value="1" id="u_0_9">
	//	
		
		Thread.sleep(3000);
		driver.get(realURL);
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
	}
}
