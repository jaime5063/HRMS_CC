package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePractice_1 {

	public static void main(String[] args) throws InterruptedException {
		
		String actualURL = "http://www.google.com";
		WebDriver gDrive;
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");
		
		gDrive = new ChromeDriver();
		Thread.sleep(3000);
		
		gDrive.get(actualURL);
		
		String testURL = gDrive.getCurrentUrl();
		System.out.println("URL from test is: "+testURL);
		
		String G = "safari";
		
		gDrive.close();
		
		if(actualURL.contains(G)) {
			System.out.println("URL contains "+G);
		}else {
			System.err.println("URL does not contain "+G);
		}
		
	}
}
