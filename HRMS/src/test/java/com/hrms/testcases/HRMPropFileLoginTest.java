package com.hrms.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPageElements;
import com.hrms.pages.HRMLoginPageElements;
import com.hrms.utils.CommonMethods;

public class HRMPropFileLoginTest extends CommonMethods{

		Properties prop;
		
		@Test(groups={"regression"})
		public void loginWithFileProp() {
			
			String filePath = System.getProperty("user.dir")+
					"/src/test/java/com/HRMS_PropertyFile/HRMSPropFileCredentials";
			
			try {
				FileInputStream fis = new FileInputStream(filePath);
				prop=new Properties();
				prop.load(fis);
			} catch (FileNotFoundException e) {		
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			HRMLoginPageElements cred = new HRMLoginPageElements();
			cred.login(prop.getProperty("OrangeUser"), prop.getProperty("OrangePass"));
			String expected = "Welcome Admin";
			String actual = cred.welcome.getText();
			AssertJUnit.assertEquals(actual, expected, "Message incorrect");
			System.out.println(actual);
		}
	}
