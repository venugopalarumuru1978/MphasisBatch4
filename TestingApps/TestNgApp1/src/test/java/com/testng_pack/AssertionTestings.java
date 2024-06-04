package com.testng_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTestings extends BaseTest {

	@Test
	public void TestFaceBookusingSoftAssertions() throws Exception
	{
		driver.get("http://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("venugopal@gmail.com", Keys.ENTER);
		System.out.println("Page Title is : " + driver.getTitle());
		System.out.println("Page URL is : " + driver.getCurrentUrl());
		System.out.println("Value is : " + driver.findElement(By.cssSelector("div[class='fsl fwb fcb']")).getText());
		
		SoftAssert  soft = new SoftAssert();  
		
		// Title Assertion
		String expected="Facebook";
		String actual = driver.getTitle();
		soft.assertTrue(actual.equals(expected), "Title Mismatch");
		
		//URL Assertion
		String expectedUrl="http://www.facebook.com/";
		String actualUrl = driver.getCurrentUrl();
		soft.assertEquals(actualUrl, expectedUrl, "URL Mismatch");
		
		// Text Assertion :- entered mail id is exist or not
		String actualText = driver.findElement(By.cssSelector("div[class='fsl fwb fcb']")).getText();
		String expectedText = "venugopal@gmail.com";
		soft.assertEquals(actualText, expectedText, "Text is Mismatch");

		soft.assertAll();
	}
	
	@Test
	public void TestFaceBookusingHardAssertions() throws Exception
	{
		driver.get("http://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("venugopal@gmail.com", Keys.ENTER);
		System.out.println("Page Title is : " + driver.getTitle());
		System.out.println("Page URL is : " + driver.getCurrentUrl());
		System.out.println("Value is : " + driver.findElement(By.cssSelector("div[class='fsl fwb fcb']")).getText());
		  
		
		// Title Assertion
		String expected="Facebook";
		String actual = driver.getTitle();
		Assert.assertTrue(actual.equals(expected), "Title Mismatch");

		//URL Assertion
		String expectedUrl="http://www.facebook.com/";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "URL Mismatch");

		// Text Assertion :- entered mail id is exist or not
		String actualText = driver.findElement(By.cssSelector("div[class='fsl fwb fcb']")).getText();
		String expectedText = "venugopal@gmail.com";
		System.out.println("Actual Text : " + actualText);
		Assert.assertEquals(actualText, expectedText, "Text is Mismatch");

	}
}
