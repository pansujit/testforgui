/**
 * 
 */
package com.platform.locators.resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * this class contains all the parameters that are located inside the list dictionary
 * @author pandey
 *
 */
public class LocatorsInDictionaryListDictionaries {


	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	//List dictionaries
	// This element is reside in the left side panel of dictionary
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[8]")
	public WebElement selectDictionaryListDictionaries;

	//inside the list dictionaries
	//filters
	// This text field area is used for sorting, matching for filters and it is purely optional. The input should be JSON formatted.
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_post_resources_dictionary_list']/div/div[2]/textarea")
	public WebElement inputDictionaryListDictionariesFilters;

	//Try
	// This try button to get the response
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_list']/div/form/div[6]/input")
	public WebElement clickDictionaryListDictionariesTryButton;


	//response body
	// This contains the body of the response
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_list']/div/div[3]/div[3]/pre/code")
	public WebElement getDictionaryListDictionariesResponseBody;

	//response code
	// This contains the code of the response(400 for nok, 200 for ok etc)
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_list']/div/div[3]/div[4]/pre")
	public WebElement getDictionaryListDictionariesResponseCode;









}
