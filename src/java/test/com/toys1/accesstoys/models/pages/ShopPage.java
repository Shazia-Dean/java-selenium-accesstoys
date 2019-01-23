package com.toys1.accesstoys.models.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage extends BaseNavigation {

	public ShopPage(WebDriver driver) {
		super(driver);
	}
	public Product shopItems(String productName) throws Exception {
	
	List<WebElement> products = driver.findElements(By.className("product"));
	
	for(WebElement element: products) {
		Product product = new Product(element);
		
			if(product.getProductName().equals(productName)) {
				
				return product;
			}
	} 
	throw new Exception("Product not found"); 
	
}
}