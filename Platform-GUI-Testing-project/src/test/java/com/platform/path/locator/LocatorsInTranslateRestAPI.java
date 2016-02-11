package com.platform.path.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatorsInTranslateRestAPI {
	
	public WebDriver driver;
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
 	public WebElement texttranslation;*/
	
	public  LocatorsInTranslateRestAPI(WebDriver ldriver) {
		// TODO Auto-generated constructor stub
		this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_text_translate']/div[1]/div[2]/input")
 	public WebElement inputText;
	
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_text_translate']/div[2]/div[2]/input")
 	public WebElement sourceText;
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_text_translate']/div[3]/div[2]/input")
 	public WebElement targetText;
	
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_post_translation_text_translate']/div/form/div[6]/input")
 	public WebElement tryButton;
	
	
	
	
	
	
	
}
