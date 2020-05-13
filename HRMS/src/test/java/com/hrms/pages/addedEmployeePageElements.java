package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class addedEmployeePageElements {

	@FindBy(id="empPic")
	public WebElement personalDetails;
	
	public addedEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	} 
}
