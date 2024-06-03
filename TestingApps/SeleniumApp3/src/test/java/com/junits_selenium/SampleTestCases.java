package com.junits_selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import junit.framework.Assert;

public class SampleTestCases {

	WebDriver driver = null;
	
	@Before
	public void init()
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void endprocess()
	{
		driver.quit();
	}
	
	@Test
	public void GoogleTest()
	{		
		String expected = "Seven Wonders of the World - Google Search";
		
		driver.get("http:///www.google.com/");
		WebElement  element = driver.findElement(By.name("q"));
		element.sendKeys("Seven Wonders of the World");
		element.submit();
		String actual = driver.getTitle();		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void FbTest()
	{
		String exp = "venugopal@gmail.com";
		driver.get("http:///www.facebook.com/");
		WebElement  element = driver.findElement(By.name("email"));
		element.sendKeys("venugopal@gmail.com");
		String act = element.getAttribute("value");
		Assert.assertEquals(exp, act);
	}
}
