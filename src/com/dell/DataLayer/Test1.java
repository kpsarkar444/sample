package com.dell.DataLayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.dell.WebComponent.WebComponent;
import com.dell.util.BrowserDriver;

public class Test1 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		WebDriver driver = BrowserDriver.getDriver("firefox");
		driver.get("https://www.facebook.com/");
		
		WebComponent.setValue("id", "email", "abc");
		
		String s1 = WebComponent.getCssValue("id", "email", "color");
		System.out.println(s1);
		
		WebComponent.setValue("id", "pass", "12345");
		
		WebComponent.click("id", "loginbutton");
		
		
		
		
		
//		System.out.println(driver.findElement(By.xpath("//u[text()='Facebook']/..")).isDisplayed());
		
//		driver.findElement(By.id("email")).sendKeys("gjkf");
//		driver.findElement(By.id("pass")).sendKeys("fbhfh");
//		driver.findElement(By.id("loginbutton")).click();
//		Thread.sleep(6000);
//		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'The email address or phone number')]")).isDisplayed());
		
		
		
		
		
	}

}
