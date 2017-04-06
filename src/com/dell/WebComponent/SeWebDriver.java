package com.dell.WebComponent;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.dell.util.BrowserDriver;

public class SeWebDriver 
{
	public static String mainWinId= null;
	public static WebDriver driver = BrowserDriver.driver;
	
	public static void passUrl(String url)
	{
		driver.get(url);
	}
	
	public static String getTitle()
	{
		return driver.getTitle();
	}
	
	public static String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public static String getPageSource()
	{
		return driver.getPageSource();
	}
	
	public static void switchToWindowById()
	{
		mainWinId = driver.getWindowHandle();
		Set<String> allWinIds = driver.getWindowHandles();
		
		for(String winId : allWinIds)
		{
			if(!(mainWinId.equals(winId)))
			{
				driver.switchTo().window(winId);
			}
		}
	}
	
	public static void switchToMainWindow()
	{
		driver.switchTo().window(mainWinId);
	}
	
	public static void navigateToApp(String url)
	{
		driver.navigate().to(url);
	}
	
	public static void back()
	{
		driver.navigate().back();
	}
	
	public static void refresh()
	{
		driver.navigate().refresh();
	}
	
	public static void forword()
	{
		driver.navigate().forward();
	}
	
	public static void close()
	{
		driver.close();
	}
	
	public static void quit()
	{
		driver.quit();
	}
		
	
	
	
	
}
