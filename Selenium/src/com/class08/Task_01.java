package com.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethods;
import com.Utils.Constants;

public class Task_01 extends CommonMethods{

/*Table headers and rows verification
Open chrome browser
Go to “http://166.62.36.207/syntaxpractice/”
Click on “Table” link
Click on “ITable Data Search” link
Verify second table consist of 4 rows and 5 columns
Print name of all column headers 
Print data of all rows
Quit Browser
 * 	
 */
	public static void main(String[] args) {
	
		CommonMethods.setUp("Chrome", Constants.SYNTAX_PRACTICE_);
		
		driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
		
		// table body --> Anytime you want to find the number of rows
		List<WebElement> Rows = driver.findElements(By.xpath("table[@class='table']/tbody/tr"));
		System.out.println(Rows.size());
		
		// Number of Columns from the Seconds Table
		List<WebElement> Cols = driver.findElements(By.xpath("table[@class='table']/thead[2]/tr/th"));
		System.out.println(Cols.size());
		
		for(WebElement row: Rows) {
			String header = row.getText();
			System.out.println(header);
		}
		
		Iterator<WebElement> Col = Cols.iterator();
		while(Col.hasNext()) {
			String Columns = Col.next().getText();
			System.out.println(Columns);
		}
		driver.quit();

	}

}
