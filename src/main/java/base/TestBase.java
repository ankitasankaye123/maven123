package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	
	public static WebDriver driver;
	
	public static Properties prop;
	
	public static  void init()
	{
		try
		{
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\home\\eclipse-workspace\\maven123\\config.properties");
		prop.load(file);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("config file is missing");
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("Firfox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Please enter valid browser name");
		}
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
