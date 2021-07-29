package com.practise.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;
import com.practise.drivers.DriverManager;

public class HomePage extends BasePage{

	
	@FindBy(xpath="//li[@class='profile-rot drop-notify']")
	private WebElement topmenuoption;
	
	@FindBy(xpath="//span[normalize-space()='Logout']")
	private WebElement logoutCTA;
	
	static Actions builder;
	

	public HomePage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}
	

	public WebElement getTopmenuoption() {
		return topmenuoption;
	}
	
	public WebElement getLogoutCTA() {
		return logoutCTA;
	}

	
	//Action Methods
	
	
	public LoginPage logoutAction(WebElement ele, By by) {
		 builder = new Actions(DriverManager.getDriver());
		builder.moveToElement(ele).perform();
		implicitWaitFunctn(30, TimeUnit.SECONDS);
		click(getLogoutCTA());
		return new LoginPage();
		
		
	}
	
	
	public String ValidateHomePageTitle() {
		return DriverManager.getDriver().getTitle();
	}

	
		
		
	
	
	
	
	
	
}
