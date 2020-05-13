package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Utils.CommonMethods;


public class DropDownRecap extends CommonMethods{
	
	public static final String SYNTAX_PRACTICE_URL= "http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		//The method is opening syntax practice web-site using Chrome browser
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		
		//find the element input form and click on it 
		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(2000);
		//find the element select drowpdown list and click on it  
		driver.findElement(By.linkText("Select Dropdown List")).click();
		
		
		//find the element with id select-demo and store it and a variable
		WebElement dd = driver.findElement(By.id("select-demo"));
		//to work with dd, if the tagname starts with select, then we have to create an object of select class		
		Select select = new Select(dd); // now we have access to all the elements with Select class methods
		select.selectByIndex(3); //select 3 index
		select.selectByVisibleText("Friday"); //select value by visible text (it is case sensitive)
		select.selectByValue("Sunday"); // selecting item from dd by value attribute (will give you the value)
		
		// How to get the count of dropdown items?
		List<WebElement> options = select.getOptions();
		//this will give you the number of items present in DD 
		System.out.println(options.size());
		
		//Storing the list of option in iterator so we can loop through 
		Iterator<WebElement> it = options.iterator();
		while(it.hasNext()) { // loop through iterator if it has next element 
			it.next().click();
			Thread.sleep(1000);
		}
		// is this drop-down multi-Select?
		System.out.println(select.isMultiple());
	}
}
