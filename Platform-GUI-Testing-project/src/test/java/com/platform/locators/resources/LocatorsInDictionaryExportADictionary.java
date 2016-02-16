/**
 * 
 */
package com.platform.locators.resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class contains all the web Elements present in Upadte a Dictionary
 * @author pandey
 *
 */
public class LocatorsInDictionaryExportADictionary {
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	//Export A Dcitionary
	// This Element can be found in the left panel inside the dictionary
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[6]")
	public WebElement selectExportADictionary;
	
	// Inside the Export A Dictionary
	// dictionaryId
	/*
	 * This is the required id of the dictionary that going to be exported. The dictionary must contains at least 
	 * one entry to eligible for export 
	 */
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Dictionary_post_resources_dictionary_export']/div/div[2]/input")
	public WebElement inputExportADictionaryDictionaryId;
	
	//try
	// to submit the response
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_export']/div/form/div[5]/input")
	public WebElement clickExportADictionaryTryButton;
	
	//response Body
	// This contains the full message for the response
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_export']/div/div[3]/div[3]/pre/code")
	public WebElement getExportADictionaryResponseBody;
	
	//response code
	// this contains the code of execution status eg 200 for ok and 400 for Nok.
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_post_resources_dictionary_export']/div/div[3]/div[4]/pre")
	public WebElement getExportADictionaryResponseCode;
	
	
	
	
	
	

}
