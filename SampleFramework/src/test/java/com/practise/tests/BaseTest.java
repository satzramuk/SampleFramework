package com.practise.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.practise.constants.FrameworkConstant;
import com.practise.drivers.Driver;

public class BaseTest {
	
	protected BaseTest() {

	}
	
	
	
	@BeforeMethod
	public void setUP() {
		
		Driver.initDriver();
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		
		Driver.quitDriver();
	}
	
	
	
	
	

}
