package com.class03;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElementPractice1 {

	public static final String URL = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static final String userName = "Admin";
	public static final String passWrd = "Hum@nhrm123";
	public static void main(String[] args) throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");	
		WebDriver driver = new ChromeDriver();	
		driver.get(URL);	
	// Empty userName / Correct password
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(passWrd);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();		
		WebElement errorMessage = driver.findElement(By.xpath("//span[@id='spanMessage']"));		
		if(errorMessage.isDisplayed()) {
			String message = errorMessage.getText();
			if(message.equals("Username cannot be empty")) {
				System.out.println("Correct error message= "+message);
			}else {
				System.err.println("Wrong message displayed");
			}
		}
		driver.navigate().refresh();	
	// Correct UserName / empty Password
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();		
		WebElement errorMessage2 = driver.findElement(By.xpath("//span[@id='spanMessage']"));		
		if(errorMessage2.isDisplayed()) {
			String message = errorMessage2.getText();
			if(message.equals("Password cannot be empty")) {
				System.out.println("Correct error message= "+message);
			}else {
				System.err.println("Wrong message displayed");
			}
		}
//		Thread.sleep(3000);
		driver.navigate().refresh();		
	// Incorrect UserName / incorrect Password
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("wringUsr");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("WrongPass");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		WebElement errorMessage3 = driver.findElement(By.xpath("//span[@id='spanMessage']"));
		
		if(errorMessage3.isDisplayed()) {
			String message = errorMessage3.getText();
			if(message.equals("Invalid credentials")) {
				System.out.println("Correct error message= "+message);
			}else {
				System.err.println("Wrong message displayed");
			}
		}
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(passWrd);
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	// Print List of links (amount and names)
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Amount of links found = "+links.size());
		ArrayList list = new ArrayList();
		for(WebElement SLink : links) {
			String allLinks = SLink.getText();
			if(!allLinks.isEmpty()) {
				list.add(allLinks);
				System.out.println(allLinks);
			}
		}
		driver.findElement(By.xpath("//a[@id=\"menu_directory_viewDirectory\"]")).click();		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Lebron");
		driver.findElement(By.xpath("//Select[@id=\"searchDirectory_job_title\"]")).click();
		driver.findElement(By.xpath("//Select[@id=\"searchDirectory_job_title\"]/option[12]")).click();
		driver.findElement(By.xpath("//Select[@id=\"searchDirectory_location\"]")).click();
		driver.findElement(By.xpath("//select[@id=\"searchDirectory_location\"]/option[15]")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		WebElement noneMessage = driver.findElement(By.xpath("//div[@id=\"content\"]/div[2]/div[2]"));		
		if(noneMessage.isDisplayed()) {
			String message = noneMessage.getText();
			if(message.equals("No Records Found")) {
				System.out.println("---> Correct message displayed: "+message);
			}else {
				System.err.println("---> Wrong message displayed: "+message);
			}	
		Thread.sleep(2000);
		driver.quit();
	}
}
}
