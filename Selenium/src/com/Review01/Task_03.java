package com.Review01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class Task_03 extends CommonMethods{
	
	static int num;

	public static void main(String[] args) {
	//initializing our webDriver / access your welcome method in a static way
		setUp("Chrome", Constants.welcomeToTheInternetURL);
		
		// creating a list of all links and placing in a variable to use in future operations
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		// insert the number of links into a varibale to print integer size
		int numLinks = allLinks.size();
		// conparing the amount of links expected and actual result
		if(numLinks == 45) {
			System.out.println("Number of links is accurate and qeuals: "+numLinks);
		}else {
			System.out.println("Number of links is incorrcet: "+numLinks);
		}
		
		// verify hyperlink and match each hyperlink with the respective text
		for(WebElement hypeLink : allLinks) {
			int number = num++;
			System.out.println("Link Number "+number);
			System.out.println(hypeLink.getText() +" "+ hypeLink.getAttribute("href"));			
		}
		// closing our browser once we have ran our tests
		driver.quit();
		
/*Syntax Instructor 6:14 PM
As a stakeholder, 
  I want to be able to confirm that there are 45 links on the “Welcome to the Internet” home page
As a stakeholder, 
  I want to be able to verify that the text to each hyperlink and match each hyperlink with the respective
text

Note for testers: Please write clean code and comment on each line of code what is the function being performed so that
our client side members can read your code and understand what is going on 		
 */

		
		
	}
}
