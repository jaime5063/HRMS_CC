package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.addedEmployeePageElements;
import com.hrms.utils.CommonMethods;

/*Sprint 5
US 16767: As an admin I should be able to add an employee 

TC: Add Employee
Step 1. navigate to the application
Step 2: login into the application
Step 3: navigate to add employee page
Step 4: add employee by providing fname. mname, lname
Step 5: verify employee has been added successfully

 */
public class AddEmployeePageTest extends CommonMethods{

	@Test(groups= {"regression"})
	public void addEmployee() {
		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();
		AddEmployeePageElements empPage = new AddEmployeePageElements();
		addedEmployeePageElements addedEmp = new addedEmployeePageElements();
		sendText(login.username, "Admin");
		sendText(login.password, "Syntax@123");
		click(login.loginBtn);
		jsClick(dashboard.pimLink);
		jsClick(empPage.addEmployeeBtn);
		sendText(empPage.employeeFirstName, "Java");
		sendText(empPage.employeeMiddleName, "Code");
		sendText(empPage.employeeLastName, "Testers");
		click(empPage.saveEmpButton);
		Assert.assertTrue(addedEmp.personalDetails.isDisplayed());
	}
	
	
}
