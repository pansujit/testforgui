/**
 * 
 */
package com.platform.locators.resources.dictionary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class is dedicated for the delete dictionary, when we need to delete the dictionary we explicitely
 * give the dictionaryID, it is mandatory
 * @author pandey
 *
 */
public class LocatorsInDictionaryDeleteDictionay {
	
	// Delete a dictiinary
	// This element is located in the left panel inside the dictionary.
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[5]")
	public WebElement selectDeleteADictionary;
	
	// Inside the Delete A dictionary
	// this element is required for deleting a dictionaryand we have explicitely defined the Dictionary Id.
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_post_resources_dictionary_delete']/div/div[2]/input")
	public WebElement inputDeleteADictionayDictionaryID;
	
	// try button to check whether the request is succeed or not.
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_delete']/div/form/div[5]/input")
	public WebElement clickDeleteADictionayTryButton;
	
	// this is the respose code to check whether is success or not
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_delete']/div/div[3]/div[4]/pre")
	public WebElement getDeleteADictionayResponseCode;
	
	
	
	
	
	

}
