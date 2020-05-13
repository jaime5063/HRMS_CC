package com.gp.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gp.utils.GpConstants;

public class BaseClass {

	public static WebDriver driver;
	
	public static void launchGeniusPlaza() {	
		System.setProperty("webdriver.chrome.driver", GpConstants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(GpConstants.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(GpConstants.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
		driver.get(GpConstants.GENIUS_PLAZA_URL);
	}
	
	public static void teaDown() {
		if(driver !=null) {
			driver.quit();
		}
	}
}
