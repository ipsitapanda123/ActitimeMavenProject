package com.actitime.generics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;


//We've stored common lines of code that are going to remain SAME for EVERY TESTCASES . 
//eg:- openeing of the browser,maximixing the browser,PageLoad TimeOut,closing the browser etc .

public class BaseTest implements AutoConstant
{
	public static WebDriver driver;
	
	@BeforeSuite
	public void executionStart()
	{
		Reporter.log("execution started" , true);
	}
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get(url);
	}
	
//	@Parameters("browser")
//	@BeforeClass
//	public void setUp(String browser)
//	{
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//		driver.get("https://demo.actitime.com");
//		}
//		
//		else if(browser.equalsIgnoreCase("edge"))
//		{
//			driver=new EdgeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//			driver.get("https://demo.actitime.com");
//		}
//	}			//Cross Browser Testing
	
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	@AfterSuite
	public void executionComplete()
	{
		Reporter.log("execution completed" , true);
	}
}