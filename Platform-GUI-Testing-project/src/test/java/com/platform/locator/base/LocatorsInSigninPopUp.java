package com.platform.locator.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatorsInSigninPopUp {
	
	private WebDriver driver;
	
	 public LocatorsInSigninPopUp(WebDriver ldriver) {
		// TODO Auto-generated constructor stub
	
		 this.driver=ldriver;
	}
	
	
	
	
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
 	public WebElement texttranslation;*/
	
	
	@FindBy(how=How.XPATH, using=".//*[@id='signinMenu']/div/div/div[2]/div/a[1]")
 	public WebElement continueWithSystran;
	
	@FindBy(how=How.XPATH, using=".//*[@id='signinMenu']/div/div/div[2]/div/a[2]")
 	public WebElement continueWithGoogle;
	
	

}
