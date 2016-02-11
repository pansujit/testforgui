package com.platform.gui.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestClass {
	
	public WebDriver driver;
	
	
	/**
	 * This will open the browser. This will be inheritate to other test class.
	 */
	@BeforeTest
	public void openBrowser(){
		
		driver =new FirefoxDriver();
		
		driver.get("https://platform-stag.systran.net");
		driver.manage().window().setSize(new Dimension(1920,1080));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@AfterTest
	public void closeBrowser(){
		
		driver.quit();
		
		
	}
	
	
	
	

}
