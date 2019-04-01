package com.qa.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility 
{
	public static WebDriver driver;
	
	//To launch the browser dynamically
	public void launchBrowser(String browserName,String browserDriver)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			String driverPath = System.getProperty("user.dir")+"//src//"+browserDriver;
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			String driver_path = System.getProperty("user.dir")+"//src//"+browserDriver;
			System.setProperty("webdriver.gecko.driver", driver_path);
			driver = new FirefoxDriver();
		}
	}

	
	//To Launch the application
	public void launchApp(String appUrl)
	{
		driver.get(appUrl);
	}
	
	//To Locate the Elements
	public By locator(String locName,String locValue)
	{
		By byObj = null;
		switch(locName)
		{
		case "id":
			byObj = By.id(locValue);
			break;
		case "name":
			byObj = By.name(locValue);
			break;
		case "className":
			byObj = By.className(locValue);
			break;
		case "tagName":
			byObj = By.tagName(locValue);
			break;
		case "linkText":
			byObj = By.linkText(locValue);
			break;
		case "partialLinkText":
			byObj = By.partialLinkText(locValue);
			break;
		case "xpath":
			byObj = By.xpath(locValue);
			break;
		case "cssSelector":
			byObj = By.cssSelector(locValue);
			break;
		default:
			System.out.println("No locator found");
		}
		return byObj;
	}
	
	//To send the data in the text field
	public void sendData(String locName,String locValue,String testdata)
	{
		driver.findElement(locator(locName,locValue)).sendKeys(testdata);
	}
	
	//To click on button/Element
	public void clickOnElm(String locName,String locValue)
	{
		driver.findElement(locator(locName,locValue)).click();
	}
	
	//To clear the fields
	public void clearField(String locName,String locValue)
	{
		driver.findElement(locator(locName,locValue)).clear();
	}
	
	//To check the availability of element
	public boolean elmAvailable(String locName,String locValue)
	{
		boolean isPresent = driver.findElement(locator(locName,locValue)).isDisplayed();
		return isPresent;
	}
	
	//To submit the form
	public void formSubmit(String locName,String locValue)
	{
		driver.findElement(locator(locName,locValue)).submit();
	}
	
	public void selectByIndex(String locName,String locValue, int index) {
		Select drop= (Select)driver.findElement(locator(locName, locValue));
		drop.deselectByIndex(index);
	}
	
	//Back button
	public void backbutton()
	{
		driver.navigate().back();
	}
	
	//Forward button
	public void forwardButton()
	{
		driver.navigate().forward();
	}
	
	//Only for unit testing
	/*
	 * public static void main(String[] args) { Utility utilObj = new Utility();
	 * utilObj.launchBrowser("Chrome","Browsers\\chromedriver.exe");
	 * utilObj.launchApp("https://www.facebook.com/");
	 * 
	 * ///functions of Page objects
	 * utilObj.sendData("name","email","user@gmail.com");
	 * utilObj.sendData("id","pass","userPwd");
	 * utilObj.clickOnElm("id","loginbutton"); utilObj.backbutton();
	 * utilObj.sendData("name","firstname","user@gmail.com");
	 * utilObj.clickOnElm("partialLinkText","Forgotten account");
	 * utilObj.backbutton(); }
	 */
}
