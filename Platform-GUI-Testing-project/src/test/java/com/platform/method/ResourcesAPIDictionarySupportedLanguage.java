/**
 * 
 */
package com.platform.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.platform.path.locator.LocatorsInRESTNLPApi;
import com.platform.path.locator.LocatorsInReferenceDropDown;

/**
 * @author sujit
 *
 */
public class ResourcesAPIDictionarySupportedLanguage {
	
	public WebDriver driver;
	
	public ResourcesAPIDictionarySupportedLanguage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	public void dictionarySupportedLanguage() throws InterruptedException{
		
	
	LocatorsInReferenceDropDown locatorsinReference=PageFactory.initElements(driver,LocatorsInReferenceDropDown.class );
	locatorsinReference.referenceDropDownItems("reference").click();
	locatorsinReference.clickResources.click();
	
	Thread.sleep(2000);
	driver.switchTo().frame(driver.findElement(By.id("documentationContent")));
	
	LocatorsInRESTNLPApi locatorinrestnlpapi=PageFactory.initElements(driver, LocatorsInRESTNLPApi.class);
	locatorinrestnlpapi.apiKey.sendKeys("2965f61d-a0cb-46b9-9667-21ee1d284b24");
	
	
	
	}
}
