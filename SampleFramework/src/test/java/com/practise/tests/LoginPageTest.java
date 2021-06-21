package com.practise.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.practise.drivers.Driver;

public class LoginPageTest extends BaseTest {


	//1. Never Hardcode framework
	//2. Keeping right things in right place.


	public LoginPageTest() {

	}


	@Test
	public void loginTest() {
		//driver.findElement(By.id("MIDP")).click();
		Driver.driver.findElement(By.id("MIDP")).sendKeys("M7444408");
		//driver.findElement(By.id("PASSWORD2")).click();
		Driver.driver.findElement(By.id("PASSWORD2")).sendKeys("test4bm");
		Driver.driver.findElement(By.className("login-btn")).click();


	}



}
