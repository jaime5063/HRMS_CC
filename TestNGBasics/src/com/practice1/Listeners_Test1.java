package com.practice1;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Utils.CommonMethods;

@Listeners(com.practice1.TestNGListeners.class)
public class Listeners_Test1 extends CommonMethods{

	@Test
	public void googleTittleVerify() {
		setUp("chrome", "http://.google.com");
		System.out.println("I am from your current class: "+driver.getTitle());		
		driver.quit();
		
	}
	
	@Test
	public void TittleMatch() {		
		System.out.println("Test 1 Dummy");
		Assert.assertTrue(false);
		
	}
}
