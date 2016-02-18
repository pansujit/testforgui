/**
 * 
 */
package com.platform.locators.resources.dictionary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class contains all the available Elements inside the list entries
 * @author pandey
 *
 */
public class LocatorsInDictionaryListEntries {
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	
	//List Entries
	// The list entried can be found in the left panel inside the dictionary
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[13]")
	public WebElement selectListEntries;
	
	//DictionaryID
	// This Id is necessary while listing entries. I will shows the all available key values if no filter is selected.
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_post_resources_dictionary_entry_list']/div[1]/div[2]/input")
	public WebElement inputListEntriesDictionaryId;
	
	//Filters
	// This text area is used for filtering the entries. the format of input text should be in JSON format.
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_post_resources_dictionary_entry_list']/div[2]/div[2]/textarea")
	public WebElement inputListEntriesFilters;
	
	//Try 
	// This try button is for submit the request
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_entry_list']/div/form/div[6]/input")
	public WebElement clickListEntriesTryButton;
	
	//Response Body
	// This is the message from the server after as response
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_entry_list']/div/div[3]/div[3]/pre/code")
	public WebElement getListEntriesResponseBody;
	
		//response Code
	// This is network operation code if succeed 200 otherwise 400 or 500.
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_entry_list']/div/div[3]/div[4]/pre")
	public WebElement getListEntriesResponseCode;
	
	
	
	
	

}
