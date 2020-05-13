package com.uproject.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

import com.uproject.base.TestBase;

public class LoginTest extends TestBase{
	
	@Test
	public void loginAsBankManager() throws InterruptedException {
		
		driver.findElement(By.xpath(OR.getProperty("bmlBtn"))).click();
		Thread.sleep(3000);
		
		
	}
}
