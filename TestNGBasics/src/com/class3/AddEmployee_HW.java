package com.class3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import com.Utils.CommonMethods;
import com.Utils.Constants;
/*
	Open chrome browser
	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
	Login into the application
	Add 5 different Employees and create login credentials by providing: 
	First Name
	Last Name
	Username
	Password
	Provide Employee First and Last Name
	Verify Employee has been added successfully and take screenshot (you must have 5 different screenshots)
	Close the browser 
 */
public class AddEmployee_HW extends CommonMethods{
	
	@BeforeMethod (groups="Sprint 1")
	public void openURL() throws InterruptedException {
		setUp("Chrome", Constants.HRMS_URL);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("PIM")).click();
		Actions act = new Actions(driver);
		Thread.sleep(1000);
        WebElement add = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
        act.moveToElement(add).click().perform();
	}
	
	@AfterMethod (groups="Sprint 1")
	public void closeBrowser() {	
				driver.quit();
	}
	
	@Test (dataProvider="empData", groups="Sprint 1")
	public void addEmployee(String fName, String lName) throws InterruptedException, IOException {
		SoftAssert sa = new SoftAssert();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		driver.findElement(By.id("btnSave")).click();
		
		File screenshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshots, new File("TestNGscreenshots/TestNG_HRMS/"+fName+" "+lName+".jpg"));
		sa.assertAll();
		Thread.sleep(1000);
	}
	
	
	@DataProvider 
	public Object[][] empData(){		
		Object[][] newEmployee= {
				{"Kobe","Bryant"},
				{"Micheal","Jordan"},
				{"Lebron","James"},
				{"Kevin","Durant"},
				{"Shaquille","O'Neal"},
		};
		return newEmployee;
	}

	

}
