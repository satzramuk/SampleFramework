package com.practise.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.practise.pages.HomePage;
import com.practise.pages.LoginPage;
import com.utils.ReadPropertyFile;

public class HomePageTest extends BaseTest{
	
	LoginPage loginpage;
	HomePage homePage;
	int implicitwait = 30;

	
	
	private HomePageTest() {}
	
	
	@Test
	public void homePageTitleTest() throws Exception {
		loginpage = new LoginPage();
		homePage = loginpage.login(ReadPropertyFile.getValue("username"), ReadPropertyFile.getValue("password"));
		implicitWaitFunctn(implicitwait, TimeUnit.SECONDS);
		loginpage.skipBanner();
		String pagetitle = homePage.ValidateHomePageTitle();
		Assert.assertEquals(pagetitle, "");

		
		
	}

}
