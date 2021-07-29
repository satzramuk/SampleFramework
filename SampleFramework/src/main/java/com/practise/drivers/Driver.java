package com.practise.drivers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.practise.constants.FrameworkConstant;
import com.utils.ReadPropertyFile;

public class Driver {
	
	private Driver() {}
	
	
	

	
	public static void initDriver(String browsername,String url) throws Exception {
		
		
		switch(browsername) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver",FrameworkConstant.getChromedriverpath());
			DriverManager.setDriver(new ChromeDriver());
			break;
		case "firefox":
			System.setProperty("webdriver.chrome.driver",FrameworkConstant.getChromedriverpath());
			DriverManager.setDriver(new FirefoxDriver());
			break;
		case "edge":
			System.setProperty("webdriver.chrome.driver",FrameworkConstant.getChromedriverpath());
			DriverManager.setDriver(new EdgeDriver());
			break;
			
			
		}
		
		DriverManager.getDriver().get(ReadPropertyFile.getValue("productionurl"));
		DriverManager.getDriver().manage().window().maximize();
		
		/*if(DriverManager.getDriver()==null) {
		System.setProperty("webdriver.chrome.driver",FrameworkConstant.getChromedriverpath());
		DriverManager.setDriver(new ChromeDriver());
		DriverManager.getDriver().get(ReadPropertyFile.getValue("productionurl"));
		DriverManager.getDriver().manage().window().maximize();
			
		}*/
	}

	
	public static void quitDriver() {
		
		if(DriverManager.getDriver()!=null) {
		DriverManager.getDriver().quit();
		DriverManager.unload();
		}
	}
	
	

}
