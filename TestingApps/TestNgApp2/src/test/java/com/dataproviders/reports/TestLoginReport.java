package com.dataproviders.reports;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestLoginReport extends BaseReportTest {

	@Test(dataProvider = "UserInfo")
	public void LoginCheck(String username, String Password) throws Exception
	{
		System.out.println(username + "  "  + Password);
		driver.get("file:///C:/Tricon/MyHtmlRepo/LoginBoot.html");
		driver.findElement(By.name("txtUser")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("txtPass")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(4000);
		
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(driver.findElement(By.id("resAdmin")).isDisplayed());
		
		soft.assertAll();
	}
}
