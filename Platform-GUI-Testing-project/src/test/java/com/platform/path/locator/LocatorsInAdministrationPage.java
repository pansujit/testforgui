package com.platform.path.locator;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatorsInAdministrationPage {
	
	
	public  WebDriver driver;


	public LocatorsInAdministrationPage(WebDriver ldriver){
		this.driver=ldriver;

	}


/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
public WebElement texttranslation;*/
	
	@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement apiKeys;
	
	@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[2]")
	public WebElement subscription;
	
	@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[3]")
	public WebElement receipts;
	

}
