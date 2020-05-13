package com.class03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
	
	public static final String URL = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get(URL);

		
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
