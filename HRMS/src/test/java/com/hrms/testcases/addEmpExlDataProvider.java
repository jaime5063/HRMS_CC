package com.hrms.testcases;

import org.testng.annotations.DataProvider;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

public class addEmpExlDataProvider extends CommonMethods{
	
	@DataProvider
	public Object[][] empData(){
		return ExcelUtility.excelIntoArray(Constants.XL_DATA_FILEPATH, "employee");
	}

	@Test(dataProvider = "empData", groups="smoke")
	public void addMultipleEmployees(String firstName, String lastName) throws InterruptedException {
		ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);
		LoginPageElements login =  new LoginPageElements();
		AddEmployeePageElements emp = new AddEmployeePageElements();
		DashboardPageElements dash = new DashboardPageElements();
		sendText(login.username, Constants.USERNAME_HRMS);
		sendText(login.password, Constants.PASSWORD_HRMS);
		click(login.loginBtn);
		jsClick(dash.pimLink);
		jsClick(emp.addEmployeeBtn);
		Thread.sleep(2000);
		
		sendText(emp.employeeFirstName, firstName);
		sendText(emp.employeeLastName, lastName);
		click(emp.saveEmpButton);
	}
}
