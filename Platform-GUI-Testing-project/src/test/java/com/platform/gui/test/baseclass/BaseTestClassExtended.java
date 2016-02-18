package com.platform.gui.test.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.platform.locator.base.LocatorsInFrontPage;
import com.platform.locator.base.LocatorsInSignInaccount;
import com.platform.locator.base.LocatorsInSigninPopUp;

public class BaseTestClassExtended {

	public WebDriver driver;


	/**
	 * This will open the browser. This will be inheritate to other test class.
	 */
	@BeforeTest
	public void openBrowser(){
		//initializing the firefox driver
		driver =new FirefoxDriver();
		// accessing the webpage
		driver.get("https://platform-stag.systran.net");
		//setting the windows size in 1920*1080
		driver.manage().window().setSize(new Dimension(1920,1080));

		// the imperative wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//accessing the from page of the webpage and clicking in the sign in button
		LocatorsInFrontPage locatorinfront=PageFactory.initElements(driver, LocatorsInFrontPage.class);
		locatorinfront.signIn.click();
		// accessing the pop up sign in and choosing the log in with systran	
		LocatorsInSigninPopUp signinpopup=PageFactory.initElements(driver, LocatorsInSigninPopUp.class);
		signinpopup.continueWithSystran.click();

		// locating the username and password filling form
		LocatorsInSignInaccount locatorinSignIn=PageFactory.initElements(driver, LocatorsInSignInaccount.class);
		locatorinSignIn.userName.sendKeys("sujit.pandey@systrangroup.com");
		locatorinSignIn.password.sendKeys("SESpassword");
		locatorinSignIn.signIn.click();


	}

	@AfterTest
	public void closeBrowser(){

		driver.quit();


	}




}
