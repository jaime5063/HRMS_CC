package com.class08;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utils.CommonMethods;

public class WebTable_hw1 extends CommonMethods{
/*
	Table headers and rows verification
	Open chrome browser
	Go to “http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx”
	Login to the application
	Verify customer “Susan McLaren” is present in the table
	Click on customer details
	Update customers last name and credit card info
	Verify updated customers name and credit card number is displayed in table
	Close browser 	
 */

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("Chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		String expectedValue = "Susan McLaren";
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		
		for(int i=1; i<rows.size(); i++) {
			String rowText = rows.get(i-1).getText();
			if(rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]/td[13]/input")).click();
				break;
			}
		}
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("ctl00_MainContent_fmwOrder_txtName")));
		
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).clear();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("Susan Lanister");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).clear();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("222444222444");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		for(int i=1; i<row.size(); i++) {
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			String rowText = row.get(i-1).getText();
			if(rowText.contains("Susan Lanister") && rowText.contains("222444222444")) {
				System.out.println("Table had been updated");
				System.out.println(rowText);
				break;
			}
		}
		Thread.sleep(2000);
		driver.quit();
		
	}
}
