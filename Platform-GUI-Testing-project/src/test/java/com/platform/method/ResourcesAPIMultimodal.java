/**
 * 
 */
package com.platform.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.platform.path.locator.LocatorsInMultimodalAPI;
import com.platform.path.locator.LocatorsInRESTNLPApi;
import com.platform.path.locator.LocatorsInReferenceDropDown;
import com.platform.path.locator.LocatorsInResourcesAPI;

/**
 * @author sujit
 *
 */
public class ResourcesAPIMultimodal {
	
	public WebDriver driver;
	
	public ResourcesAPIMultimodal(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	public String speechSupportedLanguage() throws InterruptedException{
		
	
	LocatorsInReferenceDropDown locatorsinReference=PageFactory.initElements(driver,LocatorsInReferenceDropDown.class );
	locatorsinReference.referenceDropDownItems("reference").click();
	locatorsinReference.clickMultimodal.click();
	
	Thread.sleep(2000);
	driver.switchTo().frame(driver.findElement(By.id("documentationContent")));
	
	LocatorsInRESTNLPApi locatorinrestnlpapi=PageFactory.initElements(driver, LocatorsInRESTNLPApi.class);
	locatorinrestnlpapi.apiKey.sendKeys("2965f61d-a0cb-46b9-9667-21ee1d284b24");
	
	LocatorsInMultimodalAPI locatorsinmultimodalsapi=PageFactory.initElements(driver, LocatorsInMultimodalAPI.class);
	locatorsinmultimodalsapi.clickspeech.click();
	locatorsinmultimodalsapi.tryButton.click();
	Thread.sleep(3000);
	return (driver.findElement(By.cssSelector("#Speech_get_multimodal_speech_supportedLanguages > div > div.response > div.block.response_code > pre")).getText());
	
	
	
	
	
	
	
	}
}
