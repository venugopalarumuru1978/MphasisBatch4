package com.testings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
//dropdown with multiple options selection
public class DropdownListEx2 {

	public static void main(String[] args) {
	
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Tricon/MyHtmlRepo/js7.html");
		
		try {
			Thread.sleep(3000);
			WebElement elements = driver.findElement(By.name("ddCourse"));
			
			Select optionCourses = new Select(elements);
			
			List<WebElement>  elemnts = optionCourses.getOptions();
			
			for(WebElement e : elemnts)
			{
				System.out.println(e.getText());
			}
			
			optionCourses.selectByIndex(1);
			Thread.sleep(3000);

			optionCourses.selectByValue("Oracle");
			Thread.sleep(3000);
		
			optionCourses.selectByVisibleText("SQL Server");
			Thread.sleep(3000);
			
			List<WebElement>  selectedOptions = optionCourses.getAllSelectedOptions();
			
			System.out.println("Selected Options : ");
			for(WebElement e1 : selectedOptions)
			{
				System.out.println(e1.getText());
			}

			optionCourses.deselectByIndex(1);
			Thread.sleep(3000);
			optionCourses.deselectByValue("SQL Server");
			Thread.sleep(3000);
			System.out.println("End of the App");
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
