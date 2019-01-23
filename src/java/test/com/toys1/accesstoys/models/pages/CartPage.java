package com.toys1.accesstoys.models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BaseNavigation {

	public CartPage(WebDriver driver) {
		super(driver);
		
	}
	
	By cartMenu = By.id("nav-cart");
	By emptyCartButton = By.linkText("Empty Cart");
	By yesButton = By.cssSelector(".popup .btn-success");
	By tableHeader = By.cssSelector("thead th");

	public String getCartCount() {
		return driver.findElement(cartMenu).getText();
	}
	
	public void clickEmptyCartButton() {
		driver.findElement(emptyCartButton).click();
		
	}
	public void clickYesButton() {
		driver.findElement(yesButton).click();
	}
	
	
}
