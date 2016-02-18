/**
 * 
 */
package com.platform.locators.multimodal.speech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author sujit
 *
 */
public class LocatorsInMultimodalAPI {
	
	public WebDriver driver;
	
	public  LocatorsInMultimodalAPI(WebDriver ldriver){
		this.driver=ldriver;
	}
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]") public WebElement clickspeech;
	@FindBy(how=How.XPATH, using=".//*[@id='Speech_get_multimodal_speech_supportedLanguages']/div/form/div[4]/input") public WebElement tryButton;


	
	
	
}
