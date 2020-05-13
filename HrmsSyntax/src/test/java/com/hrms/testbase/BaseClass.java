package com.hrms.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;

public class BaseClass {

	public static WebDriver driver;
	
	public static void setUp() {
		
		ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);
		
		switch(ConfigsReader.getProperty("browser").toLowerCase()) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", Constants.GECKI_DRIVER_PATH);
			
		}
		
	}
}
