package com.wordpress.testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



import com.wordpress.pages.LoginPage;

import Utility.BrowserFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class VerifyValidLogin {
	//Properties prop = new Properties();
	
	
	@Test		
	public void validuser() {
		File file = new File("C:\\Users\\gururaj.ravindra\\eclipse-workspace\\6D\\config.properties\\testdata.properties");
		  
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		WebDriver driver= BrowserFactory.StartBrowser(prop.getProperty("browserName"),prop.getProperty("url"));
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		login_page.Validlogin(prop.getProperty("username"),prop.getProperty("password"));
	}

	
}


