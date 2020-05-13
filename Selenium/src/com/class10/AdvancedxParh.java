package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class AdvancedxParh extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", Constants.HRMS_URL);
		
		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement pimLink = driver.findElement(By.linkText("PIM"));
		act.moveToElement(pimLink).perform();
		
		WebElement link = driver.findElement(By.linkText("Employee List"));
		act.moveToElement(link).click().perform();
		
		Thread.sleep(2000);
		WebElement addEmployee = driver.findElement(By.linkText("Add Employee")); 
		act.moveToElement(addEmployee).contextClick().perform();
		
		
		
	}
}
