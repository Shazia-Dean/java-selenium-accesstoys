package com.toys1.accesstoys.models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.toys1.accesstoys.utility.Utility;

public class ContactPage extends BaseNavigation {
	public ContactPage(WebDriver driver) {
		super(driver);	
	
	}
	
		By forenameError = By.id("forename-err");
		By emailError = By.id("email-err");
		By messageError = By.id("message-err");
		By telephoneError = By.id("telephone-err");
		By ForenameField = By.id("forename");
		By emailField = By.id("email");
		By messageField = By.id("message");
		By telephoneField = By.id("telephone");
		By successMessage = By.className("alert");
		
	
	public void clickSubmitButton() {
		driver.findElement(By.linkText("Submit")).sendKeys(Keys.ENTER);
	}
	
	public String getForenameError() {
		return Utility.elementExists(driver, forenameError, 0, 300)?
				driver.findElement(forenameError).getText(): "";
	}
	public String getEmailError() {
		return Utility.elementExists(driver, emailError, 0, 300)?
				driver.findElement(emailError).getText(): "";
	}
	public String getmessageError() {
		return Utility.elementExists(driver, messageError, 0, 300)?
				driver.findElement(messageError).getText(): "";
	}
	public String getTelephoneError() {
		return Utility.elementExists(driver, telephoneError, 0, 300)?
				driver.findElement(telephoneError).getText(): "";
	}
	public void setForenameField(String forename) {
		driver.findElement(ForenameField).sendKeys(forename);
	}
	public void setEmailField(String email) {
		driver.findElement(emailField).sendKeys(email);;
	}
	public void setMessageField(String message) {
		driver.findElement(messageField).sendKeys(message);;
	}
	public void setTelephoneField(String telephone) {
		driver.findElement(telephoneField).sendKeys(telephone);
	}
	public String getSuccessMessage() {
		return Utility.elementExists(driver, successMessage, 60, 0)?
				driver.findElement(successMessage).getText(): "";

	}
}
