package com.dell.WebComponent;

import org.openqa.selenium.By;

public class SeLocator 
{
	static By by = null;
	public static By locator(String locator, String AttValue)
	{
		
		switch(locator)
		{
		  case "id":
			  by = By.id(AttValue);
			  break;
			  
		  case "name":
			  by = By.name(AttValue);
			  break;
			  
		  case "className":
			  by = By.className(AttValue);
			  break;
			  
		  case "css":
			  by = By.cssSelector(AttValue);
			  break;
			  
		  case "linkText":
			  by = By.linkText(AttValue);
			  break;
			  
		  case "partialLinkText":
			  by = By.partialLinkText(AttValue);
			  break;
			  
		  case "xpath":
			  by = By.xpath(AttValue);
			  break;
			  
		  case "tagName":
			  by = By.tagName(AttValue);
			  break;
		
		}
		return by;
		
	}
}
