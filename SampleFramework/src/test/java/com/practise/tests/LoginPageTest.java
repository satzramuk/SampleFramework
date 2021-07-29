package com.practise.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.practise.drivers.DriverManager;
import com.practise.pages.HomePage;
import com.practise.pages.LoginPage;
import com.utils.ReadPropertyFile;

public class LoginPageTest extends BaseTest {


	LoginPage loginpage;
	HomePage homePage;
	int implicitwait = 30;


	private LoginPageTest() {

	}


	@Test(enabled=false)
	public void loginTest() {
		//driver.findElement(By.id("MIDP")).click();
		DriverManager.getDriver().findElement(By.id("MIDP")).sendKeys("M7444408");
		//driver.findElement(By.id("PASSWORD2")).click();
		DriverManager.getDriver().findElement(By.id("PASSWORD2")).sendKeys("test4bm");
		DriverManager.getDriver().findElement(By.className("login-btn")).click();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DriverManager.getDriver().findElement(By.xpath("//a[contains(text(),'Skip to MyHome ›')]")).click();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		


	}
	
	@Test
	public void loginintoDemo() throws Exception {
		
		loginpage = new LoginPage();
		homePage = loginpage.login(ReadPropertyFile.getValue("username"), ReadPropertyFile.getValue("password"));
		implicitWaitFunctn(implicitwait, TimeUnit.SECONDS);
		loginpage.skipBanner();
		homePage.logoutAction(homePage.getTopmenuoption(), null);
			
		
	}



}
