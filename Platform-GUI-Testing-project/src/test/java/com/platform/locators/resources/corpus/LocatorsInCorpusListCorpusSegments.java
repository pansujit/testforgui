/**
 * 
 */
package com.platform.locators.resources.corpus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This contains all the WebElements inside the List Corpus Segments
 * @author pandey
 *
 */
public class LocatorsInCorpusListCorpusSegments {
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/

	//List Corpus Segments
	// this elements can be found in the left side panle inside the corpus
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]/div[10]")
	public WebElement selectListCorpusSegments;

	//corpusId mandatory text field
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_get_resources_corpus_segment_list']/div[1]/div[2]/input")
	public WebElement inputListCorpusSegmentsCorpusId;

	//skip  skip the first found segments integer text input
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_get_resources_corpus_segment_list']/div[2]/div[2]/input")
	public WebElement inputListCorpusSegmentsSkip;

	//limit limit the no of return segment Interger text field
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_get_resources_corpus_segment_list']/div[3]/div[2]/input")
	public WebElement inputListCorpusSegmentsLimit;

	//Try
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_get_resources_corpus_segment_list']/div/form/div[6]/input")
	public WebElement clickListCorpusSegmentsTryButton;

	//response body
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_get_resources_corpus_segment_list']/div/div[3]/div[3]/pre/code")
	public WebElement getListCorpusSegmentsResponseBody;

	//response Code
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_get_resources_corpus_segment_list']/div/div[3]/div[4]/pre")
	public WebElement getListCorpusSegmentsResponseCode;





}
