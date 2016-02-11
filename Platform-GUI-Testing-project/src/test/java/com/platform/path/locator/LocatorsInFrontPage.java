package com.platform.path.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class  LocatorsInFrontPage {
	
	public  WebDriver driver;
	public   LocatorsInFrontPage(WebDriver ldriver){
		this.driver=ldriver;
	}
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
 	public WebElement texttranslation;*/
	@FindBy(how=How.XPATH, using=".//*[@id='signinLink']")
 	public WebElement signIn;
	
	@FindBy(how=How.XPATH, using=".//*[@id='freeBtnTrialLink']")
 	public WebElement signUpForFree;
	
	@FindBy(how=How.XPATH, using=".//*[@id='homeContainer']/div[2]/div[2]/div[2]/a")
 	public WebElement contactUs;
	
	
	@FindBy(how=How.XPATH, using=".//*[@id='freetrialLink']")
 	public WebElement signup;

	
	
	

}
