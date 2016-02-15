/**
 * 
 */
package com.platform.locators.resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * here we can find the Web element for the supported language for resources insode the dictionary.
 * @author pandey
 *
 */
public class LocatorsInDictionarySupportedLanguages {



	// Sictionay supported language 
	// if necessary we can use the following path to select the supported language
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[1]")
	public WebElement selectSupportedlanguages;

	// inside the supported languages
	// This try button when select gives us the available supported languages by the dictionary.
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_get_resources_dictionary_supportedLanguages']/div/form/div[5]/input")
	public WebElement getSupportLangButton;

	//  This is the result that we can get from the supported language (200 is ok)
	@FindBy(how=How.CSS, using="#Dictionary_get_resources_dictionary_supportedLanguages > div > div.response > div.block.response_code > pre")
	public WebElement getsupportedLangResp;

	// this is also used to create the assertion result with above response code
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_get_resources_dictionary_supportedLanguages']/div/div[3]/div[3]/pre/code")
	public WebElement getsupportedLangRespData;




	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/



}
