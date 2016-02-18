/**
 * 
 */
package com.platform.resources.Method;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.platform.asserting.attribute.CorpusAssertPage;
import com.platform.asserting.attribute.JsonParserCorpus;
import com.platform.locators.resources.corpus.LocatorsInCorpusAddNewCorpus;
import com.platform.locators.resources.corpus.LocatorsInCorpusCorpusExist;
import com.platform.locators.resources.corpus.LocatorsInCorpusDeleteCorpus;
import com.platform.locators.resources.corpus.LocatorsInCorpusDetailCorpus;
import com.platform.locators.resources.corpus.LocatorsInCorpusUpdateCorpusProperties;
import com.platform.locators.resources.dictionary.LocatorsInResourcesAPI;

/**
 * Here we can find all the method that are used for test during in the corpus
 * @author pandey
 *
 */
public class ResourcesCorpus {


	public WebDriver driver;

	public ResourcesCorpus(WebDriver ldriver){

		this.driver=ldriver;
	}



	/**
	 * This method is common for all the method listed below so we can frequently call to initialise the 
	 * our method in the "corpus"
	 * @throws InterruptedException
	 */
	public void commonInDictionay() throws InterruptedException{

		CommonInResources commoninResources=PageFactory.initElements(driver, CommonInResources.class);
		commoninResources.commonInAll();
		LocatorsInResourcesAPI locatorsinResourcesapi=PageFactory.initElements(driver, LocatorsInResourcesAPI.class);
		locatorsinResourcesapi.selectCorpus.click();
		Thread.sleep(1000);
		}
	
	public String[] addnewEmptyCorpus() throws InterruptedException{
		
		LocatorsInCorpusAddNewCorpus addnewcorpus=PageFactory.initElements(driver, LocatorsInCorpusAddNewCorpus.class);
		addnewcorpus.selectAddANewEmptyCorpus.click();
		addnewcorpus.inputAddANewEmptyCorpusName.sendKeys(CorpusAssertPage.getName());
		addnewcorpus.inputAddANewEmptyCorpusLang.sendKeys(CorpusAssertPage.getSrclanguage());
		addnewcorpus.clickAddANewEmptyCorpusTryButton.click();
		Thread.sleep(1000);
		String[] lookUpText={addnewcorpus.getAddANewEmptyCorpusResponseBody.getText().toString(),addnewcorpus.getAddANewEmptyCorpusResponseCode.getText()};
		return lookUpText;
		
		
	}
	
	
	/**This method will add a new corpus and return the response body and text to the calling method
	 * @return
	 * @throws InterruptedException
	 */
	public String[] corpusAddANewEmptyCorpus() throws InterruptedException{
		commonInDictionay();
		return addnewEmptyCorpus();
		
					
	}
	/**
	 * This willl delete a corpus and send the response code to the called testclass
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException
	 */
	public String corpusDeleteCorpus() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		String[] lookUpText=addnewEmptyCorpus();
		Thread.sleep(1000);
		String corpusId=JsonParserCorpus.getCorpusId(lookUpText[0]);
		LocatorsInCorpusDeleteCorpus deletecorpus=PageFactory.initElements(driver, LocatorsInCorpusDeleteCorpus.class);
		deletecorpus.selectDeleteCorpus.click();
		deletecorpus.inputDeleteCorpusCorpusId.sendKeys(corpusId);
		deletecorpus.clickDeleteCorpusTryButton.click();
		Thread.sleep(2000);
		return deletecorpus.getDeleteCorpusResponseCode.getText();
								
	}
	/** This will add corpus and check whether it is exist or not
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException
	 */
	public Boolean corpusCorpusExists() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		addnewEmptyCorpus();
		LocatorsInCorpusCorpusExist corpusexist=PageFactory.initElements(driver, LocatorsInCorpusCorpusExist.class);
		corpusexist.selectCorpusExist.click();
		corpusexist.inputCorpusExistName.sendKeys((CorpusAssertPage.getName()));
		corpusexist.clickCorpusExistTryButton.click();
		Thread.sleep(1000);
		return ((corpusexist.getCorpusExistResponseBody.getText().toString()).contains(CorpusAssertPage.getAssertcorpusexist())
				&& corpusexist.getCorpusExistResponseCode.getText().contains(CorpusAssertPage.getAssertresponsecode()));
					
	}
	
	/**
	 * This will add corpus and assert details of that corpus
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException
	 */
	public Boolean corpusDetailCorpus() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		String[] lookUpText=addnewEmptyCorpus();
		String corpusId=JsonParserCorpus.getCorpusId(lookUpText[0]);
		LocatorsInCorpusDetailCorpus detailcorpus=PageFactory.initElements(driver, LocatorsInCorpusDetailCorpus.class);
		detailcorpus.selectDetailCorpus.click();
		detailcorpus.inputDetailCorpusCorpusId.sendKeys(corpusId);
		detailcorpus.clickDetailCorpusTryButton.click();
		Thread.sleep(1000);
		String lookUp=detailcorpus.getDetailCorpusResponseBody.getText().toString();
		String lookUpInt=detailcorpus.getDetailCorpusResponseCode.getText();
		return((lookUp.contains(CorpusAssertPage.getAssertdetailcorpus())) &&
		(lookUp.contains(CorpusAssertPage.getAssertstatus())) &&
		(lookUpInt.contains(CorpusAssertPage.getAssertresponsecode())));
		
	}
	
	public Boolean corpusUpdateCorpusProperties() throws InterruptedException, IOException, ParseException{
		commonInDictionay();
		String[] lookUpText=addnewEmptyCorpus();
		String corpusId=JsonParserCorpus.getCorpusId(lookUpText[0]);
		LocatorsInCorpusUpdateCorpusProperties properties=PageFactory.initElements(driver, LocatorsInCorpusUpdateCorpusProperties.class);
		properties.selectUpdateCorpusProperties.click();
		properties.inputUpdateCorpusPropertiesCorpusId.sendKeys(corpusId);
		properties.inputUpdateCorpusPropertiesName.sendKeys((CorpusAssertPage.getName()));
		properties.clickUpdateCorpusPropertiesTryButton.click();
		Thread.sleep(1000);
		String lookUp=properties.getUpdateCorpusPropertiesResponseBody.getText().toString();
		String lookUpInt=properties.getUpdateCorpusPropertiesResponseCode.getText();
		return ((lookUp.contains(CorpusAssertPage.getAssertupdatecorpus())) &&
		(lookUpInt.contains(CorpusAssertPage.getAssertresponsecode())));
		
	
		
	}
	
	

		
	
	
	
	
	
	
	
	

}
