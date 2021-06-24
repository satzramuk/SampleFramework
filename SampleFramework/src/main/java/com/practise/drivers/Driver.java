package com.practise.drivers;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import com.practise.constants.FrameworkConstant;
import com.utils.ReadPropertyFile;

public class Driver {
	
	private Driver() {}
	
	
	

	
	public static void initDriver() throws IOException {
		
		
		if(DriverManager.getDriver()==null) {
		System.setProperty("webdriver.chrome.driver",FrameworkConstant.getChromedriverpath());
		DriverManager.setDriver(new ChromeDriver());
		DriverManager.getDriver().get(ReadPropertyFile.getValue("productionurl"));
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
