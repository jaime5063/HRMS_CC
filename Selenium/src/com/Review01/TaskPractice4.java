package com.Review01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;
import com.Utils.ConstantsPractice;

public class TaskPractice4 extends CommonMethods {

	public static void main(String[] args) {

		setUp("chrome", ConstantsPractice.ESPN);

		List<WebElement> eLinks = driver.findElements(By.tagName("a"));
		// check how many Links are present in ESPN home page
		int numLinks = eLinks.size();
		System.out.println(numLinks);

		// Loop through all Links and give me the name(text) IF IT IS NOT EMPTY
		for (WebElement names : eLinks) {
			if (!names.getText().isEmpty()) {
				System.out.println(names.getText());
			}
		}
		driver.quit();
	}
}
