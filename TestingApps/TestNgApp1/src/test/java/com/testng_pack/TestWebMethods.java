package com.testng_pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class TestWebMethods extends BaseTest {

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
}
