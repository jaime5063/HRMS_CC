package com.class1;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import com.Utils.CommonMethods;
import com.Utils.Constants;
/*
		HRMS Application Login: 
		Open chrome browser
		Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
		Enter valid username and password
		Click on login button
		Then verify Syntax Logo is displayed
		Close the browser
 */
public class TestNG_hw1 extends CommonMethods{

	@BeforeClass
	public void urlOpen() {
		setUp("chrome", Constants.HRMS_URL);
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		driver.quit();
	}
	
	@BeforeMethod
	public void validLogin() throws InterruptedException {
		String user = "Admin";
		String pass = "Hum@nhrm123";
		driver.findElement(By.id("txtUsername")).sendKeys(user);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();
	}
	@Test
	public void logoDisplay() {
		boolean logoDisplay = driver.findElement(By.xpath("//div[@id='branding']/a/img")).isDisplayed();
		if(logoDisplay) {
			System.out.println("Logo Test Passed");
		}else {
			System.out.println("Logo Test Failed");
		}	
	}
	
	
	
}
