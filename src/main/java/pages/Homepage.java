package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Homepage extends TestBase

{
	public Homepage()
	{
		PageFactory.initElements(driver, this);
		
	}

	//WebElements repository
	
	@FindBy (xpath="/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
	WebElement user;
	
	
	@FindBy (xpath="/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]")
	WebElement logoutBtn;
	

	@FindBy (xpath="//td[text()='CRMPRO']")
	WebElement logo;
	
	@FindBy (xpath="//a[text()='Contacts']")
	WebElement contacts;
	
	@FindBy (xpath="//a[text()='New Contact']")
	WebElement newContact;
	
	@FindBy (xpath="//a[text()='Companies']")
	WebElement company;
	
	@FindBy (xpath="//a[text()='New Company']")
	WebElement newCompany;
	
	@FindBy (xpath="//a[text()='Deals']")
	WebElement deal;
	
	@FindBy (xpath="//a[text()='New Deal']")
	WebElement newDeal;
	
	
	@FindBy (xpath="//a[text()='Tasks']")
	WebElement task;
	
	@FindBy (xpath = "//a[text()='New Task']")
	WebElement newTask;
	
	
	//Action
	public String userCheck()
	{
		driver.switchTo().frame("mainpanel");
		String userName = user.getText();
		return userName;
		
	}
	
	
	public void logout()
	{
		driver.switchTo().frame("mainpanel");
		logoutBtn.click();
	}
	 
	public boolean logoCheck()
	{
		driver.switchTo().frame("mainpanel");
		boolean status = logo.isDisplayed();
		return status;
	}
	
	public void createContact()
	{
		driver.switchTo().frame("mainpanel");
		Actions act = new Actions (driver);
		act.moveToElement(contacts).build().perform();
		newContact.click();
	}
	
	public void createCompany() 
	{
		driver.switchTo().frame("mainpanel");
		Actions act = new Actions (driver);
		act.moveToElement(company).build().perform();
		newCompany.click();
		
	}
	
	public void createDeal()
	{
		driver.switchTo().frame("mainpanel");
		Actions act = new Actions (driver);
		act.moveToElement(deal).build().perform();
		newDeal.click();
	}
	
	public void createTask()
	{
		driver.switchTo().frame("mainpanel");
		Actions act = new Actions (driver);
		act.moveToElement(task).build().perform();
		newTask.click();
	}
	
}
