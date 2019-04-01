package com.qa.pageObjects;

import com.qa.Utility.Utility;

public class HomePage extends Utility
{
	public ContactUsPage clickContactUs()
	{
		clickOnElm("linkText", "Contact us");
		return new ContactUsPage();
	}
}
