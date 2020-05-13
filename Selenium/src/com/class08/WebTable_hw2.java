package com.class08;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class WebTable_hw2 extends CommonMethods{
/*
	Open chrome browser
	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
	Login into the application
	Add Employee
	Verify Employee has been added
	Go to Employee List
	Delete added Employee
	Quit the browser	
 */
	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", Constants.HRMS_URL);
		// logging into Syntax accessing username, pass and btn with id Locator
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		
		// finding links to add employee
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("menu_pim_addEmployee")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("firstName")));

		// adding employee information and saving new employee into List = empID: 1391
		driver.findElement(By.id("firstName")).sendKeys("Iron");
		driver.findElement(By.id("middleName")).sendKeys("mmmm");
		driver.findElement(By.id("lastName")).sendKeys("Man");

		String empID = driver.findElement(By.xpath("//input[@name='employeeId']")).getAttribute("value");
		System.out.println(empID);

		driver.findElement(By.id("btnSave")).click();
		// verify new employee is displayed and added
		boolean newDisp = driver.findElement(By.xpath("//div[@id='profile-pic']")).isDisplayed();
		if (newDisp) {
			System.out.println("Displayed new employee:" + empID);
		} else {
			System.err.println("Test Failed");
		}
		// go to employee list to delete employee
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		Thread.sleep(2000);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
		for (int i = 1; i < rows.size(); i++) {
			String text = rows.get(i - 1).getText();
			if (text.contains(empID)) {

				driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr[" + i + "]/td[1]")).click();

				driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
				driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();

				System.out.println("Employee with ID:" + empID + " was SUCCESSFULLY Deleted!");
				break;
			}
		}
		Thread.sleep(2000);
		driver.quit();
	}
}
