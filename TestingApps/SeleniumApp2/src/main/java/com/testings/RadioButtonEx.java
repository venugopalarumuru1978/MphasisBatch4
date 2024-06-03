package com.testings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
// radiobutton example
public class RadioButtonEx {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Tricon/MyHtmlRepo/js6.html");
		try {
			Thread.sleep(3000);
			WebElement  rdo1 = driver.findElement(By.cssSelector("input[value='DC']"));
			rdo1.click();
			
			Thread.sleep(3000);
			rdo1 = driver.findElement(By.cssSelector("input[value='CC']"));
			rdo1.click();
			
			Thread.sleep(3000);
			rdo1 = driver.findElement(By.cssSelector("input[value='NB']"));
			rdo1.click();
			
			Thread.sleep(3000);
			
			driver.quit();
		} catch (Exception e) {

		}
	}

}
