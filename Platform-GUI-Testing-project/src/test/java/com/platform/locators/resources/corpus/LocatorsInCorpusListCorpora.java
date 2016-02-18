/**
 * 
 */
package com.platform.locators.resources.corpus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * This class contains all the webElements inside the list corpora.
 * @author pandey
 *
 */
public class LocatorsInCorpusListCorpora {
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/

	//List Corpora found in the left panel inside corpus
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]/div[1]")
	public WebElement selectListCorpora;

	//SourceLang option text input field to filter by the interesting language by user
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_get_resources_corpus_list']/div[1]/div[2]/input")
	public WebElement inputListCorporaSourceLang;

	//TargetLang optional  should give combine with sourceLang
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_get_resources_corpus_list']/div[2]/div[2]/input")
	public WebElement inputListCorporaTargetLang;

	//WithoutPending 
	//default is false if need true then select option 2
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_get_resources_corpus_list']/div[3]/div[2]/div[2]/select/option[2]")
	public WebElement selectListCorporaWithoutPendingTrue;

	//withoutError
	//default id false and can be selected true with selector
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_get_resources_corpus_list']/div[4]/div[2]/div[2]/select/option[2]")
	public WebElement selectListCorporaWithoutErrorTrue;

	//prefix
	//prefix of the corpus name
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_get_resources_corpus_list']/div[5]/div[2]/input")
	public WebElement inputListCorporaPrefix;

	//Directory text input area where we have specify the path of directory
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_get_resources_corpus_list']/div[6]/div[2]/input")
	public WebElement inputListCorporaDirectory;

	//try Button
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_get_resources_corpus_list']/div/form/div[6]/input")
	public WebElement clickListCorporaTryButton;

	//response Body
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_get_resources_corpus_list']/div/div[3]/div[3]/pre/code")
	public WebElement getListCorporaResponseBody;

	//response Body
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_get_resources_corpus_list']/div/div[3]/div[4]/pre")
	public WebElement getListCorporaResponseCode;

















}
