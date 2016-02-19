/**
 * 
 */
package com.platform.locators.resources.corpus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class contains all the elemnets inside the add corpus segments targets
 * @author pandey
 *
 */
public class LocatorsInCorpusAddCorpusSegmentTargets {

	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/

	//Add corpus segment targets
	// in left panel inside the corpus
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]/div[14]")
	public WebElement selectAddCorpusSegmentTargets;

	//inside the Add corpus segment targets
	//body
	//This is text area with json format it contains corpusId and segId and necessary other text field
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_segment_target_add']/div[1]/div[2]/textarea")
	public WebElement inputAddCorpusSegmentTargetsBody;

	//try
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_segment_target_add']/div/form/div[6]/input")
	public WebElement clickAddCorpusSegmentTargetsTryButton;

	//response Body
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_segment_target_add']/div/div[3]/div[3]/pre/code")
	public WebElement getAddCorpusSegmentTargetsResponseBody;

	//response Body
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_segment_target_add']/div/div[3]/div[4]/pre")
	public WebElement getAddCorpusSegmentTargetsResponseCode;





}
