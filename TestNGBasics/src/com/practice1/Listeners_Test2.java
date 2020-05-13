package com.practice1;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Utils.CommonMethods;


public class Listeners_Test2 extends CommonMethods{

	@Test
	public void googleTittleVerify() {
		setUp("chrome", "http://.google.com");
		System.out.println("I am from your second class: "+driver.getTitle());		
		driver.quit();
		
	}
	
	@Test
	public void TittleMatch() {		
		System.out.println("Test 2 Dummy");
		Assert.assertTrue(false);
		
	}
}



