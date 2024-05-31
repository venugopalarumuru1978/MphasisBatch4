package coms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigations {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Mphasis\\MphasisBatch4\\edgedriver_win64\\msedgedriver.exe");				
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		try
		{
			Thread.sleep(3000);
			WebElement element = driver.findElement(By.name("q"));
			element.sendKeys("Seven wonders of the World");
			element.submit();
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			Thread.sleep(3000);
			driver.navigate().to("http://www.facebook.com/");
			Thread.sleep(3000);
			driver.findElement(By.name("email")).sendKeys("venus@gmail.com");
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			driver.quit();
		}
		catch(Exception ex)
		{
			System.out.println("TextBox Not Found");
		}
	}

}
