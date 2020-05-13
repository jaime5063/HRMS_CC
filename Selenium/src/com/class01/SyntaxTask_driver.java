package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxTask_driver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");
		
		ChromeDriver sDriver = new ChromeDriver();
		
	
		sDriver.navigate().to("https://www.syntaxtechs.com/");
		sDriver.navigate().to("http://google.com");
		
		sDriver.navigate().back();
		
		sDriver.navigate().refresh();
		
		String actualUrl = sDriver.getCurrentUrl();
		System.out.println(actualUrl);
		
		if(actualUrl.contains("Syntax")) {
			System.out.println("URL does contain Syntax");
		}else {
			System.err.println("URL does NOT contain Syntax");
		}
		
		sDriver.close();

	}

}
