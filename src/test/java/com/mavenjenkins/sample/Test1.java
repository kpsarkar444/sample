package com.mavenjenkins.sample;

import java.util.Iterator;
import java.util.LinkedHashSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 
{
	@Test
	public void Run()
	{
		WebDriver d=new FirefoxDriver();
		d.get("http://www.facebook.com");
		System.out.println("print the title of the page ");
		System.out.println(d.getTitle());
		d.close();
	}

	@Test
	public void linked()
	{
		LinkedHashSet<String> link=new LinkedHashSet<String>();
		link.add("Pranay");
		link.add("Sarkar");
		System.out.println(link);
		System.out.println();
		System.out.println("***********");
		Iterator<String> itr=link.iterator();
		System.out.println(itr.hasNext());
		System.out.println("#########");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		LinkedHashSet<String> link2=new LinkedHashSet<String>();
		link2.add("Pradip");
		link2.add("Sarkar");
		System.out.println(link2);
		System.out.println("*************");
		System.out.println("---------------");
		System.out.println(link.addAll(link2));
		System.out.println("============");
		
		String[] s1=new String[link.size()];
		System.out.println("*********");
		link.toArray(s1);
		for(String s:s1)
		{
			System.out.println(s);
		}
	}

}
