package com.testng_parameter_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWebMethods extends BaseTestWithParameters {

	@Test
	public void testGoogle()
	{
		driver.get("http://www.google.com/");
		
		try {
			Thread.sleep(3000);
			WebElement  element = driver.findElement(By.name("q"));
			element.sendKeys("Java Tutorials", Keys.ENTER);
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testFb()
	{
		driver.get("http://www.facebook.com/");
		try {
			Thread.sleep(3000);
			WebElement eleUser = driver.findElement(By.name("email"));
			eleUser.sendKeys("pavankumar@gmail.com");
			Thread.sleep(3000);
			WebElement elePass = driver.findElement(By.name("pass"));
			elePass.sendKeys("p@123");
			Thread.sleep(3000);
			WebElement eleLogin = driver.findElement(By.name("login"));
			eleLogin.submit();
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	@Parameters({"username", "pswd"})
	public void LoginTest(String uname, String pswd)
	{
		System.out.println("username : " + uname);
		System.out.println("password : " + pswd);
		
		driver.get("file:///C:/Tricon/MyHtmlRepo/LoginBoot.html");
		try {
			WebElement eleUser = driver.findElement(By.name("txtUser"));
			eleUser.sendKeys(uname);
			Thread.sleep(3000);
			WebElement elePass = driver.findElement(By.name("txtPass"));
			elePass.sendKeys(pswd);
			Thread.sleep(3000);	
			WebElement eleBtn = driver.findElement(By.cssSelector("input[type='submit']"));
			eleBtn.submit();
			Thread.sleep(4000);
			String expurl = "file:///C:/Tricon/MyHtmlRepo/BootTable.html";
			String acturl = driver.getCurrentUrl();
			Assert.assertEquals(acturl, expurl, "Invalid Username/password");
			System.out.println(acturl);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
