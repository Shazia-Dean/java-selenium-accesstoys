package com.toys1.accesstoys.test;



import org.junit.Assert;
import org.junit.Test;

import com.toys1.accesstoys.models.pages.CartPage;
import com.toys1.accesstoys.models.pages.CartTable;
import com.toys1.accesstoys.models.pages.HomePage;
import com.toys1.accesstoys.models.pages.Product;
import com.toys1.accesstoys.models.pages.ShopPage;



public class ShopePageTest extends BaseTestSuit{

	@Test
	public void verifyProductNameandPrice() throws Exception {
		
		Double expectedPrice = 14.99;
		HomePage homePage = new HomePage(driver);
		ShopPage shopPage = homePage.ClickShopLink();
		Product product = shopPage.shopItems("Smiley Bear");
		
		
		product.clickTheBuyButton();
		
		System.out.println(product.getProductName());
		System.out.println(product.getProductPrice());
		
	Assert.assertEquals("verification of product name", "Smiley Bear", product.getProductName());
	Assert.assertEquals("verification of product price", expectedPrice, product.getProductPrice());
	}
	
	@Test
	public void verifyCartCount() throws Exception {
		
	
		HomePage homePage = new HomePage(driver);
		ShopPage shopPage = homePage.ClickShopLink();
		CartPage cartPage = new CartPage(driver);
		
	
	Assert.assertEquals("Cart (0)", cartPage.getCartCount());
		homePage.ClickShopLink();
		
		Product product = shopPage.shopItems("Smiley Bear");
		product.clickTheBuyButton();
		
	Assert.assertEquals("Cart (1)", cartPage.getCartCount());
		
		cartPage.ClickCartMenu();
		cartPage.clickEmptyCartButton();
		cartPage.clickYesButton();
	
		
	
	
	}
	
	
	@Test
	public void verifyTableContents() {
		
	
		HomePage homePage = new HomePage(driver);
		ShopPage shopPage = homePage.ClickShopLink();
		CartPage cartPage = new CartPage(driver);
		
	
	Assert.assertEquals("Cart (0)", cartPage.getCartCount());
		homePage.ClickShopLink();
		
		Product product = shopPage.shopItems("Smiley Bear");
		product.clickTheBuyButton();
		
		shopPage.shopItems("Stuffed Frog");
		product.clickTheBuyButton();
		cartPage.ClickCartMenu();
		
	
	}
	
}
