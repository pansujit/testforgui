/**
 * 
 */
package com.platform.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.platform.path.locator.LocatorsInNLPNerAPI;
import com.platform.path.locator.LocatorsInRESTNLPApi;
import com.platform.path.locator.LocatorsInReferenceDropDown;

/**
 * @author pandey
 *
 */
public class RESTNLPNerTranslation  {
	
	public WebDriver driver;
	
	public RESTNLPNerTranslation(WebDriver ldriver){
		
		this.driver=ldriver;
		
	}
	
	public String nerSupportedLanguage() throws InterruptedException{
		
		
		LocatorsInReferenceDropDown locatorreferencedropdown=PageFactory.initElements(driver, LocatorsInReferenceDropDown.class);
		locatorreferencedropdown.referenceDropDownItems("reference").click();
		locatorreferencedropdown.clickNLP.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("documentationContent")));
		
		
		
		LocatorsInRESTNLPApi locatorinrestnlpapi=PageFactory.initElements(driver, LocatorsInRESTNLPApi.class);
		locatorinrestnlpapi.apiKey.sendKeys("2965f61d-a0cb-46b9-9667-21ee1d284b24");
		locatorinrestnlpapi.clickNER.click();
		Thread.sleep(5000);
		
		
		LocatorsInNLPNerAPI locatorinnlpnerapi=PageFactory.initElements(driver, LocatorsInNLPNerAPI.class);
		locatorinnlpnerapi.tryButton.click();
		
		Thread.sleep(3000);
	return(driver.findElement(By.cssSelector("#Ner_get_nlp_ner_supportedLanguages > div > div.response > div.block.response_code > pre")).getText());
		
		
	}
	
	

}
