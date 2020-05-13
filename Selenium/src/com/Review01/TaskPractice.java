package com.Review01;

import org.openqa.selenium.By;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class TaskPractice extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
/* Locate any link Using partialLinkText only then click on the link, 
* after clicking go back to the home page and locate
another element using PartialLinkText only then click on the link
* 
*/		
		// initializing our browser, calling extension from CommonMethods and Constants class  
		setUp("Chrome", Constants.welcomeToTheInternetURL);
		// find the element the link that begins with GEOLO and click it 
		driver.findElement(By.partialLinkText("Geolo")).click();
		// Sleep for 2 seconds to observe previous commands have ran correctly
		Thread.sleep(2000);
		// Go back to the previous page
		driver.navigate().back();
		// find another element using partial link text again 
		driver.findElement(By.partialLinkText("Checkb")).click();
		// sleep for 2 seconds and close out the program
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
