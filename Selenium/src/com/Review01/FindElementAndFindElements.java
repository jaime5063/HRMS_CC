package com.Review01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;
import com.Utils.Constants;


public class FindElementAndFindElements extends CommonMethods{

	public static void main(String[] args) {
		
	//initializing our webDriver / access your welcome method in a static way
		setUp("Chrome", Constants.welcomeToTheInternetURL);
		
//		driver.findElement(By.linkText("Checkboxes")).click();
		
		// even if this does not find it, it will create an empty list
		driver.findElements(By.linkText("Checkboxes"));

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int numberOFAllLinks = allLinks.size();
		System.out.println(numberOFAllLinks);
		
		
		for(WebElement link : allLinks) {
// 																href = hyperlinks			
			System.out.println(link.getText() + " = " +link.getAttribute("href"));
		}	
		driver.quit();
	}

}
