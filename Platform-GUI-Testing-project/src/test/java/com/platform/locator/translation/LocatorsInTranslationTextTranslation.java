/**
 * 
 */
package com.platform.locator.translation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class contains all the elements inside the translate
 * @author pandey
 *
 */
public class LocatorsInTranslationTextTranslation {
	
	
	public WebDriver driver;
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
 	public WebElement texttranslation;*/
	
	public  LocatorsInTranslationTextTranslation (WebDriver ldriver) {
		// TODO Auto-generated constructor stub
		this.driver=ldriver;
	}
	//input text
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_text_translate']/div[1]/div[2]/input")
 	public WebElement inputText;
	
	//text Translate
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]")
	public WebElement translation;
	
		
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_text_translate']/div[2]/div[2]/input")
 	public WebElement sourceText;
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_text_translate']/div[3]/div[2]/input")
 	public WebElement targetText;
	
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_post_translation_text_translate']/div/form/div[6]/input")
 	public WebElement tryButton;
	
	
	
	// if it is selected then source will join with the output text
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_text_translate']/div[6]/div[2]/div[2]/select/option[2]")
 	public WebElement textWithSourceeTrue;
	
	
	// if it is selected then the translated text will retranslated to original 
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_text_translate']/div[10]/div[2]/div[2]/select/option[2]")
	public WebElement textWithBackTranslationTrue;
	
	// This will give the result when source is set to true
	@FindBy(how=How.XPATH, using="//*[@id='Translation_post_translation_text_translate']/div/div[3]/div[3]/pre/code")
	public WebElement getTextWithSourceTrue;
	
	
	// Result when source and back translation is true in text translation
	
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_post_translation_text_translate']/div/div[3]/div[3]/pre/code")
	public WebElement backTranslationTrue;
	
	
	

}
