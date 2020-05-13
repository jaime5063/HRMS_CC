package com.class09;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class ScreenShot_01 extends CommonMethods{
/* Scenario:
 * 	:verify user is able to login with valid credentials
 *  - need to make sure Jar files are downloaded 
 */
	public static void main(String[] args) {
		
		CommonMethods.setUp("chrome", Constants.HRMS_URL);
		// logging into Syntax accessing username, pass and btn with id Locator
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		String userName = "Welcome Admin";
		String welcome = driver.findElement(By.id("welcome")).getText();
		// check if the expected text matches actual
		if(welcome.contains(userName)) {
			System.out.println("Test Passed");
		}else {
			System.err.println("Test Failed");
		}
		// STEP 1: Downcast driver to take screenshot 
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		// call method getSCreenthoAs and specify output type
		File screen = ts.getScreenshotAs(OutputType.FILE);
		try {
			// copy file to the specified destination and give name and extension
			FileUtils.copyFile(screen, new File("screenshots/HRMS/CorrectAdminLogin.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}	
		driver.quit();
		
		
		
	}	
}
