package com.dataproviders.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestProviderWithExcel extends BaseTestExcel {

	@Test(dataProvider = "GetUserDetailsFromExcel")
	public void LoginCheck(String uname, String pwd) throws Exception
	{
		System.out.println(uname + "\t" + pwd);
		
		driver.get("file:///C:/Tricon/MyHtmlRepo/LoginBoot.html");
		try
		{
			WebElement eleUser = driver.findElement(By.name("txtUser"));
			eleUser.sendKeys(uname);
			Thread.sleep(3000);

			WebElement elePass = driver.findElement(By.name("txtPass"));
			elePass.sendKeys(pwd);
			Thread.sleep(3000);
			
			WebElement btnSubmit = driver.findElement(By.cssSelector("input[type='submit']"));
			btnSubmit.submit();
			Thread.sleep(3000);
			
			SoftAssert soft = new SoftAssert();
			soft.assertTrue(driver.findElement(By.id("resAdmin")).isDisplayed());
			soft.assertAll();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}		
	}
}
