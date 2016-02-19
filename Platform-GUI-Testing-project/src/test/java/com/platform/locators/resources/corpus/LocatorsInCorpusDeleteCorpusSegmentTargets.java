/**
 * 
 */
package com.platform.locators.resources.corpus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/** This class contains all the Web Elements inside the delete corpus Segments
 * @author pandey
 *
 */
public class LocatorsInCorpusDeleteCorpusSegmentTargets {

	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/

	// Delete corpus segments
	// This can be found in the left panel inside the corpus
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]/div[12]")
	public WebElement selectDeleteCorpusSegmentsTargets;

	//Inside the Delete corpus Segments
	//corpusId mandatory text field
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_segment_target_delete']/div[1]/div[2]/input")
	public WebElement inputDeleteCorpusSegmentsTargetsCorpusId;

	//segId mandatory can be have more than once
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_segment_target_delete']/div[2]/div[2]/input")
	public WebElement inputDeleteCorpusSegmentsTargetsSegId;


	//TargetId mandatory which one is going to delete
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_segment_target_delete']/div[3]/div[2]/input")
	public WebElement inputDeleteCorpusSegmentsTargetsTargetId;

	//try button
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_segment_target_delete']/div/form/div[6]/input")
	public WebElement clickDeleteCorpusSegmentsTargetsTryButton;

	//response Body
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_segment_target_delete']/div/div[3]/div[3]/pre/code")
	public WebElement getDeleteCorpusSegmentsTargetsResponseBody;

	//response Code
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_segment_target_delete']/div/div[3]/div[4]/pre")
	public WebElement getDeleteCorpusSegmentsTargetsResponseCode;


}
