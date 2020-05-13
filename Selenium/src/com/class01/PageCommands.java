package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		//HTTP--> hypertext transfer protocol
		driver.get("http://google.com");
		
//		driver.navigate().to("https://www.amazon.com/");
		
		final String expectedTittle = "Google";		
		String actualTitle = driver.getTitle();
	
		if(expectedTittle.equals(actualTitle)) {
			System.out.println("Actual and expected Title match");
		}else {
			System.err.println("The actual and expected Tittle did not match");
		}
		
		
		
		System.out.println("********************");
		
		String actualUrl = driver.getCurrentUrl();
		System.out.println("The URL is: "+actualUrl);
		String expectedUrl = "https://www.google.com/?gws_rd=ssl";
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("URL is correct and match expected");
		}else {
			System.err.println("URL does not match expected");
		}
		
		
		driver.close();

			
		
		// .get(); = will not allow you to go back and forward (no history)
		// .navigate = store the history
		
	}

}
