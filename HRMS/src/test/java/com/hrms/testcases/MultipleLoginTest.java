package com.hrms.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;



public class MultipleLoginTest extends CommonMethods{

	@Test(dataProvider="getData", groups="regression")
	public void multipleLogin(String uid, String pwd) {
		LoginPageElements login = new LoginPageElements();
		sendText(login.username, uid);
		sendText(login.password, pwd);
		click(login.loginBtn);
	}
	
	@DataProvider
	public Object[][] getData(){
		return ExcelUtility.excelIntoArray(Constants.XL_DATA_FILEPATH, "HrmsEmployee.xlsx");
	}
}
