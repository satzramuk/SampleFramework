package com.practise.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.practise.drivers.DriverManager;

public class HomePageTest extends BaseTest{
	
	
	
	private HomePageTest() {}
	
	
	@Test
	public static void homePageTestDemo() {
		
		        //driver.findElement(By.id("MIDP")).click();
				DriverManager.getDriver().findElement(By.id("MIDP")).sendKeys("M7444408");
				//driver.findElement(By.id("PASSWORD2")).click();
				DriverManager.getDriver().findElement(By.id("PASSWORD2")).sendKeys("test4bm");
				DriverManager.getDriver().findElement(By.className("login-btn")).click();

		
	}
	
	@Test
	public static void homePageTestDemo1() {
		
		        //driver.findElement(By.id("MIDP")).click();
				DriverManager.getDriver().findElement(By.id("MIDP")).sendKeys("M7444408");
				//driver.findElement(By.id("PASSWORD2")).click();
				DriverManager.getDriver().findElement(By.id("PASSWORD2")).sendKeys("test4bm");
				DriverManager.getDriver().findElement(By.className("login-btn")).click();

		
	}


}
