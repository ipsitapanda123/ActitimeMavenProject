package com.actitime.generics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// We've stored common lines of code to highlight the elements. 

public class Utility 
{
	public void highlightElement(WebDriver driver , WebElement element) throws InterruptedException
	{
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'background:yellow')", element);
		Thread.sleep(3000);
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'background:white')", element);
	}
}