/**
 * 
 */
package com.platform.locators.resources.corpus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**This class contains all the Web element inside the list corpus
 * @author pandey
 *
 */
public class LocatorsInCorpusImportCorpus {
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
	public WebElement texttranslation;*/
	
	//Import Corpus can be found in the left panel side inside the Corpus
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]/div[3]")
	public WebElement selectImportCorpus;
	
	//name This is the mandatory text field 
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_import']/div[1]/div[2]/input")
	public WebElement inputImportCorpusName;
	
	//Format 
	//The format of input file or text by default application/x-tmx+xml and can be select to text/bitext
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_import']/div[2]/div[2]/div[2]/select/option[2]")
	public WebElement selectImportCorpusFormatBiText;
	
	//input the input text field for the data 
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_import']/div[3]/div[2]/input")
	public WebElement inputImportCorpusInput;
	
	//inputfile the input text field for the data 
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Corpus_post_resources_corpus_import']/div[4]/div[2]/input")
		public WebElement inputImportCorpusInputFile;
	
	//[@id='parm-Corpus_post_resources_corpus_import']//div[@class='parameter-item']//div[@class='param-property']//input[@name='inputFile']
	//try button
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_import']/div/form/div[6]/input")
	public WebElement clickImportCorpusTryButton;
	
	//response Body
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_import']/div/div[3]/div[3]/pre/code")
	public WebElement getImportCorpusResponseBody;
	
	//response Code
	@FindBy(how=How.XPATH, using=".//*[@id='Corpus_post_resources_corpus_import']/div/div[3]/div[4]/pre")
	public WebElement getImportCorpusResponseCode;
	
	
	
	
	
	
	

}
