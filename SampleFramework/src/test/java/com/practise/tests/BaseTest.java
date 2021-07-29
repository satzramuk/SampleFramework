package com.practise.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.base.BasePage;
import com.practise.drivers.Driver;
import com.utils.ReadPropertyFile;

public class BaseTest  extends BasePage{
	
	protected BaseTest() {

	}
	
	
	
	@BeforeMethod
	public void setUP() throws Exception {
		
		Driver.initDriver(ReadPropertyFile.getValue("browsername"), null);
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		
		Driver.quitDriver();
	}
	
	
	
	
	

}
