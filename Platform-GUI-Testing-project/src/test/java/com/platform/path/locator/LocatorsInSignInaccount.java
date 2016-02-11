package com.platform.path.locator;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatorsInSignInaccount {
	
	public  WebDriver driver;
	
	public LocatorsInSignInaccount(WebDriver ldriver){
		this.driver=ldriver;
		
	}
	
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
 	public WebElement texttranslation;*/
	
	
	@FindBy(how=How.XPATH, using=".//*[@id='usrnm']")
 	public WebElement userName;
	
	@FindBy(how=How.XPATH, using=".//*[@id='psswd']")
 	public WebElement password;
	
	@FindBy(how=How.XPATH, using=".//*[@id='conn']")
 	public WebElement stayConnectedCheckButton;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Forgot your password?")
 	public WebElement forgotPassword;
	
	@FindBy(how=How.XPATH, using=".//*[@id='submit_login']")
 	public WebElement signIn;
	
	
	
	 

}
