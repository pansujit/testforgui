/**
 * 
 */
package com.platform.locators.resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Here we can get the Web Elements for the Look 
 * @author pandey
 *
 */
public class LocatorsInDictionaryLookUp {
	
	
	// Selecting the lookup from the lefy hand side will be easy to work.
	
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[2]")
	public WebElement dictinaryLookUp;
	
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	
	// The source field in the Look up in the dictionary is mandatory and can be access with the foloowing elements.
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_get_resources_dictionary_lookup']/div[1]/div[2]/input")
	public WebElement inputLookUpSource;
	
	// The Target field is also mandatory.
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_get_resources_dictionary_lookup']/div[2]/div[2]/input")
	public WebElement inputLookUpTarget;
	
	// the input parameters can be given as the array of string
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_get_resources_dictionary_lookup']/div[3]/div[2]/input")
	public WebElement inputLookUpinput;
	
	// the Autocimplete field is used 
	// By deafult is false and to select true,we need to following elements.
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_get_resources_dictionary_lookup']/div[4]/div[2]/div[2]/select/option[2]")
	public WebElement selectLookUpAutocompleteTrue;
	
	
	// To get the result we need to click the try button
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_get_resources_dictionary_lookup']/div/form/div[6]/input")
	public WebElement clickLookUpTryButton;
	
	// The response body conatins various matches to test.
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_get_resources_dictionary_lookup']/div/div[3]/div[3]/pre/code")
	public WebElement getLookUpResponseBody;
	
	//Similarlly this is code is used for good response(200 for ok)
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_get_resources_dictionary_lookup']/div/div[3]/div[4]/pre")
	public WebElement getLookUpResponseCode;
	
	
	
	
	
	
	
	
	
	
	
	
	


}
