package com.class2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class AssertionTask_01 extends CommonMethods {

	@BeforeMethod
	public void launchBrowser() {
		setUp("chrome", Constants.HRMS_URL);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test
	public void LoginMessg() {
		
		SoftAssert softAssert = new SoftAssert();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		String expectedTxt = "Password cannot be empty";
		driver.findElement(By.id("btnLogin")).click();
		boolean mssg = driver.findElement(By.xpath("//span[@id='spanMessage']")).isDisplayed();
		String actual = driver.findElement(By.id("spanMessage")).getText();
		softAssert.assertEquals(expectedTxt, actual);
		softAssert.assertTrue(mssg, "Logo is displayed");
		softAssert.assertAll();
//		if(mssg) {
//			if(actual.equals(expectedTxt)) {
//				System.out.println("Test Message passed");
//				System.out.println("Actual message: "+actual);
//			}else {
//				System.out.println("Message does not match");
//			}
//		}else {
//			System.out.println("Message element is not present");
//		}
	}
}
