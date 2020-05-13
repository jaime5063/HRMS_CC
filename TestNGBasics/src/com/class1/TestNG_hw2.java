package com.class1;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import com.Utils.CommonMethods;
import com.Utils.Constants;

/* 
		HRMS Application Negative Login: 
		Open chrome browser
		Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
		Enter valid username
		Leave password field empty
		Verify error message with text “Password cannot be empty” is displayed. 
 */
public class TestNG_hw2 extends CommonMethods{
	
	@BeforeClass
	public void launchBrowser() {
		setUp("chrome", Constants.HRMS_URL);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	@BeforeMethod
	public void UserName() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	
	@Test
	public void LoginMessg() {
		String expectedTxt = "Password cannot be empty";
		driver.findElement(By.id("btnLogin")).click();
		boolean mssg = driver.findElement(By.xpath("//span[@id='spanMessage']")).isDisplayed();
		String actual = driver.findElement(By.id("spanMessage")).getText();
		if(mssg) {
			if(actual.equals(expectedTxt)) {
				System.out.println("Test Message passed");
				System.out.println("Actual message: "+actual);
			}else {
				System.out.println("Message does not match");
			}
		}else {
			System.out.println("Message element is not present");
		}
	}

}
