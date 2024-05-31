package coms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestEx4 {
// how to use css selector locator
	// it is used to specify tag attributes
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Mphasis\\MphasisBatch4\\edgedriver_win64\\msedgedriver.exe");				
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		
		try
		{
			Thread.sleep(2000);
			WebElement userEle = driver.findElement(By.cssSelector("input[type='text']"));
			userEle.sendKeys("abc@gmail.com");
			Thread.sleep(2000);
			WebElement passEle = driver.findElement(By.cssSelector("input[type='password']"));
			passEle.sendKeys("abc@121");
			Thread.sleep(2000);
			WebElement btnEle = driver.findElement(By.cssSelector("button[type='submit']"));
			btnEle.submit();
			Thread.sleep(2000);
			//driver.quit(); // browser will close
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
