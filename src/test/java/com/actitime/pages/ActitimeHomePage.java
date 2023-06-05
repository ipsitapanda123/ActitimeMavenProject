package com.actitime.pages;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;


public class ActitimeHomePage extends BasePage implements AutoConstant
{


	public WebDriver driver;
	public WebDriverWait wait;

	//Declaration

	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasksButton;

	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoutButton;

	@FindBy(id= "container_users")
	private WebElement userButton;

	@FindBy(xpath = "(//div[@class='menu_icon'])[2]")
	private WebElement settingsButton;


	//Initialistaion

	public ActitimeHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//Utilisation 

	public void tasksMethod() 
	{
		titleContains(driver,"Time-Track" );
		javascriptClick(driver, tasksButton);

		//			wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		//			JavascriptExecutor js=(JavascriptExecutor)driver;
		//wait.until(ExpectedConditions.titleContains("Time-Track"));
		//js.executeScript("arguments[0].click()", tasksButton);
	}

	public void logoutMethod() 
	{
		visibilityofElement(driver, logoutButton);			
		javascriptClick(driver, logoutButton);

		//			wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		//			JavascriptExecutor js=(JavascriptExecutor)driver;
		//			
		//			wait.until(ExpectedConditions.visibilityOf(logoutButton));
		//			js.executeScript("arguments[0].click()", logoutButton);
	}

	public void userMethod() 
	{
		visibilityofElement(driver, userButton);
		javascriptClick(driver, userButton);

		//			wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		//			JavascriptExecutor js=(JavascriptExecutor)driver;
		//			
		//			wait.until(ExpectedConditions.visibilityOf(userButton));
		//			js.executeScript("arguments[0].click()", userButton);
	}

	public void settingsMethod() 
	{
		visibilityofElement(driver, settingsButton);
		javascriptClick(driver, settingsButton);
		
//		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//
//		wait.until(ExpectedConditions.visibilityOf(settingsButton));
//		js.executeScript("arguments[0].click()", settingsButton);
	}
}


