/**
 * 
 */
package com.platform.locators.resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Here we can find the elements for look up dictiinary supported language
 * @author pandey
 *
 */
public class LocatorsInDictionaryLookUpSupportedLanguage {
	
	// Lookup supported language
	// This is we can find in the left panel inside the dictionary.
	
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[3]")
	public WebElement selectDictionaryLookupSupportedLanguage;
	
	// This is source text input for look up supported Language and it is optional
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_get_resources_dictionary_lookup_supportedLanguages']/div[1]/div[2]/input")
	public WebElement inputDictionaryLookupLangSource;
	
	//This is the target text input for look up target for source target pair.
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_get_resources_dictionary_lookup_supportedLanguages']/div[2]/div[2]/input")
	public WebElement inputDictionaryLookupLangTarget;
	
	// The try button will display the all available resources as language pair either for selected pair or source or all depending upon
	// choice 
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_get_resources_dictionary_lookup_supportedLanguages']/div/form/div[6]/input")
	public WebElement clickDictionaryLookupLangTryButton;
	
	// The response Body contains the available pair for of the language translation
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_get_resources_dictionary_lookup_supportedLanguages']/div/div[3]/div[3]/pre/code")
	public WebElement getDictionaryLookupLangresponseBody;
	
	// the response code contains the available code of the response (e.g. 200 ok and 400 nok)
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_get_resources_dictionary_lookup_supportedLanguages']/div/div[3]/div[4]/pre")
	public WebElement getDictionaryLookupLangresponseCode;
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
