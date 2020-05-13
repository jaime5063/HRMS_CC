package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.*;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class AssertionTask_02 extends CommonMethods {

	@BeforeMethod
	public void launchBrowser() {
		setUp("chrome", Constants.HRMS_URL);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	@Test
	public void addEmployee() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
	
		Actions act = new Actions(driver);
        driver.findElement(By.linkText("PIM")).click();
        WebElement add = driver.findElement(By.linkText("Add Employee"));
        act.moveToElement(add).click().perform();
		
		SoftAssert softAssert = new SoftAssert();
		boolean fName = driver.findElement(By.id("firstName")).isDisplayed();
		softAssert.assertTrue(fName);
		
		boolean id = driver.findElement(By.id("employeeId")).isDisplayed();
		softAssert.assertTrue(id);
		
		boolean photo = driver.findElement(By.id("photofile")).isDisplayed();
		softAssert.assertTrue(photo);
		
		driver.findElement(By.id("firstName")).sendKeys("M");
		
		driver.findElement(By.id("lastName")).sendKeys("Lii");
		
		driver.findElement(By.id("btnSave")).click();
		
		boolean added = driver.findElement(By.id("profile-pic")).isDisplayed();
		softAssert.assertTrue(added);
		softAssert.assertAll();
		
	}
}
