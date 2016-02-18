/**
 * 
 */
package com.platform.locators.resources.dictionary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class contains all the elements of the update an entry inside the dictionary
 * @author pandey
 *
 */
public class LocatorsInDictionaryUpdateAnEntry {
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	//update an Entry
	// This element is  can be found left panel inside the dictionary 
	
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[11]")
	public WebElement selectUpdateAnEntry;
	
	//inside the Update An Entry
	// DictionaryId
	// This is id of dictionary which data is going to be updated
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_post_resources_dictionary_entry_update']/div[1]/div[2]/input")
	public WebElement inputUpdateAnEntryDictionaryId;
	
	//Input
	// This is text area where update values has to be inserted in json format
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_post_resources_dictionary_entry_update']/div[2]/div[2]/textarea")
	public WebElement inputUpdateAnEntryInput;
	
	//Try Button
	// To submit the Query
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_entry_update']/div/form/div[6]/input")
	public WebElement clickUpdateAnEntryTryButton;

	// Response Body
	// The data result of the query
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_entry_update']/div/div[3]/div[3]/pre/code")
	public WebElement getUpdateAnEntryResponseBody;
	
	// Response Code
	// The opeartion code for query
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_entry_update']/div/div[3]/div[4]/pre")
	public WebElement getUpdateAnEntryResponseCode;
	
	
	

}
