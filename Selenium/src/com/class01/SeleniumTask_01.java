package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask_01 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		// HTTP--> hypertext transfer protocol
		driver.get("http://amazon.com");
		
		String amazonTitle = driver.getTitle();
		System.out.println(amazonTitle);
		
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		if(expectedTitle.equals(amazonTitle)) {
			System.out.println("Amazon Tittle expected and actual MATCH!");
		}else {
			System.err.println("Amazon Title expepected and actual DO NOT MATCH");
		}
		
		driver.close();

	}

}
