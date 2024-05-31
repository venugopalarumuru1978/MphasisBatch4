package coms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestEx1 {

	public static void main(String[] args) {
		/*
		//for firfox 
		System.setProperty("webdriver.gecko.driver", "C:\\Mphasis\\MphasisBatch4\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");

		//for Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Mphasis\\MphasisBatch4\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		
		*/
		// for Edge
		System.setProperty("webdriver.edge.driver", "C:\\Mphasis\\MphasisBatch4\\edgedriver_win64\\msedgedriver.exe");		
		
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.google.com/");
		
		//driver.get("C:\\WeekEndBatchPhase4\\LoginPageUsingBootStrap.html");
	}

}
