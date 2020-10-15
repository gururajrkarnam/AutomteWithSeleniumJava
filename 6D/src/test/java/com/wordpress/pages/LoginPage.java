package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;




public class LoginPage {
	 
	WebDriver driver;
			
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
				
	}
			
	// storing xpath
	
	@FindBy(id="username") WebElement username;
			
	@FindBy(how=How.ID,using="password") WebElement password;
			
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Login')]") WebElement Submit_button;
			
	
	//Method for Login
	public void Validlogin(String uid,String pass)
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		Submit_button.click();
		String actualURL="";
		String expectedURL=driver.getCurrentUrl();
		
		if(actualURL.equals(expectedURL)) 
		{
			System.out.println("Login failed");
		}
		else
		{
			System.out.println("Login is success");
		}
	}
}
		
				
	


