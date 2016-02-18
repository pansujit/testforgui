/**
 * 
 */
package com.platform.locators.resources.dictionary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author sujit
 *
 */
public class LocatorsInResourcesAPI {
	
	public WebDriver driver;
	
	public  LocatorsInResourcesAPI(WebDriver ldriver){
		this.driver=ldriver;
	}
	// This will select the dictionary from left panel
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]") 
	public WebElement clickdictionary;
	
	// Corpus
	// This will select the corpus from left panel side
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]") 
	public WebElement selectCorpus;
	
	
	
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_get_resources_dictionary_supportedLanguages']/div/form/div[5]/input") public WebElement tryButton;


	
	
	
}
