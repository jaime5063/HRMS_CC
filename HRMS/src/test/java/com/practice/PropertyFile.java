package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFile {

	Properties prop;
	
	@Test
	public void read() {
		
		String filePath = System.getProperty("user.dir")+"/src/test/java/com/practice/PropertyFileTest";
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String v1 = prop.getProperty("Company");
		String v2=prop.getProperty("Username");
		String v3=prop.getProperty("Password");
		System.out.println(v1+"."+v2+"."+v3);
	}
	
}
