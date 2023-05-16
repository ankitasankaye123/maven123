package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Homepage;
import pages.LoginPage;
import pages.NewContactPage;

public class NewContactPageTest extends TestBase
{
	Homepage homePage;
	NewContactPage newContactPage;

	@BeforeMethod
	public void initialization() 
	{
		TestBase.init();
		LoginPage loginPage = new LoginPage();
		 homePage = loginPage.login();
		 newContactPage = new NewContactPage();
	}
	
	@Test
	public void validateCreateContact()
	{
		homePage.createContact();
		newContactPage.createNewContact();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		
	}
}
