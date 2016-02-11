package com.platform.path.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatorsInNLPNerAPI {
	
	
public WebDriver driver;
	
	public LocatorsInNLPNerAPI(WebDriver ldriver){
		
		this.driver=ldriver;
		
	}
	
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
 	public WebElement texttranslation;*/
	
	@FindBy(how=How.XPATH, using=".//*[@id='Ner_get_nlp_ner_supportedLanguages']/div/form/div[4]/input")
 	public WebElement tryButton;
	
	@FindBy(how=How.XPATH, using=".//*[@id='Ner_get_nlp_ner_supportedLanguages']/div/div[3]/div[4]/pre")
 	public WebElement resultNerSupportedLanguage;
	
	
	
	
	
	

}
