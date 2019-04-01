package com.qa.testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pageObjects.HomePage;

public class HomeTestCase extends HomePage
{
	@BeforeClass
	public void setUp()
	{
		launchBrowser("chrome" ,"Browsers//chromedriver.exe");
		launchApp("http://automationpractice.com/index.php");
	}
	@Test
	public void ContactUs()
	{
		clickContactUs();
	}
	
}
