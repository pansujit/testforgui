/**
 * 
 */
package com.platform.locators.resources.corpus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class contains all the elements inside the delete corpus segment
 * @author pandey
 *
 */
public class LocatorsInCorpusDeleteCorpusSegments {

	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	//Delete Corpus Segments
	// This element can be found in the left panel side inside of the Corpus
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]/div[12]")
	public WebElement selectDeleteCorpusSegment;

	//in side the Delete Corpus Segments
	//CorpusId Mandatory text field
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_segment_delete']/div[1]/div[2]/input")
	public WebElement inputDeleteCorpusSegmentCorpusId;

	//SegId id of the segment that need to be deleted
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_segment_delete']/div[2]/div[2]/input")
	public WebElement inputDeleteCorpusSegmentSegId;

	//Try Button
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_segment_delete']/div/form/div[6]/input")
	public WebElement clickDeleteCorpusSegmentTryButton;

	//response Body
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_segment_delete']/div/div[3]/div[3]/pre/code")
	public WebElement getDeleteCorpusSegmentResponseBody;

	//response Code
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_segment_delete']/div/div[3]/div[4]/pre")
	public WebElement getDeleteCorpusSegmentResponseCode;




}
