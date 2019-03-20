package com.toys1.accesstoys.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.toys1.accesstoys.models.pages.HomePage;
import com.toys1.accesstoys.models.pages.LoginPage;



public class LoginPageTests extends BaseTestSuit {

	@Test
	public void loginErrorMessage() {
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = homePage.clickLoginButton();
		
		loginPage.setLoginUserName("userName");
		loginPage.setLoginPassword("password");
		loginPage.clickLoginButton();
		
		Assert.assertEquals("error message displayed", "Your login details are incorrect",
			loginPage.getLoginMessage());
		
	}
	@Test
	public void verificationOfValidLogin() {
		
		String username = "User1";
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = homePage.clickLoginButton();
		
		
		loginPage.setLoginUserName(username);
		loginPage.setLoginPassword("letmein");
		loginPage.clickLoginButton();
		
		Assert.assertEquals("login user is correct", username, homePage.getLoggedInUserName());
	}

}
