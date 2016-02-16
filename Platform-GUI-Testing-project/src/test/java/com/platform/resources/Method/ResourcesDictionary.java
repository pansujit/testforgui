/**
 * 
 */
package com.platform.resources.Method;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.platform.asserting.attribute.JsonParser;
import com.platform.asserting.attribute.ResourcesAssertPage;
import com.platform.locators.resources.LocatorsInDictionaryAddDictionary;
import com.platform.locators.resources.LocatorsInDictionaryDeleteDictionay;
import com.platform.locators.resources.LocatorsInDictionaryListDictionaries;
import com.platform.locators.resources.LocatorsInDictionaryLookUp;
import com.platform.locators.resources.LocatorsInDictionaryLookUpSupportedLanguage;
import com.platform.locators.resources.LocatorsInDictionarySupportedLanguages;
import com.platform.locators.resources.LocatorsInDictionaryUpdateADictionary;
import com.platform.path.locator.CommonLocators;
import com.platform.path.locator.LocatorsInRESTNLPApi;
import com.platform.path.locator.LocatorsInReferenceDropDown;
import com.platform.path.locator.LocatorsInResourcesAPI;

/**
 * All resources for the dictionary item are defined here.
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
	
	public Boolean dictionaryAddDictionary() throws InterruptedException, ParseException{
		commonInDictionay();	
		LocatorsInDictionaryAddDictionary adddictionary=PageFactory.initElements(driver, LocatorsInDictionaryAddDictionary.class);
		adddictionary.selectAddDictionary.click();
		adddictionary.inputAddDictionaryinput.sendKeys(ResourcesAssertPage.getCreatedictionary());
		adddictionary.clickAddDictionaryTryButton.click();
		Thread.sleep(2000);
		String lookUpText=adddictionary.getAddDictionaryResponseBody.getText().toString();
		String LookUpInt=adddictionary.getAddDictionaryResponseCode.getText();
		
		return (lookUpText.contains(JsonParser.dictionaryJsontToTextConverter(lookUpText)) && LookUpInt.contains(ResourcesAssertPage.getDictionaryresponsecode()));
		
	}
	
	public String dictionaryDeleteADictionary() throws InterruptedException, ParseException{
		commonInDictionay();	
		LocatorsInDictionaryAddDictionary adddictionary=PageFactory.initElements(driver, LocatorsInDictionaryAddDictionary.class);
		adddictionary.selectAddDictionary.click();
		adddictionary.inputAddDictionaryinput.sendKeys(ResourcesAssertPage.getCreatedictionary());
		adddictionary.clickAddDictionaryTryButton.click();
		Thread.sleep(2000);
		String lookUpText=adddictionary.getAddDictionaryResponseBody.getText().toString();
		LocatorsInDictionaryDeleteDictionay deleteADictionary=PageFactory.initElements(driver, LocatorsInDictionaryDeleteDictionay.class);
		deleteADictionary.selectDeleteADictionary.click();
		deleteADictionary.inputDeleteADictionayDictionaryID.sendKeys((JsonParser.dictionaryJsontToTextConverter(lookUpText)));
		deleteADictionary.clickDeleteADictionayTryButton.click();
		Thread.sleep(2000);
		return deleteADictionary.getDeleteADictionayResponseCode.getText();
			
	}
	public Boolean dictionaryUpdateADictionary() throws InterruptedException, ParseException{
		commonInDictionay();	
		LocatorsInDictionaryAddDictionary adddictionary=PageFactory.initElements(driver, LocatorsInDictionaryAddDictionary.class);
		adddictionary.selectAddDictionary.click();
		adddictionary.inputAddDictionaryinput.sendKeys(ResourcesAssertPage.getCreatedictionary());
		adddictionary.clickAddDictionaryTryButton.click();
		Thread.sleep(2000);
		String lookUpText=adddictionary.getAddDictionaryResponseBody.getText().toString();
		LocatorsInDictionaryUpdateADictionary updateADictionary=PageFactory.initElements(driver, LocatorsInDictionaryUpdateADictionary.class);
		updateADictionary.selectUpdateADcitionary.click();
		updateADictionary.inputUpdateADcitionaryDictionaryId.sendKeys((JsonParser.dictionaryJsontToTextConverter(lookUpText)));
		updateADictionary.inputUpdateADcitionaryinput.sendKeys(ResourcesAssertPage.getUpdatedictionary());
		updateADictionary.clickUpdateADcitionaryTryButton.click();
		Thread.sleep(2000);
		lookUpText=updateADictionary.getUpdateADcitionaryResponseBody.getText().toString();
		String LookUpInt=updateADictionary.getUpdateADcitionaryResponseCode.getText();
		return (lookUpText.contains(ResourcesAssertPage.getUpdatedictionaryresponsebody())&& LookUpInt.contains(ResourcesAssertPage.getDictionaryresponsecode()));
		
					
	}
	
	
	/**
	 * This method will return the boolean value. This method get the all list of dictionaries available
	 * in the platform user account. The assertion is based on the response code and response body that contains 
	 *  "dictionaries"
	 * @return
	 * @throws InterruptedException
	 */
	public Boolean dictionaryListDictionaries() throws InterruptedException{
		commonInDictionay();
		 LocatorsInDictionaryListDictionaries listdictionaries=PageFactory.initElements(driver, LocatorsInDictionaryListDictionaries.class);
		 listdictionaries.selectDictionaryListDictionaries.click();
		 listdictionaries.clickDictionaryListDictionariesTryButton.click();
		 Thread.sleep(2000);
		 String lookUpText=listdictionaries.getDictionaryListDictionariesResponseBody.getText().toString();
		 String lookUpInt=listdictionaries.getDictionaryListDictionariesResponseCode.getText();
		 return (lookUpText.contains(ResourcesAssertPage.getListdictionariesassert()) && lookUpInt.contains(ResourcesAssertPage.getDictionaryresponsecode()));
		 
		 
	}
	/**
	 * This method is used for sort  dictionaries in ascending order by name
	 * @return
	 * @throws InterruptedException
	 */
	public Boolean dictionaryListDictionariesAscendingOrder() throws InterruptedException{
		commonInDictionay();
		 LocatorsInDictionaryListDictionaries listdictionaries=PageFactory.initElements(driver, LocatorsInDictionaryListDictionaries.class);
		 listdictionaries.selectDictionaryListDictionaries.click();
		 listdictionaries.inputDictionaryListDictionariesFilters.sendKeys(ResourcesAssertPage.getSortdictinascendingorder());
		 listdictionaries.clickDictionaryListDictionariesTryButton.click();
		 Thread.sleep(2000);
		 String lookUpText=listdictionaries.getDictionaryListDictionariesResponseBody.getText().toString();
		 String lookUpInt=listdictionaries.getDictionaryListDictionariesResponseCode.getText();
		 return (lookUpText.contains(ResourcesAssertPage.getListdictionariesassert()) && lookUpInt.contains(ResourcesAssertPage.getDictionaryresponsecode()));
		 
		 
	}
	/**
	 * This method is used for sort dictionaries in descending order by name
	 * @return
	 * @throws InterruptedException
	 */
	public Boolean dictionaryListDictionariesDescendingOrder() throws InterruptedException{
		commonInDictionay();
		 LocatorsInDictionaryListDictionaries listdictionaries=PageFactory.initElements(driver, LocatorsInDictionaryListDictionaries.class);
		 listdictionaries.selectDictionaryListDictionaries.click();
		 listdictionaries.inputDictionaryListDictionariesFilters.sendKeys(ResourcesAssertPage.getSortdictindescendingorder());
		 listdictionaries.clickDictionaryListDictionariesTryButton.click();
		 Thread.sleep(2000);
		 String lookUpText=listdictionaries.getDictionaryListDictionariesResponseBody.getText().toString();
		 String lookUpInt=listdictionaries.getDictionaryListDictionariesResponseCode.getText();
		 return (lookUpText.contains(ResourcesAssertPage.getListdictionariesassert()) && lookUpInt.contains(ResourcesAssertPage.getDictionaryresponsecode()));
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
}
