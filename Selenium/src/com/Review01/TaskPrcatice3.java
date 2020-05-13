package com.Review01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;
import com.Utils.Constants;


public class TaskPrcatice3 extends CommonMethods{

	static int num;
	
	public static void main(String[] args) throws InterruptedException {
/*/*Syntax Instructor 6:14 PM
As a stakeholder, 
  I want to be able to confirm that there are 45 links on the “Welcome to the Internet” home page
As a stakeholder, 
  I want to be able to verify that the text to each hyperlink and match each hyperlink with the respective
text

Note for testers: Please write clean code and comment on each line of code what is the function being performed so that
our client side members can read your code and understand what is going on 		
 */
		
	setUp("chrome", Constants.welcomeToTheInternetURL);
	
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	int numOfList = allLinks.size();
	
	if(numOfList ==  45) {
		System.out.println("The number of Links on this page are "+numOfList);
	}else {
		System.err.println("The number of Links does not match expected of 45");
	}
	
	Thread.sleep(2000);
	
	for(WebElement hyperLink: allLinks) {
		
		num++;
		System.out.println(num+". "+"HyperLink Text: "+hyperLink.getText());
		System.out.println(num+". "+"Attribute is: "+hyperLink.getAttribute("href"));
		System.out.println();
	}
	
	
	driver.quit();
	
	}

}
