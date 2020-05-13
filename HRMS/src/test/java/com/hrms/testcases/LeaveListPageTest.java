package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class LeaveListPageTest extends CommonMethods{

	@Test (groups={"regression"}) // positive test will be labeled Smoke
	public void leaveLabelValidation() {
		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();
		LeaveListPageElements leaveList = new LeaveListPageElements();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		jsClick(dashboard.leaveLnk);
		jsClick(dashboard.leaveList);
		Assert.assertTrue(leaveList.leaveListLable.isDisplayed(), "Label is NOT displayed");
	}	
}
/*
 * 
 */
