package com.hrms.utils;

public class Constants {

//	public static final String HRMS_URL = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
//	
//	public static final String HRMS_SECOND = "http://166.62.36.207/Syntax_HRM";
//	
//	public static final String ORANGE_HRMS = "https://opensourse-demo.orangehrmlive.com/";
//	
//	public static final String browser = "chrome";

	// specify path to chrome and gecko driver

	public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir")
			+ "/src/test/resources/drivers/chromedriver";

	public static final String GECKO_DRIVER_PATH = System.getProperty("user.dir")
			+ "/src/test/resources/drivers/geckodriver";

	public static final int PAGE_LOAD_TIME = 30;

	public static final int IMPLICIT_LOAD_TIME = 10;

	public static final int EXPLICIT_LOAD_TIME = 30;

	public static final String CREDENTIALS_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/configs/Configuration.properties";

	public static final String EXCEL_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/configs/caldata.xlsx";

	public static final String XL_DATA_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/testData/HrmsEmployee.xlsx";

	public static final String REPORT_FILEPATH = System.getProperty("user.dir") + "/target/report/Hrms.html";

	public static final String OS_NAME = System.getProperty("os.name");

	public static final String USER_NAME = System.getProperty("user.name");

	public static final String SCREENSHOTS_FILEPATH = System.getProperty("user.dir") + "/target/screenshots/";

	public static final String USERNAME_HRMS = "Admin";
	public static final String PASSWORD_HRMS = "Syntax@123";

}
