/**
 * 
 */
package com.platform.locators.resources.corpus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * 
 * This class contains all the elements inside the Delete a corpus
 * @author pandey
 *
 */
public class LocatorsInCorpusDeleteCorpus {
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	// Delete Corpus
	// This can be found on the left panel inside the corpus
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]/div[8]")
	public WebElement selectDeleteCorpus;
	
	//Inside a Delete Corpus
	//corpusId
	// This is required text field for the deleting the corpus
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_delete']/div[1]/div[2]/input")
	public WebElement inputDeleteCorpusCorpusId;
	
	//try
	//This submit button
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_delete']/div/form/div[6]/input")
	public WebElement clickDeleteCorpusTryButton;
	
	//Response Body
	// this contains the message of response
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_delete']/div/div[3]/div[3]/pre/code")
	public WebElement getDeleteCorpusResponseBody;
	
	
	// response code
	// this contains the network response code
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_delete']/div/div[3]/div[4]/pre")
	public WebElement getDeleteCorpusResponseCode;
	
	
	
	
	
	
	

}
