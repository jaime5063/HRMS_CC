package com.practice1;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class SoftAssert_HomePage extends CommonMethods{
	
	
	@BeforeClass
	public void urlLog() {
		setUp("Chrome", Constants.HRMS_URL);
	}
	
	@AfterClass
	public void urlLogOut() {
		driver.quit();
	}
	
	@Test
	public void hpLogo() {
		boolean expected = true;
		boolean logo = driver.findElement(By.tagName("img")).isDisplayed();
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(logo, expected);
		sa.assertAll();
	}
	
	@Test
	public void loginClick() {
		String expectedText = "LOGIN";
		String actuaText = driver.findElement(By.xpath("//input[@value='LOGIN']")).getAttribute("value");
		System.out.println(expectedText);
		boolean expected = true;
		boolean clickable = driver.findElement(By.name("Submit")).isEnabled();
		System.out.println(clickable);
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(clickable, expected);
		sa.assertEquals(actuaText, expectedText);
		sa.assertAll();
	}
	
	@Test
	public void loginHeader() {
		String expected = "LOGIN Panel";
		String actualHeader = driver.findElement(By.id("logInPanelHeading")).getText();
		System.out.println(actualHeader);
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(actualHeader, expected);
		sa.assertAll();
	}
	
	@Test
	public void usernameEnabled() {
		boolean expected = true; 
		boolean actEnabled = driver.findElement(By.id("txtUsername")).isEnabled();
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(actEnabled, expected);
		sa.assertAll();	
	}
	@Test
	public void passwordEnabled() {
		boolean expected = true;
		boolean actEnabled = driver.findElement(By.id("txtPassword")).isEnabled();
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(actEnabled, expected);
		sa.assertAll();
	}

}
