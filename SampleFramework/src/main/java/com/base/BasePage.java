package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.practise.drivers.DriverManager;

public class BasePage {

	//This method serves the purpose of Clicking an Element & also uses Explicit wait method
	public void click(WebElement element) {
		explicitWait(element);   	
		element.click();

	}
	
		


	//This method serves the purpose of Explicit Wait
	public void explicitWait(WebElement element) {
		new WebDriverWait(DriverManager.getDriver(), 30).until(ExpectedConditions.elementToBeClickable(element));


	}

	//This method serves the purpose of Click method without using explicit wait condition
	public void click(By by) {

		click(DriverManager.getDriver().findElement(by));
	}


    //This method serves the purpose of Implicit Wait condition
	public void implicitWaitFunctn(int value,TimeUnit timeUnit) {
		DriverManager.getDriver().manage().timeouts().implicitlyWait(value, timeUnit);
	}

    //This method serves the purpose passing values using SendKeys method
	public void sendKeys(WebElement element, String value) {
		explicitWait(element);
		element.sendKeys(value);

	}
	
	//This method serves the purpose of scrolling to the bottom of a page
	public void scrolltobottomPage() {
		JavascriptExecutor js = ((JavascriptExecutor) DriverManager.getDriver());
		 js.executeScript("window.scrollBy(0,300)");
	}
	



}


