/**
 * 
 */
package com.platform.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.platform.path.locator.CommonLocators;
import com.platform.path.locator.LocatorsInRESTNLPApi;
import com.platform.path.locator.LocatorsInReferenceDropDown;
import com.platform.path.locator.LocatorsInResourcesAPI;

/**
 * @author sujit
 *
 */
public class ResourcesAPIDictionarySupportedLanguage {
	
	public WebDriver driver;
	
	public ResourcesAPIDictionarySupportedLanguage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	public String dictionarySupportedLanguage() throws InterruptedException{
		
	
	LocatorsInReferenceDropDown locatorsinReference=PageFactory.initElements(driver,LocatorsInReferenceDropDown.class );
	locatorsinReference.referenceDropDownItems("reference").click();
	locatorsinReference.clickResources.click();
	
	Thread.sleep(2000);
	driver.switchTo().frame(driver.findElement(By.id("documentationContent")));
	
	CommonLocators commonlocator=PageFactory.initElements(driver, CommonLocators.class);
	commonlocator.apiKey.sendKeys("2965f61d-a0cb-46b9-9667-21ee1d284b24");
	
	LocatorsInResourcesAPI locatorsinResourcesapi=PageFactory.initElements(driver, LocatorsInResourcesAPI.class);
	locatorsinResourcesapi.clickdictionary.click();
	locatorsinResourcesapi.tryButton.click();
	Thread.sleep(3000);
	return (driver.findElement(By.cssSelector("#Dictionary_get_resources_dictionary_supportedLanguages > div > div.response > div.block.response_code > pre")).getText());
	
	
	
	
	
	
	
	}
}
