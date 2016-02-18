/**
 * 
 */
package com.platform.locators.resources.corpus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * 
 * This contains all the WEb elements inside the Update corpus properties
 * @author pandey
 *
 */
public class LocatorsInCorpusUpdateCorpusProperties {
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	
	//Update corpus properties
	// This can be found in left panel inside the corpus
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]/div[6]")
	public WebElement selectUpdateCorpusProperties;
	
	//Inside the update corpus properties
	//CorpusId
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_update']/div[1]/div[2]/input")
	public WebElement inputUpdateCorpusPropertiesCorpusId;
	
	//name optional
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_update']/div[2]/div[2]/input")
	public WebElement inputUpdateCorpusPropertiesName;
	
	//tag optional 
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_update']/div[3]/div[2]/input")
	public WebElement inputUpdateCorpusPropertiesTag;
	
	//try Button
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_update']/div/form/div[6]/input")
	public WebElement clickUpdateCorpusPropertiesTryButton;
	
	//response body
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_update']/div/div[3]/div[3]/pre/code")
	public WebElement getUpdateCorpusPropertiesResponseBody;
	
	//response Code
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_update']/div/div[3]/div[4]/pre")
	public WebElement getUpdateCorpusPropertiesResponseCode;
	
	
	
	
	
	
	
	
	
	

}
