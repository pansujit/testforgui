/**
 * 
 */
package com.platform.locators.resources.dictionary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class conatins all the locators require to update A dictionary
 * @author pandey
 *
 */
public class LocatorsInDictionaryUpdateADictionary {
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	
	//Update a dictionary
	// this locate is can be found on the left side panel.
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[7]")
	public WebElement selectUpdateADcitionary;
	
	// Inside Upadte a Dcitionary
	// The following elements are found inside the update a dictionary
	
	//dictionaryID
	// This is required text input field to update a dictionary.
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_post_resources_dictionary_update']/div[1]/div[2]/input")
	public WebElement inputUpdateADcitionaryDictionaryId;
	
	//input
	//This is text input field for update a dictionary. the format of text input must be JSON.
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_post_resources_dictionary_update']/div[2]/div[2]/textarea")
	public WebElement inputUpdateADcitionaryinput;
	
	//Try 
	// This Try button is to check whether the operation is success or not.
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_update']/div/form/div[6]/input")
	public WebElement clickUpdateADcitionaryTryButton;
	
	// response Body
	// This response body contains the message for the operation
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_update']/div/div[3]/div[3]/pre/code")
	public WebElement getUpdateADcitionaryResponseBody;
	
	//response code
	// This code signifies whether the operation is successful or not(eg 500 server error, 200 success etc..).
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_update']/div/div[3]/div[4]/pre")
	public WebElement getUpdateADcitionaryResponseCode;
	
	
	
	

}
