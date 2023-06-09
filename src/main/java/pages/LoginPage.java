package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase
{

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// WebElements repository

	@FindBy (name ="username")
	
	WebElement usernameTxtBox;
	
	@FindBy (name ="password")
	WebElement passwordTxtBox;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy (xpath ="(//img[@class='img-responsive'][1])")
	WebElement logo ;
	
	@FindBy (linkText = "Sign Up")
	WebElement signUpLink;
	
	//Action
	public Homepage login()
	{
	usernameTxtBox.sendKeys(prop.getProperty("username"));
	passwordTxtBox.sendKeys(prop.getProperty("password"));;
	loginBtn.click();
	
	
	return new Homepage();
	
	}
	
	
	
	public boolean logoStatus()
	{
		boolean status = logo.isDisplayed();
		
		return status;
	}
	
	public boolean LinkStatus()
	{
		boolean status = signUpLink.isDisplayed();
		
		return status;
	}
	
}
