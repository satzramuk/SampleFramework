package com.practise.drivers;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.practise.constants.FrameworkConstant;

public class Driver {
	
	
	 public	static WebDriver driver;

	
	public static void initDriver() {
		
		
		if(driver==null) {
		System.setProperty("webdriver.chrome.driver",FrameworkConstant.getChromedriverpath());
		driver = new ChromeDriver();
		driver.get("https://www.tamilmatrimony.com/login/");
		driver.manage().window().maximize();
			
		}
	}

	
	public static void quitDriver() {
		
		if(driver!=null) {
		driver.quit();
		driver=null;
		}
	}
	
	

}
