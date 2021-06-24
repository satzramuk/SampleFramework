package com.practise.drivers;

import org.openqa.selenium.chrome.ChromeDriver;

import com.practise.constants.FrameworkConstant;

public class Driver {
	
	private Driver() {}
	
	
	

	
	public static void initDriver() {
		
		
		if(DriverManager.getDriver()==null) {
		System.setProperty("webdriver.chrome.driver",FrameworkConstant.getChromedriverpath());
		DriverManager.setDriver(new ChromeDriver());
		DriverManager.getDriver().get("https://www.tamilmatrimony.com/login/");
		DriverManager.getDriver().manage().window().maximize();
			
		}
	}

	
	public static void quitDriver() {
		
		if(DriverManager.getDriver()!=null) {
		DriverManager.getDriver().quit();
		DriverManager.unload();
		}
	}
	
	

}
