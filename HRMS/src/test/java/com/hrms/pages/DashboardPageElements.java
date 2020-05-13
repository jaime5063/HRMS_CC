package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class DashboardPageElements {

	@FindBy(linkText="Leave")
	public WebElement leaveLnk;
	
	@FindBy(linkText="leave List")
	public WebElement leaveList;
	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement pimLink;
	
	
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}
