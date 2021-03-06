/**
 * 
 */
package com.platform.NLP.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.platform.gui.test.baseclass.CommonLocators;
import com.platform.gui.test.baseclass.LocatorsInReferenceDropDown;
import com.platform.locators.nlp.lid.LocatorsInNLPNerAPI;
import com.platform.locators.nlp.lid.LocatorsInRESTNLPApi;

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
		
		
		CommonLocators commonlocator=PageFactory.initElements(driver, CommonLocators.class);
		commonlocator.apiKey.sendKeys("2965f61d-a0cb-46b9-9667-21ee1d284b24");
		
		
		
		LocatorsInRESTNLPApi locatorinrestnlpapi=PageFactory.initElements(driver, LocatorsInRESTNLPApi.class);
		locatorinrestnlpapi.clickNER.click();
		LocatorsInNLPNerAPI locatorinnlpnerapi=PageFactory.initElements(driver, LocatorsInNLPNerAPI.class);
		locatorinnlpnerapi.tryButton.click();
		Thread.sleep(3000);
	return(driver.findElement(By.cssSelector("#Ner_get_nlp_ner_supportedLanguages > div > div.response > div.block.response_code > pre")).getText());
		
		
	}
	
	

}
