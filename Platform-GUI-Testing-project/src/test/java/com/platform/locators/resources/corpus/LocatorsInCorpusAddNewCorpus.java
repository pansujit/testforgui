/**
 * 
 */
package com.platform.locators.resources.corpus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class contains all the elements insdie the add a new empty corpus
 * @author pandey
 *
 */
public class LocatorsInCorpusAddNewCorpus {
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	
	// Add a new empty corpus
	// This element can be found in the left side panel inside the corpus
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]/div[2]")
	public WebElement selectAddANewEmptyCorpus;
	
	//Name
	//This will required name field to add a corpus
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_add']/div[1]/div[2]/input")
	public WebElement inputAddANewEmptyCorpusName;
	
	//Lang
	// This is also required input field to create a new corpus
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_add']/div[2]/div[2]/input")
	public WebElement inputAddANewEmptyCorpusLang;
	
	//tag
	// optional field
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_add']/div[3]/div[2]/input")
	public WebElement inputAddANewEmptyCorpusTag;
	
	//Try
	// This button use for submit the query.
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_add']/div/form/div[6]/input")
	public WebElement clickAddANewEmptyCorpusTryButton;
	
	//response body
	// This is body of the response
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_add']/div/div[3]/div[3]/pre/code")
	public WebElement getAddANewEmptyCorpusResponseBody;
	
	//responce code
	// This is the network operation code eg 200 ok , 400 nok etc
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_add']/div/div[3]/div[4]/pre")
	public WebElement getAddANewEmptyCorpusResponseCode;
	
	
	
	
	
	
	
	

}
