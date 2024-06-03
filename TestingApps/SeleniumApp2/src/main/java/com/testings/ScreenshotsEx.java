package com.testings;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenshotsEx {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		try {
			Thread.sleep(3000);
			WebElement  element = driver.findElement(By.name("q"));
			element.sendKeys("Seven Wonders of the World");
			element.submit();
			Thread.sleep(3000);
			
			//method-1
			File sourceFile =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File destFile = new File("./ScreenShots/TestShot1.jpg");
			FileUtils.copyFile(sourceFile, destFile);
			System.out.println("Screenshot taken successfully");

			//method-2
			Thread.sleep(3000);
			driver.get("http://www.facebook.com/");
			driver.findElement(By.name("email")).sendKeys("venu@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.name("pass")).sendKeys("v@123");
			Thread.sleep(3000);
			driver.findElement(By.name("login")).submit();
			
			Thread.sleep(3000);
			
			byte[]  bytearr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			File destFile1 = new File("./ScreenShots/TestShot2.jpg");
			FileOutputStream fos = new FileOutputStream(destFile1);
			fos.write(bytearr);
			fos.close();
			System.out.println("Screenshot taken successfully");

			Thread.sleep(3000);
			
			// method 3
			driver.get("file:///C:/Tricon/MyHtmlRepo/Reg.html");
			Thread.sleep(2000);
			
			String base64code =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
			byte[] bytarr =  Base64.getDecoder().decode(base64code);
			File destFile2 = new File("./ScreenShots/TestShot3.jpg");
			FileOutputStream fos1 = new FileOutputStream(destFile2);
			fos1.write(bytarr);
			fos1.close();
			Thread.sleep(2000);
			System.out.println("Screenshot taken successfully");
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
