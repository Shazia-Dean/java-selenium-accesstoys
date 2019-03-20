package com.toys1.accesstoys.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.toys1.accesstoys.models.pages.ContactPage;
import com.toys1.accesstoys.models.pages.HomePage;

public class ContactPageTests extends BaseTestSuit {

	@Test
	public void mandatoryFieldErrorsDisplay() {
		HomePage homePage = new HomePage(driver);
		ContactPage contactPage = homePage.clickContactMenu();
		contactPage.clickSubmitButton();
			
		Assert.assertEquals("forename error displayed", "Forename is required",
				contactPage.getForenameError());
		Assert.assertEquals("email error displayed", "Email is required",
				contactPage.getEmailError());
		Assert.assertEquals("Message error displayed", "Message is required",
				contactPage.getmessageError());
		
		contactPage.setForenameField("Tester");
		contactPage.setEmailField("tester@accesshq.com");
		contactPage.setMessageField("Hello");
		
		Assert.assertEquals("forename error not displayed", "",
				contactPage.getForenameError());
		Assert.assertEquals("email error not displayed", "",
			    contactPage.getEmailError());
	    Assert.assertEquals("Message error not displayed", "",
				contactPage.getmessageError());
	}
	@Test
	public void invalidFieldErrorMessages() {
		
		HomePage homePage = new HomePage(driver);
		ContactPage contactPage = homePage.clickContactMenu();

		contactPage.setEmailField("tester");
		contactPage.setTelephoneField("dfdsfasd");
		Assert.assertEquals("invalid email address", "Please enter a valid email",
				contactPage.getEmailError());
		assertEquals("invalid telephone number", "Please enter a valid telephone number",
				contactPage.getTelephoneError());
	}
	@Test
	public void successfulSubmissionMessage() {
		HomePage homePage = new HomePage(driver);
		ContactPage contactPage = homePage.clickContactMenu();
		
		contactPage.setForenameField("Tester");
		contactPage.setEmailField("tester@accesshq.com");
		contactPage.setMessageField("Hello");
		contactPage.clickSubmitButton();
		Assert.assertEquals("sucessess message displayed", "We welcome your feedback - tell it how it is.",
				contactPage.getSuccessMessage());
	}
 
}
