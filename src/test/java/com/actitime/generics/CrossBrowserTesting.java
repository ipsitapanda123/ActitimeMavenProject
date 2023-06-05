package com.actitime.generics;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class CrossBrowserTesting 
{
	public WebDriver driver;
	
@Parameters("browser")
@BeforeClass
public void setUp(String browser)
{
	if(browser.equalsIgnoreCase("chrome"))
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	driver.get("https://demo.actitime.com");
	}
	
	else if(browser.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.get("https://demo.actitime.com");
	}
}
}

//-----------------HTML CODE------------ 

//<suite name="Suite">
//<test name="TestChrome">
//	<parameter name="browser" value="chrome"></parameter>
//<classes>
//  <class name="TestCases.TC1_ActitimeLoginLogout"/>
//</classes>
//</test> 
//<test name="TestEdge">
//	<parameter name="browser" value="edge"></parameter>
//<classes>
//  <class name="TestCases.TC1_ActitimeLoginLogout"/>
//</classes>
//</test>
//</suite> <!-- Suite -->

