package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class LoginPageTest extends TestBase
{

	LoginPage loginPage;
    @BeforeMethod
    public void initialization()
    {
    	init();
    	loginPage = new LoginPage();
    }
	@Test
	
	public void validateLoginTest()
	{
		loginPage.login();
		
	}
	
	@Test
	public void validateLogoTest()
	{
		boolean actualstatus = loginPage.logoStatus();
		Assert.assertEquals(actualstatus,true);
		
	}
	@Test
	public void validateLinksText()
	{
		boolean actualstatus =  loginPage.LinkStatus();
		
		Assert.assertTrue(actualstatus);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
