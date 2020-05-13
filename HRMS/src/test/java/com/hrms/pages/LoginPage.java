package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hrms.testbase.BaseClass;

public class LoginPage extends BaseClass{

	public WebElement username = driver.findElement(By.id("txtUsername"));
	public WebElement passowrd = driver.findElement(By.id("txtPassword"));
	public WebElement loginButton = driver.findElement(By.id("btnLogin"));
//	public WebElement errMsg = driver.findElement(By.id("spanMessage"));
}
