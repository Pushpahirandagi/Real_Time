package com.digisoft.actitime.seleniumautomation.utils;

import org.openqa.selenium.WebDriver;

/****
 *  @author PUSHPA
 *  Global variables is a class which will hold
 *  all the required global variables
 */

public class GlobalVariables 
{
	
		public static final String REPORTS = "/reports";
		public static final String USERNAME = "admin";
		public static final String PASSWORD = "manager";

		public static WebDriver driver;
		
		
		public void initDriver()
		{
			driver = new DriverUtils().getDriver("chrome");
		}
	}
	
			
			
			
			
		
	


