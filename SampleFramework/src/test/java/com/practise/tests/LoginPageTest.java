package com.practise.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.practise.drivers.DriverManager;

public class LoginPageTest extends BaseTest {


	//1. Never Hardcode framework
	//2. Keeping right things in right place.


	private LoginPageTest() {

	}


	@Test
	public void loginTest() {
		//driver.findElement(By.id("MIDP")).click();
		DriverManager.getDriver().findElement(By.id("MIDP")).sendKeys("M7444408");
		//driver.findElement(By.id("PASSWORD2")).click();
		DriverManager.getDriver().findElement(By.id("PASSWORD2")).sendKeys("test4bm");
		DriverManager.getDriver().findElement(By.className("login-btn")).click();


	}



}
