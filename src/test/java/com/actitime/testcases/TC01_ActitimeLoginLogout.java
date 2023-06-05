package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pages.ActitimeHomePage;
import com.actitime.pages.ActitimeLoginPage;


public class TC01_ActitimeLoginLogout extends BaseTest
{
	
	@Test
	public void loginlogout() throws IOException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
		loginPage.titlevalidate();
		
		ActitimeHomePage homePage=new ActitimeHomePage(driver);
		homePage.logoutMethod();
	}
}

