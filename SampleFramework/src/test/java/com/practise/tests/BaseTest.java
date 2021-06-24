package com.practise.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
