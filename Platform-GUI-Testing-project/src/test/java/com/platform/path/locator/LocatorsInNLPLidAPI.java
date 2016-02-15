package com.platform.path.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatorsInNLPLidAPI {
	
	
	/*
	 * This has the web elemnt all related to Rest NLP LID api 
	 * 
	 */
	
	// LID 
	// This left side page to select Lid 
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]")
 	public WebElement selectNLPLid;
	
	
	// This will select the DOcument language detection inside Lid
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]/div[1]")
 	public WebElement selectLidDocLanguage;
	
	// This will select the paragraph langauge detection inside the Lid
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[3]/div[2]")
 	public WebElement selectLidParaLanguage;
	
	
	/*
	 * This will find the all elements inside the Document Language detection
	 */
	// This will text field to enter the texts for document language detection.
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Lid_post_nlp_lid_detectLanguage_document']/div[2]/div[2]/input")
 	public WebElement inputLidDocTextInput;
	
	
	// This is the Try button to test.
	@FindBy(how=How.XPATH, using=".//*[@id='Lid_post_nlp_lid_detectLanguage_document']/div/form/div[4]/input")
	public WebElement clickLidDocTryButton;
	
	// This is the result tab getting from the Document language detection
	
	@FindBy(how=How.XPATH, using=".//*[@id='Lid_post_nlp_lid_detectLanguage_document']/div/div[3]/div[3]/pre/code")
	public WebElement getLidDocResult;
	
	
	// this is the file input field for the Language detection
	@FindBy(how=How.XPATH, using="//div[@id='parm-Lid_post_nlp_lid_detectLanguage_document']//div[@class='parameter-item']//div[@class='param-property']//input[@name='inputFile']")
	public WebElement  inputLidDocInputFile;
	
	
	/*
	 * 
	 * This all the Web Elements below is for the Paragraph language detection
	 *
	 */
	// Inside Paragraph language detection
	
	//This is the text input for paragraph detection
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Lid_post_nlp_lid_detectLanguage_paragraph']/div[2]/div[2]/input")
 	public WebElement inputLidParagraphInput;
	
	// This is the try button for paragraph detection
	@FindBy(how=How.XPATH, using=".//*[@id='Lid_post_nlp_lid_detectLanguage_paragraph']/div/form/div[4]/input")
 	public WebElement clickLidParaTryButton;
	
	// this is the file input field for the Language detection
	@FindBy(how=How.XPATH, using="//div[@id='parm-Lid_post_nlp_lid_detectLanguage_paragraph']//div[@class='parameter-item']//div[@class='param-property']//input[@name='inputFile']")
	public WebElement  inputLidParaInputFile;
	
	// this is the file input field for the Language detection
	@FindBy(how=How.CSS, using="#Lid_post_nlp_lid_detectLanguage_paragraph > div > div.response > div.block.response_body.json > pre > code")
	public WebElement  getLidParaResult;
	
	
	
}																																																																
