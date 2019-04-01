package com.qa.testCases;

import org.testng.annotations.Test;

import com.qa.pageObjects.ContactUsPage;

public class ContactUsTestCase extends ContactUsPage
{
	@Test
	public void message()
	{
		sendMessage();
	}
}
