package com.platform.locators.nlp.lid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatorsInNLPNerAPI {
	
	
public WebDriver driver;
	
	public LocatorsInNLPNerAPI(WebDriver ldriver){
		
		this.driver=ldriver;
		
	}
	
	
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
 	public WebElement texttranslation;*/
	
	@FindBy(how=How.XPATH, using=".//*[@id='Ner_get_nlp_ner_supportedLanguages']/div/form/div[4]/input")
 	public WebElement tryButton;
	
	@FindBy(how=How.XPATH, using=".//*[@id='Ner_get_nlp_ner_supportedLanguages']/div/div[3]/div[4]/pre")
 	public WebElement resultNerSupportedLanguage;
	
	
	/*
	 * This is all the webelements for the NER 
	 */
	// NER
	
	/*
	 * This will click on the left side and select the Ner
	 */
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]")
 	public WebElement clickOnNER;
	
	// NER-- Get the Entities
	/*
	 * This will click on the left side bar under the beneath of NER, to select the entities
	 */
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[1]")
 	public WebElement clickonNergetListOfEntities;
	
	/*
	 * This is the input field that use for input the text. Either input or inputFile should be selected.
	 */
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Ner_post_nlp_ner_extract_entities']/div[2]/div[2]/input")
 	public WebElement inputOnNerInput;
	
	/*
	 * This is required input field  to select the language 
	 */
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Ner_post_nlp_ner_extract_entities']/div[3]/div[2]/input")
 	public WebElement inputOnNerLanguage;
	
	/*
	 * This is input field  to select the profile in Ner get entities 
	 */
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Ner_post_nlp_ner_extract_entities']/div[4]/div[2]/input")
 	public WebElement inputOnNerProfile;
	
	/*
	 * This is input field  to select the callback in Ner get entities 
	 */
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Ner_post_nlp_ner_extract_entities']/div[5]/div[2]/input")
 	public WebElement inputOnNerCallback;
	
	/*
	 * This click button will display the result for the get entities
	 */
	
	@FindBy(how=How.XPATH, using=".//*[@id='Ner_post_nlp_ner_extract_entities']/div/form/div[4]/input")
 	public WebElement clickOnNerGetentitiesTryButton;
	
	/*
	 * This WebElement is the result of the entities.
	 */
	@FindBy(how=How.CSS, using="#Ner_post_nlp_ner_extract_entities > div > div.response > div.block.response_body > pre > code")
 	public WebElement getNerGetentitiesResult;
	
	/*
	 * This is the file input field for the ner api.
	 */
	@FindBy(how=How.XPATH, using="//div[@id='parm-Ner_post_nlp_ner_extract_entities']//div[@class='parameter-item']//div[@class='param-property']//input[@name='inputFile']")
 	public WebElement inputNerInputFile;
	
	// NER--Annotation
	// select annotation from left panel
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[2]")
 	public WebElement selectNerAnnotation;
	
	
	/*
	 * Here is the list of WebElements used in the Ner Anootation
	 */
	
	// inputfile
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Ner_post_nlp_ner_extract_annotations']/div[2]/div[2]/input")
 	public WebElement inputNerAnnotationInput;
	
	// input
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Ner_post_nlp_ner_extract_annotations']/div[3]/div[2]/input")
 	public WebElement inputNerAnnotationLanguage;
	
	@FindBy(how=How.XPATH, using=".//*[@id='Ner_post_nlp_ner_extract_annotations']/div/form/div[4]/input")
 	public WebElement clickNerAnnotationTryButton;
	
	@FindBy(how=How.XPATH, using="//div[@id='parm-Ner_post_nlp_ner_extract_annotations']//div[@class='parameter-item']//div[@class='param-property']//input[@name='inputFile']")
 	public WebElement inputNerAnnotationInputFile;
	
	//annotation Result
	
	@FindBy(how=How.CSS, using="#Ner_post_nlp_ner_extract_annotations > div > div.response > div.block.response_body > pre > code")
 	public WebElement getNerAnnotationResult;
	
	
	
	
	
	
	
	

}
