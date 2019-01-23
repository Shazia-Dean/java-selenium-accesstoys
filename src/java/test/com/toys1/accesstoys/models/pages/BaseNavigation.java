package com.toys1.accesstoys.models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseNavigation {
	
	protected WebDriver driver;
	
	public BaseNavigation(WebDriver driver) {
		this.driver = driver;
		
	
		
	}
	By loginUserLink = By.cssSelector("#nav-user .user");
	By contactMenu = By.id("nav-contact");
	By loginMenu = By.cssSelector("#nav-login a");
	By shopLink = By.cssSelector("#nav-shop > a");
	By cartMenue = By.id("nav-cart");

	public ContactPage clickContactMenu() {
		driver.findElement(contactMenu).click();
		return new ContactPage(driver);

	}
	
	public LoginPage clickLoginButton() {
	driver.findElement(loginMenu).click();
	return new LoginPage(driver);
	
	}
	public String getLoggedInUserName() {
		return driver.findElement(loginUserLink).getText();
	}
	public ShopPage ClickShopLink() {
		driver.findElement(shopLink).click();
		return new ShopPage (driver);
	}

	public void ClickCartMenu() {
		driver.findElement(cartMenue).click();
		
	}
}
