/**
 * 
 */
package com.platform.locators.resources.corpus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class conatins all the web elements of the add corpus segments
 * @author pandey
 *
 */
public class LocatorsInCorpusAddCorpusSegments {
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	
	//add corpus segments
	// This can be found in the left side of panel inside the corpus
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]/div[11]")
	public WebElement selectAddCorpusSegments;
	
	//body
	// This is required text area where a JSON formatted input is given to add a segments.
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_segment_add']/div[1]/div[2]/textarea")
	public WebElement inputAddCorpusSegmentsbody;
	
	//try to submit request
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_segment_add']/div/form/div[6]/input")
	public WebElement clickAddCorpusSegmentsTryButton;
	
	//response body
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_segment_add']/div/div[3]/div[3]/pre/code")
	public WebElement clickAddCorpusSegmentsResponseBody;
	
	//response Code
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_segment_add']/div/div[3]/div[4]/pre")
	public WebElement clickAddCorpusSegmentsResponseCode;
	
	
	
	

}
