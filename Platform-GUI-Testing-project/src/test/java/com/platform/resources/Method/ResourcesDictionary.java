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
import com.platform.gui.test.baseclass.CommonLocators;
import com.platform.gui.test.baseclass.LocatorsInReferenceDropDown;
import com.platform.locators.nlp.lid.LocatorsInRESTNLPApi;
import com.platform.locators.resources.dictionary.LocatorsInDictionaryAddAnEntry;
import com.platform.locators.resources.dictionary.LocatorsInDictionaryAddDictionary;
import com.platform.locators.resources.dictionary.LocatorsInDictionaryDeleteAnEntry;
import com.platform.locators.resources.dictionary.LocatorsInDictionaryDeleteDictionay;
import com.platform.locators.resources.dictionary.LocatorsInDictionaryExportADictionary;
import com.platform.locators.resources.dictionary.LocatorsInDictionaryListDictionaries;
import com.platform.locators.resources.dictionary.LocatorsInDictionaryListEntries;
import com.platform.locators.resources.dictionary.LocatorsInDictionaryLookUp;
import com.platform.locators.resources.dictionary.LocatorsInDictionaryLookUpSupportedLanguage;
import com.platform.locators.resources.dictionary.LocatorsInDictionarySupportedLanguages;
import com.platform.locators.resources.dictionary.LocatorsInDictionaryUpdateADictionary;
import com.platform.locators.resources.dictionary.LocatorsInDictionaryUpdateAnEntry;
import com.platform.locators.resources.dictionary.LocatorsInResourcesAPI;

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

	/**
	 * This method will create a dictionary and add a entry in it.
	 * @return
	 * @throws InterruptedException
	 * @throws ParseException
	 */
	public Boolean dictionaryAddAnEntry() throws InterruptedException, ParseException{
		commonInDictionay();	
		LocatorsInDictionaryAddDictionary adddictionary=PageFactory.initElements(driver, LocatorsInDictionaryAddDictionary.class);
		adddictionary.selectAddDictionary.click();
		adddictionary.inputAddDictionaryinput.sendKeys(ResourcesAssertPage.getCreatedictionary());
		adddictionary.clickAddDictionaryTryButton.click();
		Thread.sleep(2000);
		String lookUpText=adddictionary.getAddDictionaryResponseBody.getText().toString();
		LocatorsInDictionaryAddAnEntry addanentry=PageFactory.initElements(driver, LocatorsInDictionaryAddAnEntry.class);
		addanentry.selectAddAnEntry.click();
		addanentry.inputAddAnEntryDictionaryId.sendKeys(JsonParser.dictionaryJsontToTextConverter(lookUpText));
		addanentry.inputAddAnEntryInput.sendKeys(ResourcesAssertPage.getAddanentryinput());
		addanentry.clickAddAnEntryTryButton.click();
		Thread.sleep(2000);
		lookUpText=addanentry.getAddAnEntryResponseBody.getText().toString();
		String lookUpInt=addanentry.getAddAnEntryResponseCode.getText();
		return (lookUpText.contains(ResourcesAssertPage.getAssertaddanentry()) && lookUpInt.contains(ResourcesAssertPage.getDictionaryresponsecode()));



	}
	/**
	 * This method will delete an entry from the dictionary, for the test adding: dictionary , element and deletion is in one place
	 * @return
	 * @throws InterruptedException
	 * @throws ParseException
	 */
	public Boolean dictionaryDeleteAnEntry() throws InterruptedException, ParseException{
		commonInDictionay();	
		LocatorsInDictionaryAddDictionary adddictionary=PageFactory.initElements(driver, LocatorsInDictionaryAddDictionary.class);
		adddictionary.selectAddDictionary.click();
		adddictionary.inputAddDictionaryinput.sendKeys(ResourcesAssertPage.getCreatedictionary());
		adddictionary.clickAddDictionaryTryButton.click();
		Thread.sleep(2000);
		String lookUpText=adddictionary.getAddDictionaryResponseBody.getText().toString();
		LocatorsInDictionaryAddAnEntry addanentry=PageFactory.initElements(driver, LocatorsInDictionaryAddAnEntry.class);
		addanentry.selectAddAnEntry.click();
		String dictionaryId=JsonParser.dictionaryJsontToTextConverter(lookUpText);
		addanentry.inputAddAnEntryDictionaryId.sendKeys(dictionaryId);
		addanentry.inputAddAnEntryInput.sendKeys(ResourcesAssertPage.getAddanentryinput());
		addanentry.clickAddAnEntryTryButton.click();
		Thread.sleep(2000);
		lookUpText=addanentry.getAddAnEntryResponseBody.getText().toString();
		String[] sourceId=JsonParser.jsonTotext(lookUpText, "sourceId",null);		
		LocatorsInDictionaryDeleteAnEntry deleteAnEntry=PageFactory.initElements(driver, LocatorsInDictionaryDeleteAnEntry.class);
		deleteAnEntry.selectDeleteAnEntry.click();
		deleteAnEntry.inputDeleteAnEntryDictionaryId.sendKeys(dictionaryId);
		System.out.println("hello");
		System.out.println(sourceId[0]);
		String string = String.format("{\"entry\": {\"sourceId\": \"%s\"}}", sourceId[0]);
		deleteAnEntry.inputdeleteAnEntryInput.sendKeys(string);
		deleteAnEntry.clickDeleteAnEntryTryButton.click();
		Thread.sleep(2000);
		lookUpText=deleteAnEntry.getDeleteAnEntryResponseBody.getText().toString();
		String lookUpItem=deleteAnEntry.getDeleteAnEntryResponseCode.getText();
		return (lookUpText.contains(ResourcesAssertPage.getDeleteanentryassert()) && lookUpItem.contains(ResourcesAssertPage.getDictionaryresponsecode()));

	}

	/**
	 * This will update an entry in a dictionary
	 * @return
	 * @throws InterruptedException
	 * @throws ParseException
	 */
	public Boolean dictionaryUpdateAnEntry() throws InterruptedException, ParseException{
		commonInDictionay();	
		LocatorsInDictionaryAddDictionary adddictionary=PageFactory.initElements(driver, LocatorsInDictionaryAddDictionary.class);
		adddictionary.selectAddDictionary.click();
		adddictionary.inputAddDictionaryinput.sendKeys(ResourcesAssertPage.getCreatedictionary());
		adddictionary.clickAddDictionaryTryButton.click();
		Thread.sleep(2000);
		String lookUpText=adddictionary.getAddDictionaryResponseBody.getText().toString();
		LocatorsInDictionaryAddAnEntry addanentry=PageFactory.initElements(driver, LocatorsInDictionaryAddAnEntry.class);
		addanentry.selectAddAnEntry.click();
		String dictionaryId=JsonParser.dictionaryJsontToTextConverter(lookUpText);
		addanentry.inputAddAnEntryDictionaryId.sendKeys(dictionaryId);
		addanentry.inputAddAnEntryInput.sendKeys(ResourcesAssertPage.getAddanentryinput());
		addanentry.clickAddAnEntryTryButton.click();
		Thread.sleep(2000);
		lookUpText=addanentry.getAddAnEntryResponseBody.getText().toString();
		String[] sourceId=JsonParser.jsonTotext(lookUpText, "sourceId","targetId");		
		LocatorsInDictionaryUpdateAnEntry updateAnEntry=PageFactory.initElements(driver, LocatorsInDictionaryUpdateAnEntry.class);
		System.out.println("hello");
		System.out.println(sourceId[0]);
		System.out.println(sourceId[1]);
		updateAnEntry.selectUpdateAnEntry.click();
		updateAnEntry.inputUpdateAnEntryDictionaryId.sendKeys(dictionaryId);
		updateAnEntry.inputUpdateAnEntryInput.sendKeys(String.format(ResourcesAssertPage.getUpdateanentry(),sourceId[0],sourceId[1]));
		updateAnEntry.clickUpdateAnEntryTryButton.click();
		Thread.sleep(2000);
		lookUpText=updateAnEntry.getUpdateAnEntryResponseBody.getText().toString();
		String lookUpInt=updateAnEntry.getUpdateAnEntryResponseCode.getText();
		return (lookUpText.contains(ResourcesAssertPage.getConfidenceassert()) && lookUpInt.contains(ResourcesAssertPage.getDictionaryresponsecode()));



	}

	/**
	 * This method will create dictionary, add item and then export
	 * @return
	 * @throws InterruptedException
	 * @throws ParseException
	 */
	public Boolean dictionaryExportADictionary() throws InterruptedException, ParseException{
		commonInDictionay();	
		LocatorsInDictionaryAddDictionary adddictionary=PageFactory.initElements(driver, LocatorsInDictionaryAddDictionary.class);
		adddictionary.selectAddDictionary.click();
		adddictionary.inputAddDictionaryinput.sendKeys(ResourcesAssertPage.getCreatedictionary());
		adddictionary.clickAddDictionaryTryButton.click();
		Thread.sleep(2000);
		String lookUpText=adddictionary.getAddDictionaryResponseBody.getText().toString();
		LocatorsInDictionaryAddAnEntry addanentry=PageFactory.initElements(driver, LocatorsInDictionaryAddAnEntry.class);
		addanentry.selectAddAnEntry.click();
		String dictionaryId=JsonParser.dictionaryJsontToTextConverter(lookUpText);
		addanentry.inputAddAnEntryDictionaryId.sendKeys(dictionaryId);
		addanentry.inputAddAnEntryInput.sendKeys(ResourcesAssertPage.getAddanentryinput());
		addanentry.clickAddAnEntryTryButton.click();
		Thread.sleep(2000);
		LocatorsInDictionaryExportADictionary exportadictionary=PageFactory.initElements(driver, LocatorsInDictionaryExportADictionary.class);
		exportadictionary.selectExportADictionary.click();
		exportadictionary.inputExportADictionaryDictionaryId.sendKeys(dictionaryId);
		exportadictionary.clickExportADictionaryTryButton.click();
		lookUpText=exportadictionary.getExportADictionaryResponseBody.getText().toString();
		String lookUpInt=exportadictionary.getExportADictionaryResponseCode.getText();
		return (lookUpText.contains("ENCODING") && lookUpInt.contains(ResourcesAssertPage.getDictionaryresponsecode()));

	}
	/**
	 * This method will add dictionary, add a item and list it.
	 * @return
	 * @throws InterruptedException
	 * @throws ParseException
	 */
	public Boolean dictionaryListEntries() throws InterruptedException, ParseException{
		commonInDictionay();	
		LocatorsInDictionaryAddDictionary adddictionary=PageFactory.initElements(driver, LocatorsInDictionaryAddDictionary.class);
		adddictionary.selectAddDictionary.click();
		adddictionary.inputAddDictionaryinput.sendKeys(ResourcesAssertPage.getCreatedictionary());
		adddictionary.clickAddDictionaryTryButton.click();
		Thread.sleep(2000);
		String lookUpText=adddictionary.getAddDictionaryResponseBody.getText().toString();
		String dictionaryId=JsonParser.dictionaryJsontToTextConverter(lookUpText);
		LocatorsInDictionaryAddAnEntry addanentry=PageFactory.initElements(driver, LocatorsInDictionaryAddAnEntry.class);
		addanentry.selectAddAnEntry.click();
		addanentry.inputAddAnEntryDictionaryId.sendKeys(dictionaryId);
		addanentry.inputAddAnEntryInput.sendKeys(ResourcesAssertPage.getAddanentryinput());
		addanentry.clickAddAnEntryTryButton.click();
		Thread.sleep(2000);
		LocatorsInDictionaryListEntries listentries=PageFactory.initElements(driver, LocatorsInDictionaryListEntries.class);
		listentries.selectListEntries.click();
		listentries.inputListEntriesDictionaryId.sendKeys(dictionaryId);
		listentries.clickListEntriesTryButton.click();
		Thread.sleep(2000);
		lookUpText=listentries.getListEntriesResponseBody.getText().toString();
		String lookUpInt=listentries.getListEntriesResponseCode.getText();
		return (lookUpText.contains("entries") && lookUpInt.contains(ResourcesAssertPage.getDictionaryresponsecode()));
		
		



	}





}
