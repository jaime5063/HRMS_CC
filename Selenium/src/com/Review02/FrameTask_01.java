package com.Review02;

import com.Utils.CommonMethods;

public class FrameTask_01 extends CommonMethods {

	public static void main(String[] args) {
		
		CommonMethods.setUp("chrome", "https://www.amazon.com/");

		driver.switchTo().frame("//div[@id='ape_Gateway_right-2_desktop_placement_Feedback']");
		
	}

}

/*
 * switchToFrame(driver.findElement(By.xpath("//div[@id='ape_Gateway_right-2_desktop_placement']/iframe")))
 */
