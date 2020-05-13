package com.practice1;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class SoftAssert_MainPage extends CommonMethods{
	
	@BeforeClass
	public void urlLogin() {
		setUp("chrome", Constants.HRMS_URL);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.name("Submit")).click();
	}
	
	@AfterClass
	public void urlClose() {
		driver.quit();
	}
	
	@Test
	public void syntaxLogo() {
		boolean expectedLogo = true;
		boolean acualLogo = driver.findElement(By.xpath("//a[@target='_blank']/img")).isDisplayed();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(acualLogo, expectedLogo);
		sa.assertAll();
	}
	
	@Test
	public void welcomeAdmin() {
		boolean welcomeAd = true;
		boolean actualAdmin = driver.findElement(By.id("welcome")).isDisplayed();
		String welcomeText = "Welcome Admin";
		String actualText = driver.findElement(By.linkText("Welcome Admin")).getText();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualAdmin, welcomeAd);
		sa.assertEquals(actualText, welcomeText);
		sa.assertAll();
	}
	
}
