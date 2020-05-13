package com.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class HW_01_Add_Employee extends CommonMethods{
/*
	Add Employee
	Open chrome browser
	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
	Login into the application
	Add Employee
	Log out 
	Quit the browser	
 */
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("Chrome", Constants.HRMS_URL);
		
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Syntax");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Syntax123!");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();	
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Add Employee")));
		
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("My");
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("First");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='employeeId']")).clear();
		driver.findElement(By.xpath("//input[@name='employeeId']")).sendKeys("3434");
		
		driver.findElement(By.id("btnSave")).submit();
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		boolean mft = driver.findElement(By.id("profile-pic")).isDisplayed();
		
		if(mft) {
			System.out.println("New Employee has been saves succefully");
		}else {
			System.err.println("Please try adding New Employee again!");
		}
		
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(3000);
		System.out.println("Test Case Comeplete");
		driver.quit();
	}

}
