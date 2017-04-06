package com.dell.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserDriver 
{
	public static WebDriver driver = null;
	public static WebDriver getDriver(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.browser", "C:\\Users\\Magushai\\workspace\\Phase2_MileStone\\Server\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.browser", "C:\\Users\\Magushai\\workspace\\Phase2_MileStone\\Server\\ie.exe");
			driver = new InternetExplorerDriver();
			
		}
		else
		{
			driver = new FirefoxDriver();
		}
		return driver;
	}
}
