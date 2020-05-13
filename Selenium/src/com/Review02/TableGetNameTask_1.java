package com.Review02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;
import com.Utils.Constants;


public class TableGetNameTask_1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", Constants.HRMS_URL);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		
		
		List<WebElement> names = driver.findElements(By.id("//table[@id='resultTable']/tbody/tr"));
		int numberOfRows = names.size();
		for(int i=0; i<names.size(); i++) {

			System.out.println(numberOfRows);
			
			
		}
		
	}

}
