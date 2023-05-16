package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Homepage;
import pages.LoginPage;

public class HomepageTest extends TestBase

{
	Homepage homePage;

	@BeforeMethod
	public void initialization()
	{
		init();
		LoginPage loginPage = new LoginPage();
		homePage = loginPage.login();
		
	}
	@Test
	public void validateUserTest()
	{
		homePage.userCheck();
		
	}
	
	@Test
	public void validateLogoutTest()
	{
		homePage.logout();
	}
	
	@Test
	public void validateHomePageLogoTest()
	{
		homePage.logoCheck();
	}
	@Test
	public void validateRedirectionCreateContact()
	{
		homePage.createContact();
		
	}
	
	@Test
	public void validateRedirectionOfcreateCompanyTest() 
	{
		homePage.createCompany();
	}
	
	
	@Test
	public void validateRedirectionOfcreateDealTest() 
	{
		homePage.createDeal();;
	}
	
	@Test
	
	public void validateRedirectionOfcreateTaskTest()
	{
		homePage.createTask();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
