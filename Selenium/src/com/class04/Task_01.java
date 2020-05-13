package com.class04;

import org.openqa.selenium.By;

import com.Utils.CommonMethods;

public class Task_01 extends CommonMethods{
	
	public static final String URLL = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) {

		CommonMethods.setUp("Chrome", URLL);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.linkText("Radio Buttons Demo")).click();

		driver.quit();
	}

}
/*TC 2: Radio Buttons Practice  
Open chrome browser
Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
Click on “Input Forms” links
Click on “Radio Buttons Demo” links
Click on any radio button in “Radio Button Demo” section.
Verify correct checkbox is clicked
Click on any radio button in “Group Radio Buttons Demo” section.
Verify correct checkbox is clicked
Quit browser

//*[@id="navbar-brand-centered"]/ul[1]/li[1]/a
 */
