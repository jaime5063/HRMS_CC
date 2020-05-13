package com.class01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDXPATHDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String actualURL = "http://166.62.36.207/syntaxpractice/index.html";

		driver.get(actualURL);

		driver.findElement(By.id("btn_basic_example")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btn_inter_example")).click();
		Thread.sleep(2000);
		driver.navigate().to("http://google.com");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.close();
	}
}
