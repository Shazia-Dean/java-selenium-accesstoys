package com.toys1.accesstoys.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestSuit {
	protected static WebDriver driver;
	public static final int IMPLICIT_TIMEOUT = 3;

	@BeforeClass
	public static void setUpBeforeClass() {
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
	
	}
	
	@Before
	public void setUpBeforeTest() {
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://autowebsite-396.devnet.dg.internal/accesstoys/toys1");
	}

	@AfterClass
	public static void tearDownAfterClass() {
		driver.quit();
		

	}

}
