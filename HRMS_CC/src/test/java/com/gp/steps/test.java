package com.gp.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/cesar_directory/eclipse-workspace/HRMS_CC/src/test/resources/drivers/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://village-q1.geniusplazadev.com/");
		
	}

}
