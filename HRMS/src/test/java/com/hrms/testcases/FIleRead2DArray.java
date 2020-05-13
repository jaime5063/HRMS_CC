package com.hrms.testcases;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.hrms.utils.Constants;

public class FIleRead2DArray {

	private static FileInputStream fis;
	Sheet sheet;
	Workbook wbook;
	int rows;
	int columns;
	
	@Test(groups={"regression"})
	public void myFile() throws IOException {

		fis = new FileInputStream(Constants.EXCEL_FILEPATH);
		wbook = new XSSFWorkbook(fis);
		sheet = wbook.getSheet("Sheet1");
		rows = sheet.getPhysicalNumberOfRows();
		columns = sheet.getRow(0).getLastCellNum();
		System.out.println("ROWS: " + rows + " COLS: " + columns);
	
		for(int i=0; i<rows; i++) {
			Row row = sheet.getRow(i);
			
			for(int x=0; x<columns; x++) {
				Cell cell = row.getCell(x);
				
				if(cell.toString().contains("User")) {
					System.out.println(sheet.getRow(0).getCell(0).toString()+" = "+sheet.getRow(0).getCell(1).toString());
					
					if(cell.toString().contains("Pass")) {
						System.out.println(sheet.getRow(0).getCell(1).toString()+" = "+sheet.getRow(1).getCell(1));
					}
				}
			}
		}
			
			
	}
}
