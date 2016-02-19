/**
 * 
 */
package com.platform.locators.resources.corpus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class contains all the Web elements of the update corpus segment
 * @author pandey
 *
 */
public class LocatorsInCorpusUpdateCorpusSegment {

	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/

	//Update corpus segment
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]/div[13]")
	public WebElement selectUpdateCorpusSegment;

	//corpusId mandatory
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_segment_update']/div[1]/div[2]/input")
	public WebElement inputUpdateCorpusSegmentCorpusId;

	//segId source segment id mandatory
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_segment_update']/div[2]/div[2]/input")
	public WebElement inputUpdateCorpusSegmentsegId;

	//source input text
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_segment_update']/div[3]/div[2]/input")
	public WebElement inputUpdateCorpusSegmentSource;

	//TargetId target segment id optional 
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_segment_update']/div[5]/div[2]/input")
	public WebElement inputUpdateCorpusSegmentTargetId;

	//target mandatory if target id is given
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_segment_update']/div[5]/div[2]/input")
	public WebElement inputUpdateCorpusSegmentTarget;

	// targetLang if specified then targetId is required
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_segment_update']/div[6]/div[2]/input")
	public WebElement inputUpdateCorpusSegmentTargetLang;

	//try button

	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_segment_update']/div/form/div[6]/input")
	public WebElement clickUpdateCorpusSegmentTryButton;

	//response Body
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_segment_update']/div/div[3]/div[3]/pre/code")
	public WebElement getUpdateCorpusSegmentResponseBody;

	//response code
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_segment_update']/div/div[3]/div[4]/pre")
	public WebElement getUpdateCorpusSegmentResponseCode;







}
