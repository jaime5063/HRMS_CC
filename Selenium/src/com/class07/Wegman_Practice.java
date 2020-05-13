package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.Utils.CommonMethods;

public class Wegman_Practice extends CommonMethods{

	public static void main(String[] args) {
		
		setUp("Chrome", "http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("wegman", Keys.ENTER);
		
		

	}

}
