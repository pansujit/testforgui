/**
 * 
 */
package com.platform.path.locator;

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
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]") public WebElement clickdictionary;
	@FindBy(how=How.XPATH, using=".//*[@id='Dictionary_get_resources_dictionary_supportedLanguages']/div/form/div[5]/input") public WebElement tryButton;


	
	
	
}
