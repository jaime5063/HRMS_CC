package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class AddEmployeePageElements {
	
	@FindBy(id="menu_pim_addEmployee")
	public WebElement addEmployeeBtn; 
	
	@FindBy(id="firstName")
	public WebElement employeeFirstName;
	
	@FindBy(id="lastName")
	public WebElement employeeLastName;
	
	@FindBy(id="middleName")
	public WebElement employeeMiddleName;
	
	@FindBy(id="btnSave")
	public WebElement saveEmpButton;
	
	@FindBy(id="chkLogin")
	public WebElement createLoginDetails;
	
	public AddEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	} 

}
