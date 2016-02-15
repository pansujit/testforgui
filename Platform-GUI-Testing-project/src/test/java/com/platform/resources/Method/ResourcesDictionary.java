/**
 * 
 */
package com.platform.resources.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.platform.asserting.attribute.ResourcesAssertPage;
import com.platform.locators.resources.LocatorsInDictionaryLookUp;
import com.platform.locators.resources.LocatorsInDictionaryLookUpSupportedLanguage;
import com.platform.locators.resources.LocatorsInDictionarySupportedLanguages;
import com.platform.path.locator.CommonLocators;
import com.platform.path.locator.LocatorsInRESTNLPApi;
import com.platform.path.locator.LocatorsInReferenceDropDown;
import com.platform.path.locator.LocatorsInResourcesAPI;

/**
 * @author sujit
 *
 */
public class ResourcesDictionary {

	public WebDriver driver;

	public ResourcesDictionary(WebDriver ldriver){

		this.driver=ldriver;
	}



	public void commonInDictionay() throws InterruptedException{

		CommonInResources commoninResources=PageFactory.initElements(driver, CommonInResources.class);
		commoninResources.commonInAll();
		LocatorsInResourcesAPI locatorsinResourcesapi=PageFactory.initElements(driver, LocatorsInResourcesAPI.class);
		locatorsinResourcesapi.clickdictionary.click();
		locatorsinResourcesapi.tryButton.click();

	}

	public Boolean dictionarySupportedLanguage() throws InterruptedException{

		commonInDictionay();	
		LocatorsInDictionarySupportedLanguages supportedLanguage=PageFactory.initElements(driver, LocatorsInDictionarySupportedLanguages.class);
		supportedLanguage.getSupportLangButton.click();
		Thread.sleep(2000);
		return ((supportedLanguage.getsupportedLangResp.getText().contains(ResourcesAssertPage.getDictionaryresponsecode()))
				&& (supportedLanguage.getsupportedLangRespData.getText().toString().contains(ResourcesAssertPage.getDictionarysupplanguage()))) ;


	}
	public Boolean dictionaryLookUp() throws InterruptedException{
		
		commonInDictionay();	
		LocatorsInDictionaryLookUp lookup=PageFactory.initElements(driver, LocatorsInDictionaryLookUp.class);
		lookup.dictinaryLookUp.click();
		lookup.inputLookUpSource.sendKeys(ResourcesAssertPage.getLookupsource());
		lookup.inputLookUpTarget.sendKeys(ResourcesAssertPage.getLookuptarget());
		lookup.inputLookUpinput.sendKeys(ResourcesAssertPage.getDictionarylookupinput());
		lookup.clickLookUpTryButton.click();
		Thread.sleep(2000);
		String lookUpText=lookup.getLookUpResponseBody.getText().toString();
		return (lookup.getLookUpResponseCode.getText().contains("200") && lookUpText.contains(ResourcesAssertPage.getLookuprespose1()) && lookUpText.contains(ResourcesAssertPage.getLookuprespose2())
		&& lookUpText.contains(ResourcesAssertPage.getLookuprespose3()) && lookUpText.contains(ResourcesAssertPage.getLookuprespose4()));
		}
	
	
	public Boolean dictionaryLookUpSupportedLanguages() throws InterruptedException{
		commonInDictionay();	
		LocatorsInDictionaryLookUpSupportedLanguage lookup=PageFactory.initElements(driver, LocatorsInDictionaryLookUpSupportedLanguage.class);
		lookup.selectDictionaryLookupSupportedLanguage.click();
		lookup.clickDictionaryLookupLangTryButton.click();
		Thread.sleep(2000);
		String lookUpText=lookup.getDictionaryLookupLangresponseBody.getText().toString();
		String LookUpInt=lookup.getDictionaryLookupLangresponseCode.getText();
		return (lookUpText.contains(ResourcesAssertPage.getLookupresponse()) && LookUpInt.contains(ResourcesAssertPage.getDictionaryresponsecode()));
		
	}
	
	
	
	
}
