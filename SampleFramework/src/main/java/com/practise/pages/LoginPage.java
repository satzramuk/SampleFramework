package com.practise.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BasePage;
import com.practise.drivers.DriverManager;

public  class LoginPage extends BasePage {

	int implicitwait = 30;

	//Object Repository or Webpage Elements

	@FindBy(id="MIDP")
	private WebElement username;

	@FindBy(id="PASSWORD2")
	private WebElement password;


	@FindBy(className="login-btn")
	private WebElement loginbtn;

	@FindBy(xpath="//a[contains(text(),'Skip to MyHome ›')]")
	private WebElement skipbtn;
	
	@FindBy(xpath="//span[normalize-space()='to My Home']")
	private WebElement skipbtn1;
	
	
	@FindBy(xpath="//img[@title='Close']")
	private WebElement imageclose;
	

	//Initializing the Page Elements


	public LoginPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}


	//Generating Getters for the above page elements
	
	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	public WebElement getSkipbtn() {
		return skipbtn;
	}


	public WebElement getSkipbtn1() {
		return skipbtn1;
	}
	
	
	public WebElement getImageclose() {
		return imageclose;
	}


	//Page Action methods 

	public  HomePage login(String un, String pswd) {
		username.sendKeys(un);
		password.sendKeys(pswd);
		loginbtn.click();

		//This method is returning the HomePage Class object
		return new HomePage();

	}


	public void skipBanner() {

		try {
			
			click(skipbtn);
		} catch (Exception e) {
			System.out.println("Banner is not getting displayed");
		}
		
		try {
			
			scrolltobottomPage();
			click(skipbtn1);
			
		} catch (Exception e) {
			System.out.println("Banner is not getting displayed");
		}
		
		try {
			
			click(imageclose);	
			
		} catch (Exception e) {
			System.out.println("Banner is not getting displayed");
		}

	}


}
