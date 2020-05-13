package com.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class WebTable_01 extends CommonMethods{

	public static void main(String[] args) {
		
		setUp("Chrome", Constants.SYNTAX_PRACTICE_);
		
		//navigate to the table we need
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		
		// Number of Rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
		System.out.println(rows.size());
		
		// Number of Columns 
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
		System.out.println(cols.size());
		
		// Printing Row Data 
		Iterator<WebElement> rowsIt = rows.iterator();
		while(rowsIt.hasNext()) {
			String Row = rowsIt.next().getText();
			System.out.println(Row);
		}		
		// Printing all headers
		for(WebElement col: cols) {
			String header = col.getText();
			System.out.println(header);
		}	
		driver.quit();
	}

}
