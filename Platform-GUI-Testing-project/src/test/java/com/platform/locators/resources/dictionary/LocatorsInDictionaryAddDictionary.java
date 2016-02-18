/**
 * 
 */
package com.platform.locators.resources.dictionary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * 
 * This class contains all the required web Elements for adding dictionary in the resources.
 * The adding dictiinary is in the pattern of json.This allows us to add new user defined dictionary
 * in the systran system. 
 * @author pandey
 *
 */
public class LocatorsInDictionaryAddDictionary {
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	//Add dictionary
	// This is web elements in the left side panel of the system. when select we directly goto add dictionary.
	
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[4]")
	public WebElement selectAddDictionary;
	
	// These Elements are found inside the Add Dictionary 
	
	// The input Element is used to create a new dictionary in the system; the input should be in JSON format.
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_post_resources_dictionary_add']/div/div[2]/textarea")
	public WebElement inputAddDictionaryinput;
	
	//By clicking the try button we can see if the dictionary is created or not
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_add']/div/form/div[6]/input")
	public WebElement clickAddDictionaryTryButton;
	
	
	// In the result section we have the two part response body and response code.
	// The response body contains all the data need for information.
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_add']/div/div[3]/div[3]/pre/code")
	public WebElement getAddDictionaryResponseBody;
	
	// The response body contains code of the response(e.g 200 ok and 400 nok etc.).
		@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_add']/div/div[3]/div[4]/pre")
		public WebElement getAddDictionaryResponseCode;
	
	
	
	
	
	
	
	

}
