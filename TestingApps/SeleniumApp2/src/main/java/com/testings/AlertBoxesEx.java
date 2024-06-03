package com.testings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertBoxesEx {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Tricon/MyHtmlRepo/Second.html");
		
		try {
			Thread.sleep(3000);
			// Alert Box
			WebElement alert = driver.findElement(By.cssSelector("input[value='Alert Box Button']"));
			alert.click();
			System.out.println(driver.switchTo().alert().getText());
			Thread.sleep(3000);
			driver.switchTo().alert().accept(); // Ok button clicked

			// Confirm Box
			Thread.sleep(3000);
			WebElement confirmbox = driver.findElement(By.cssSelector("input[value='Confirm Box Button']"));
			confirmbox.click();
			System.out.println(driver.switchTo().alert().getText());
			Thread.sleep(3000);
			driver.switchTo().alert().accept(); // Ok button clicked
			confirmbox.click();
			Thread.sleep(3000);
			driver.switchTo().alert().dismiss(); // Cancel button clicked
			
			// Prompt Box
			Thread.sleep(3000);
			WebElement promptbox = driver.findElement(By.cssSelector("input[value='Prompt Box Button']"));
			promptbox.click();
			//Thread.sleep(3000);
			driver.switchTo().alert().sendKeys("This is Selenium Session");
			Thread.sleep(3000);
			driver.switchTo().alert().accept(); // Cancel button clicked
			Thread.sleep(3000);
			System.out.println("End of Application");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		finally
		{
			driver.quit();
		}
	}
}
