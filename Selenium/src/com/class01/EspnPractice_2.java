package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EspnPractice_2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("1");
		System.setProperty("webdriver.chrome.driver", 
				"/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");
		
		System.out.println("2");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("3");
		driver.get("http://espn.com");
		
			Thread.sleep(2000);
		
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		
		
		boolean urlMatch = actualURL.contains("espn");
		System.out.println(urlMatch);
			
			
//		driver.close();	
			
		

	}

}
