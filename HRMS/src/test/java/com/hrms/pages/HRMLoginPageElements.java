package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class HRMLoginPageElements extends CommonMethods{

	@FindBy(id="txtUsername")
	public WebElement userName;
	
	@FindBy(id="txtPassword")
	public WebElement passWord;
	
	@FindBy(id="btnLogin")
	public WebElement loginBtn;
	
	@FindBy(id="welcome")
	public WebElement welcome;
	
	public HRMLoginPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void login(String uid, String pwd) {
		sendText(userName, uid);
		sendText(passWord, pwd);
		click(loginBtn);
	}
	
}
