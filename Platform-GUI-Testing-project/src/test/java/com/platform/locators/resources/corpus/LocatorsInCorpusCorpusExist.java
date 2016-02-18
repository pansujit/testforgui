/**
 * 
 */
package com.platform.locators.resources.corpus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class contains all elements inside the Corpus exists
 * @author pandey
 *
 */
public class LocatorsInCorpusCorpusExist {

	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	//Corpus Exist
	// This element is in the left panel side inside the corpus
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]/div[4]")
	public WebElement selectCorpusExist;
	
	//Inside the corpus exist
	//name
	// This is the required text field to check whether the corpus is exist.name of the corpus
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_get_resources_corpus_exists']/div[1]/div[2]/input")
	public WebElement inputCorpusExistName;
	
	//try
	// try button for submit
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_get_resources_corpus_exists']/div/form/div[6]/input")
	public WebElement clickCorpusExistTryButton;
	
	//response body
	// server response
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_get_resources_corpus_exists']/div/div[3]/div[3]/pre/code")
	public WebElement getCorpusExistResponseBody;
	
	//responce code
	//network operation code 200ok
	
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_get_resources_corpus_exists']/div/div[3]/div[4]/pre")
	public WebElement getCorpusExistResponseCode;
	
	
	
}
