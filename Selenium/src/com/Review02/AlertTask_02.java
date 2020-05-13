package com.Review02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utils.CommonMethods;

public class AlertTask_02 extends CommonMethods{

	public static void main(String[] args) {
		
		setUp("Chrome", "https://www.toolsqa.com/automation-practice-switch-windows/");
		
		driver.findElement(By.xpath("//button[@id='timingAlert']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("timingAlert")));
		
		driver.findElement(By.id("timingAlert")).click();
		
		acceptAlert();
		
		
		
		

	}
}
