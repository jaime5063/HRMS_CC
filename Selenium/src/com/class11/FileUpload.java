package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;

public class FileUpload extends CommonMethods{

/*
 * Navigate to: https://the-internet.herokuapp.com/upload 
 * upload the file
 * verify file is uploaded
 * 
 */
	public static void main(String[] args) {
		
		setUp("chrome", "https://the-internet.herokuapp.com/upload");

		// 1. Go to photo info
		// 2. EXAMPLE get where: /Users/cesar_directory/Desktop
		// 3. Rename / Get name, of photo (from info page)
		driver.findElement(By.id("file-upload")).sendKeys("/Users/cesar_directory/Desktop/ScreenShotPath.png");
		
		// click on upload button
		driver.findElement(By.id("file-submit")).click();
		
		// Verify element file is uploaded
		WebElement uploaded = driver.findElement(By.xpath("//div[@id='uploaded-files']/preceding-sibling::h3"));
		if(uploaded.isDisplayed()) {
			System.out.println("File uploaded successfully");
		}else {
			System.err.println("Test File upload failed");
		}
		
		// take screenshot
			
	}
}
