package com.saucedemo.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	public static WebDriver driver;
	   
	@BeforeMethod
	public void setup()
	{
		String browser = "Chrome";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Please provide valid Browser");
		}
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
		@AfterMethod
		public void end () throws InterruptedException
		{
			Thread.sleep(2000);
			driver.quit();
		}
}
