package com.Review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class TaskPractice2 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
/*On your own, you will do exactly what I did
As an analyst, I want to be able to verify that when clicking on checkboxes, the first link is clickable and
the second Checkbox is already checked by default
 * 		
 */
		// initializing preferred driver and accessing our chosen URL
		setUp("Chrome", Constants.welcomeToTheInternetURL);
		
		driver.findElement(By.partialLinkText("Checkb")).click();
		
		WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		
		if(checkBox1.isEnabled()) {
			System.out.println("Checkbox 1 is enabled for us to check");
		}else {
			System.err.println("Checkbox has NOT been enabled");
		}
		
		WebElement checkBox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
		
		if(checkBox2.isSelected()) {
			System.out.println("Checkox has been automatically selected");
		}else {
			System.err.println("Checkbox was NOT automatically selected");
		}
		Thread.sleep(3000);
		driver.navigate().back();
		
		 driver.quit();
	}

}
