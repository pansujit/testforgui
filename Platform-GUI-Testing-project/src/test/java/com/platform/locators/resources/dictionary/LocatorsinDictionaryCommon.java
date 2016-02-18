/**
 * 
 */
package com.platform.locators.resources.dictionary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * common locators for dictionary ie clicking on the dictiinary in the left side panel.
 * @author pandey
 *
 */
public class LocatorsinDictionaryCommon {
	
	
	
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]")
	public WebElement selectDcitinary;

}
