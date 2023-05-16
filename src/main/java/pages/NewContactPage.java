package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class NewContactPage extends TestBase
{

	public NewContactPage() 
	{
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(id = "first_name")
	WebElement firstName;
	
	@FindBy(id = "surname")
	WebElement lastName;
	
	@FindBy(name="address")
	WebElement address;
	
	@FindBy(xpath = "//form[@id='contactForm']/descendant::input[@value ='Save']")
	WebElement saveBtn;

	public void createNewContact()
	{
		firstName.sendKeys("Ankita");
		lastName.sendKeys("Sankaye");
		address.sendKeys("Ambajogai");
		saveBtn.click();
		
	}
}
