package com.Review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class Task_01 extends CommonMethods{

	public static void main(String[] args) {
		
		setUp("Chrome", Constants.welcomeToTheInternetURL);
		
		/* Locate any link Using partialLinkText only then click on the link, 
		 * after clicking go back to the home page and locate
		another element using PartialLinkText only then click on the link
		 * 
		 */		
		// #1
//		WebElement partialLlinkText = driver.findElement(By.partialLinkText("Float"));
//		partialLlinkText.click();
		// #2
//		WebElement linkText = driver.findElement(By.linkText("Hovers"));
//		linkText.click();
		
		driver.findElement(By.linkText("Checkboxes")).click();;
		WebElement chkBox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		chkBox1.click();

		if (chkBox1.isSelected()) {
			
			System.out.println("Checkbox 1 is selected");
		}else {
			System.out.println("checkbox 1 is not selected");
		}
		
		driver.quit();
	}
}
