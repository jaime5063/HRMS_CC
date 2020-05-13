package com.class09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;

public class WebTableCalendar_hw2 extends CommonMethods {
	/*
	 * Table headers and rows verification Open chrome browser Go to
	 * “https://www.aa.com/homePage.do” Enter From and To Select departure as May 14
	 * of 2020 Select arrival as November 8 of 2020 Verify “Choose flights” text is
	 * displayed Take s screenshot of the results Close browser
	 */
	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setUp("chrome", "https://www.aa.com/homePage.do");

		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear();
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']")).sendKeys("LAX");
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys("New York");
		driver.findElement(By.id("aa-leavingOn")).click();
		String leave = "May";
		String back = "November";
		
		for(int i=0;i<12;i++) {
		WebElement Month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		
		String flyON=Month.getText();
			if(flyON.equals(leave)) {
				List <WebElement> List=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
				for (WebElement day:List){
					if (day.getText().equals("14")){
						Thread.sleep(1000);
						day.click();
					break;
					}
				}break;
				}else{
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		}
		driver.findElement(By.id("aa-returningFrom")).click();
		for(int i=0;i<12;i++) {
			WebElement m=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			String depart=m.getText();
			if(depart.equals(back)) {
				List <WebElement> cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
				for (WebElement cell:cells){
					if (cell.getText().equals("8")){
						Thread.sleep(1000);
					cell.click();
					Thread.sleep(1000);
					break;
					}
				}break;
				}else{
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		}
		
			
			

		
		}
	}
