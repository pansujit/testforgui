/**
 * 
 */
package com.platform.locators.resources.corpus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class contains all Web Elements in side the detail corpus
 * @author pandey
 *
 */
public class LocatorsInCorpusDetailCorpus {
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	// detail corpus
	// The detail corpus can be found in the left panel side inside corpus
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]/div[5]")
	public WebElement selectDetailCorpus;
	
	//Corpus Id
	// This is required text field for id of corpus that we want to have details
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_get_resources_corpus_details']/div[1]/div[2]/input")
	public WebElement inputDetailCorpusCorpusId;
	
	//Try Button
	// to submit the request
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_get_resources_corpus_details']/div/form/div[6]/input")
	public WebElement clickDetailCorpusTryButton;
	
	//Response Body
	// The response body contains all response from the server
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_get_resources_corpus_details']/div/div[3]/div[3]/pre/code")
	public WebElement getDetailCorpusResponseBody;
	
	//Response Code
	// This is network operation code eg 200 ok and 400 nok etc
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_get_resources_corpus_details']/div/div[3]/div[4]/pre")
	public WebElement getDetailCorpusResponseCode;
	
	
	
	

}
