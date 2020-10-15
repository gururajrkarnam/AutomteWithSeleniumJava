package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver StartBrowser(String browserName,String url) {
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")) 
		{
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		//driver.quit();
		
		return driver;
		
		
		
		
	}

}
