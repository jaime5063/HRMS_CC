package com.class09;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;

public class AnotherDatePicker extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp("Chrome", "https://www.aa.com/homePage.do");
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear();
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("Los Ange");
		Thread.sleep(1000);
		driver.findElement(By.linkText("LAX - Los Angeles International, CA")).click();
		
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).clear();
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys("New Y");
		Thread.sleep(1000);
		driver.findElement(By.linkText("NYC - New York, NY")).click();
		
		driver.findElement(By.xpath("//input[@name='departDate']")).click();
		
		for(int i=0; i < 12 ; i++) {
			
			// get text from web element
			WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			// webElement to String variable
			String flyMo = month.getText();
			if(flyMo.equals("May")) {
				// get all the body elements table (days)
				List<WebElement> months = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
				for(WebElement mo : months) {
					if(mo.getText().equals("14")) {
						driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
						mo.click();
						break;
					}
				}
			}else {
				
				driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
		
			}		
		}
		
		driver.quit();
		
		
		
		
		

	}

}
