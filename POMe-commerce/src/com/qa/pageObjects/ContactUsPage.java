package com.qa.pageObjects;

import com.qa.Utility.Utility;

public class ContactUsPage extends Utility
{
	public void sendMessage()
	{
		sendData("name", "id_contact", "Customer service");
		//selectByIndex("id", "id_contact", 1);
		sendData("id", "email", "anupriya@gmail.com");
		sendData("id", "id_order", "#23415");
		sendData("xpath" , "//textarea[@id='message']", "product is different from what i have ordered.");
		//clickOnElm("xpath" , "//input[@id='fileUpload']");
		sendData("xpath", "//input[@id='fileUpload']", "C:\\Users\\DELL\\Pictures");
		clickOnElm("id", "submitMessage");
	}
}
