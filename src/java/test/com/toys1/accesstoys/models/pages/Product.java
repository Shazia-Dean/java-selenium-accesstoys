package com.toys1.accesstoys.models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

	public class Product {

		private WebElement productElement;
	 
	public Product(WebElement productElement) {
		this.productElement = productElement;
	}
	By productPrice = By.className("product-price");
	By productName = By.className("product-title");
	By buyButton = By.className("btn-success");

	public Double getProductPrice() {
		return Double.parseDouble(productElement.findElement(productPrice)
				.getText().replace("$", ""));
	
	}
	public String getProductName() {
		return productElement.findElement(productName).getText();
	}
	public void clickTheBuyButton() {

	productElement.findElement(buyButton).sendKeys(Keys.ENTER);
	}
	
}
