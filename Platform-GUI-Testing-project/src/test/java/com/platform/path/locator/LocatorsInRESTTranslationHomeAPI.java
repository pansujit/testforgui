package com.platform.path.locator;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatorsInRESTTranslationHomeAPI {
	
	
	public  WebDriver driver;

	public LocatorsInRESTTranslationHomeAPI(WebDriver ldriver){
		this.driver=ldriver;
	
	}


/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	
	@FindBy(how=How.XPATH, using="//div[@class='panel-body']//div[@class='area controls']//input[@id='input_apiKey']")
	public WebElement apiKey;
	
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]")
	public WebElement translation;
	
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[2]")
	public WebElement fileTranslation;
	
	
	
	
	
	
	

	
	

}
