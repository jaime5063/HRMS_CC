package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.hrms.pages.LoginPage;
import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;

public class LoginPageTest extends CommonMethods{
	
	@Test (groups={"regression"})
	public void login() {	
		LoginPage login = new LoginPage();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.passowrd, ConfigsReader.getProperty("password"));
		click(login.loginButton);
	}
	
//	@Test (groups={"regression"})
	public void loginErrValidation() throws InterruptedException {
		LoginPageElements login = new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		click(login.loginBtn);
		String expectedError = "Password cannot be empty";
		Assert.assertEquals(login.errMsg.getText(), expectedError);
			Thread.sleep(2000);
	}
}
