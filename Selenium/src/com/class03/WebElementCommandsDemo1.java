package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandsDemo1 {

	public static final String URL ="http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get(URL);
		
		driver.findElement(By.xpath(""));
		

	}
}

