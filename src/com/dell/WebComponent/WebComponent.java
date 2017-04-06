package com.dell.WebComponent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dell.util.BrowserDriver;

public class WebComponent 
{
	
	public static int syncTime = 60;
	public static WebDriver driver = BrowserDriver.driver;
	
	static WebDriverWait wait = null;
	
	public static void click(String locator, String value)
	{
		driver.findElement(SeLocator.locator(locator, value)).click();
	}
	
	public static void setValue(String locator, String locatorValue, String txtValue)
	{
		driver.findElement(SeLocator.locator(locator, locatorValue)).sendKeys(txtValue);
	}
	
	public static boolean isDisplayed(String locator, String locatorValue)
	{
		return driver.findElement(SeLocator.locator(locator, locatorValue)).isDisplayed();
	}
	
	public static boolean isEnabled(String locator, String locatorValue)
	{
		return driver.findElement(SeLocator.locator(locator, locatorValue)).isEnabled();
	}
	
	public static boolean isSelected(String locator, String locatorValue)
	{
		return driver.findElement(SeLocator.locator(locator, locatorValue)).isSelected();
	}
	
	public static String getText(String locator, String locatorValue)
	{
		return driver.findElement(SeLocator.locator(locator, locatorValue)).getText();
	}
	
	public static String getAttributeValue(String locator, String locatorValue, String attValue)
	{
		return driver.findElement(SeLocator.locator(locator, locatorValue)).getAttribute(attValue);
	}
	
	public static String getCssValue(String locator, String locatorValue, String style)
	{
		return driver.findElement(SeLocator.locator(locator, locatorValue)).getCssValue(style);
	}
	
	public static String getTagName(String locator, String locatorValue)
	{
		return driver.findElement(SeLocator.locator(locator, locatorValue)).getTagName();
	}
	
	public static void waitTillElementPresent(String locator, String locatorValue)
	{
		wait = new WebDriverWait(driver, syncTime);
		wait.until(ExpectedConditions.presenceOfElementLocated(SeLocator.locator(locator, locatorValue)));
	}
	
	public static void implicitlyWait()
	{
		driver.manage().timeouts().implicitlyWait(syncTime, TimeUnit.SECONDS);
	}
	
	public static void waitTillPageLoad()
	{
		driver.manage().timeouts().pageLoadTimeout(syncTime, TimeUnit.SECONDS);
	}
}
