/**
 * 
 */
package com.platform.locators.resources.corpus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class contains all the elements inside the Export Corpus
 * @author pandey
 *
 */
public class LocatorsInCorpusExportCorpus {

	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	//Export Corpus
	// It is in the left panel inside the corpus
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]/div[7]")
	public WebElement selectExportCorpus;

	//inside the export corpus

	//corpusId
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_get_resources_corpus_export']/div[1]/div[2]/input")
	public WebElement inputExportCorpusCorpusId;

	//forrmat by default is tmx+xml and to choose the text/bitext we use this element
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_get_resources_corpus_export']/div[2]/div[2]/div[2]/select/option[2]")
	public WebElement selectExportCorpusFormatTextBytext;

	//try Button
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_get_resources_corpus_export']/div/form/div[6]/input")
	public WebElement clickExportCorpusTryButton;
	
	//Response Body
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_get_resources_corpus_export']/div/div[3]/div[3]/pre/code")
	public WebElement getExportCorpusResponseBody;
	
	//Response Body
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_get_resources_corpus_export']/div/div[3]/div[4]/pre")
	public WebElement getExportCorpusResponseCode;
	

}
