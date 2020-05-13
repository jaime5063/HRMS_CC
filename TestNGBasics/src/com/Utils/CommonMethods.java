package com.Utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {

	public static WebDriver driver;

// all methods are static so that we are able to call them in any class and package	
	
	/**
	 * Use this method in need of opening browser and target url
	 * @param The desired browser
	 * @param The desired url
	 */
	public static void setUp(String browser, String URL) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/chromedriver");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/cesar_directory/eclipse-workspace/Selenium/Drivers/geckodriver");
			driver = new FirefoxDriver();
		}else {
			System.out.println("This browser is not supported");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}
			
// Alert Methods 
	public static void acceptAlert() {

		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	}

	public static void dismissAlert() {

		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	}

	public static String getAlertText() {

		try {
			Alert alert = driver.switchTo().alert();
			return alert.getText();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
			return null;
		}
	}
	
	
// frames Methods
	
	public static void switchToFrame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		}catch (NoSuchFrameException e) {
				System.out.println("Frame is not present");
			}
		}
	
	public static void switchToFrame(String nameOrId) {
		try {
			driver.switchTo().frame(nameOrId);
		}catch (NoSuchFrameException e) {
				System.out.println("Frame is not present");
			}
		}
	
// JS Executor	
	
	/**
	 * This method will click on the element using JSExecutor
	 * @param element
	 */
	public static void jsClick (WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	/**
	 * This method will scroll until specified element
	 * @param element
	 */
	public static void scrollIntoElement (WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	/**
	 * This method will scroll page down
	 * @param pixel
	 */
	public static void scrollDown(int pixel) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollBy(0,"+pixel+")");
	}
	/**
	 * This method will scroll page up
	 * @param pixel
	 */
	public static void scrollUp(int pixel) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollBy(0, -"+pixel+")");
	}
	
// ScreenShot
	
	/**
	 * This method will take a screenshot
	 * @param fileName
	 */
	public static void takeScreenShot(String fileName) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("TestNGscreenshot/"+fileName+".png"));
		} catch (IOException e) {
			System.out.println("cannot take a screenshot");
		}
	}
	
	
	
}
