package com.toys1.accesstoys.models.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.toys1.accesstoys.utility.Utility;

public class LoginPage {

	protected WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	By userNameField = By.id("loginUserName");
	By passwordField =  By.id("loginPassword");
	By loginMessage = By.id("login-error");
	By loginButton = By.cssSelector("div.popup button.btn-primary");
	
	public void setLoginUserName(String userName) {
		driver.findElement(userNameField).sendKeys(userName);
	}
	public void setLoginPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	public String getLoginMessage() {
		return Utility.elementExists(driver, loginMessage, 0, 100)?
				driver.findElement(loginMessage).getText():"";
	}
	public void clickLoginButton() {
		driver.findElement(loginButton).sendKeys(Keys.ENTER);
	}
}

