package coms;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestEx8 {
// Login Page Testing

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username : ");
		String uname = sc.next();
		System.out.println("Enter Password : ");
		String pwd = sc.next();
		
		System.setProperty("webdriver.edge.driver", "C:\\Mphasis\\MphasisBatch4\\edgedriver_win64\\msedgedriver.exe");				
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("C:/WeekEndBatchPhase4/LoginPageUsingBootStrap.html");
		
		try
		{
			Thread.sleep(2000);
			WebElement eleUser =driver.findElement(By.name("txtUser")); 
			if(eleUser.isEnabled())
			{
				eleUser.sendKeys(uname);
				System.out.println("Given Username : " + eleUser.getAttribute("value"));
			}
			
			Thread.sleep(2000);
			WebElement elePass =driver.findElement(By.name("txtPass"));
			if(elePass.isEnabled())
			{
				elePass.sendKeys(pwd);
				System.out.println("Given Password : " + elePass.getAttribute("value"));
			} 
			
			Thread.sleep(2000);
			driver.findElement(By.className("btn-primary")).submit();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
