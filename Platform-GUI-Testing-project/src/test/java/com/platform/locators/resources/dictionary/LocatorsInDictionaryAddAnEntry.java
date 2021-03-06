/**
 * 
 */
package com.platform.locators.resources.dictionary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * In this class, all the locators resides in the add an entry can be found.
 * @author pandey
 *
 */
public class LocatorsInDictionaryAddAnEntry {
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	// Add an entry
	// This element can be found in left side panel after clicking the dictionary
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[9]")
	public WebElement selectAddAnEntry;
	
	//Inside the add an entry
	
	//dictionaryId
	// This is the required input field for add an entry which contains the id of an dictionary
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_post_resources_dictionary_entry_add']/div[1]/div[2]/input")
	public WebElement inputAddAnEntryDictionaryId;
	
	//input
	// This is also required in add an entry. The input should be in the json format.
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_post_resources_dictionary_entry_add']/div[2]/div[2]/textarea")
	public WebElement inputAddAnEntryInput;
	
	//try
	// This is button for click to see the response
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_entry_add']/div/form/div[6]/input")
	public WebElement clickAddAnEntryTryButton;
	
	//Response Body
	// This body contains the response data when the we post
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_entry_add']/div/div[3]/div[3]/pre/code")
	public WebElement getAddAnEntryResponseBody;
	
	//Response Code
	// This code contains the information of opration eg 200 ok, 500 server error
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_entry_add']/div/div[3]/div[4]/pre")
	public WebElement getAddAnEntryResponseCode;
	
	
	

}
