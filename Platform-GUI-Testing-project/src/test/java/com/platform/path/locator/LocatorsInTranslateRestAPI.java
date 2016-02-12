package com.platform.path.locator;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author pandey
 *
 */

public class LocatorsInTranslateRestAPI {
	
	public WebDriver driver;
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
 	public WebElement texttranslation;*/
	
	public  LocatorsInTranslateRestAPI(WebDriver ldriver) {
		// TODO Auto-generated constructor stub
		this.driver=ldriver;
	}
	
	//Common for all
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_text_translate']/div[1]/div[2]/input")
 	public WebElement inputText;
	
	
	
	//text Translate
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]")
	public WebElement translation;
	
	
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_text_translate']/div[2]/div[2]/input")
 	public WebElement sourceText;
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_text_translate']/div[3]/div[2]/input")
 	public WebElement targetText;
	
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_post_translation_text_translate']/div/form/div[6]/input")
 	public WebElement tryButton;
	
	@FindBy(how=How.XPATH, using="//div[@id='parm-Translation_post_translation_file_translate']//div[@class='parameter-item']//div[@class='param-property']//input[@name='input']")
 	public WebElement fileInput;
	
	
	//file translate
	
	
	//The left side panel attribute to jump in that location without scrolling down
	@FindBy(how=How.XPATH, using=".//*[@id='swagger_sidebar']/div/div/div[2]/div[2]/div[2]/div/div[2]/div[2]")
	public WebElement fileTranslation;
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_translate']/div[2]/div[2]/input")
 	public WebElement fileSource;
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_translate']/div[3]/div[2]/input")
 	public WebElement fileTargetText;
	
	
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_post_translation_file_translate']/div/form/div[6]/input")
 	public WebElement fileTryButton;
	
	@FindBy(how=How.CSS, using="#Translation_post_translation_file_translate > div > div.response > div.block.response_body > pre > code")
 	public WebElement fileResult;
	
	//Profile id to apply for translation
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_translate']/div[5]/div[2]/input")
 	public WebElement fileProfile;
	
	//select the button true if the source is need with translation(By default false)
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_translate']/div[6]/div[2]/div[2]/select")
	public WebElement fileWithSourceSelect;
	
	
	//click the button true if the source is need with translation(By default false)
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_translate']/div[6]/div[2]/div[2]/select/option[2]")
	public WebElement fileWithSourceSelectTrue;
	
	
	// input the any dictinary the is defined or created by you (use always string)
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_translate']/div[8]/div[2]/input")
	public WebElement fileSelectDictionary;
	
	// input the any corpus the is defined or created by you (use always string)
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_translate']/div[9]/div[2]/input")
	public WebElement fileSelectCorpus;
	
	
	// This is select if we need other encoding method (default is utf-8)
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_translate']/div[11]/div[2]/div[2]/select")
	public WebElement fileSelectEncoding;
	
	// This is select if we need base64 encoding
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_translate']/div[11]/div[2]/div[2]/select/option[1]")
	public WebElement fileSelectBase64;
	
	// This is selecter if we need to translate file asynchronously(By default false)
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_translate']/div[12]/div[2]/div[2]/select")
	public WebElement fileSelectAsyncMode;	
	
	// This is select if we need to translate file asynchronously
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_translate']/div[12]/div[2]/div[2]/select/option[2]")
	public WebElement fileSelectAsyncTrue;	
	
	
	// Translate file status
	
	// This is the form that is used for the requested Id generated when file async mode is selected  
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_get_translation_file_status']/div[1]/div[2]/input")
	public WebElement fileTranslateStatusTequestId;
	
	
	/*// callback it is should be used as json format left unused for the moment  
	@FindBy(how=How.CSS, using=".//*[@id='parm-Translation_get_translation_file_status']/div[1]/div[2]/input")
	public WebElement fileTranslateStatusTequestId;*/
	
	// This is click button for try whether it succeed to cancel or not
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_get_translation_file_status']/div/form/div[6]/input")
	public WebElement fileTranslateStatusTryButton;
	
	
	
	//Translate Cancel 
	// This Web elements are dedicated to cancel the file translate
	
	
	// This is the form that is used for the requested Id generated when file async mode is selected for cancellation of the file  
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_cancel']/div[1]/div[2]/input")
	public WebElement fileTranslateCancelTequestId;
	
	// This is click button for try whether it succeed to cancel or not
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_post_translation_file_cancel']/div/form/div[6]/input")
	public WebElement fileTranslateCancelTryButton;
	
	
	
	//Translate Result 
	// this will give the result of async file translation and request ID is required
	
	// This is the form that is used for the requested Id generated when file async mode is selected for result  
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_cancel']/div[1]/div[2]/input")
	public WebElement fileTranslateResultTequestId;
	
	
	// This is click button for try whether it succeed to cancel or not
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_get_translation_file_result']/div/form/div[6]/input")
	public WebElement fileTranslateResultTryButton;
	
	
	//This select case is used for choose the result in the selected format(default is application/json)
	@FindBy(how=How.XPATH, using=".//*[@id='rct0.5762904988894109']")
	public WebElement fileTranslateResultFormat;
	
	
	//This click case is used for multipart/mixed
	@FindBy(how=How.XPATH, using=".//*[@id='rct0.5762904988894109']/option[2]")
	public WebElement fileTranslateResultMultipart;
	
	//This click case is used for choose the result in the selected format(default is application/json)
	@FindBy(how=How.XPATH, using=".//*[@id='rct0.5762904988894109']/option[3]")
	public WebElement fileTranslateResultAnything;
	
	
	
	//Batch Create
		
	/**
	 * The Batch is created when when we need the bundle of file translate asynchronously.  This is useful when we have multiple files and 
	 * translate.
	 * @author pandey
	 *
	 */
	
	
	//This try button will create the request id for batch translation	
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_post_translation_file_batch_create']/div/form/div[6]/input")
	public WebElement fileTranslateBatchCreateButton;
	
	
	
	// Batch Status
	
	/**
	 * This is used for check the status of asynchronous batch file translation
	 * @author pandey
	 *
	 */
	
	//This form for the the request id of batch translation(mandatory)	
		@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_get_translation_file_batch_status']/div[1]/div[2]/input")
		public WebElement fileTranslateBatchStatusRequestId;
		
				
	//This try button show the status of batch translation	
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_get_translation_file_batch_status']/div/form/div[6]/input")
	public WebElement fileTranslateBatchStatusTrybutton;
	
	
	//Batch Cancel
	
	/**
	 * This is used for Cancel  asynchronous batch file translation(BatchID is mandatory)
	 * @author pandey
	 *
	 */
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_batch_cancel']/div[1]/div[2]/input")
	public WebElement fileTranslateBatchcancelRequestId;
	
		
	//This try button show the status of batch translation	
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_post_translation_file_batch_cancel']/div/form/div[6]/input")
	public WebElement fileTranslateBatchCancelTrybutton;
	
	
		
	//Batch Close
		/*
		 * This is closed the batch already created and no longer use of the batch request id.
		 */
	
	//Bath Id for batch translation	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_batch_close']/div[1]/div[2]/input")
	public WebElement fileTranslateBatchCloselRequestId;
	
	
	//This try button show the close of batch operation	
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_post_translation_file_batch_close']/div/form/div[6]/input")
	public WebElement fileTranslateBatchCloseTrybutton;
	
    
	//Supported Language
	/* The Systran supports various language pair for translation. The source and target are optional in case of the getting supported language
	 * if we need more specific translation pair then we can choose source language as well as target language.
	 */
	
	// source language that has the translation pair eg "en-fr" 	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_get_translation_supportedLanguages']/div[1]/div[2]/input")
	public WebElement TranslationSupportedLangSource;
	
	
	// target language that has the translation pair eg "en-fr" 	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_get_translation_supportedLanguages']/div[2]/div[2]/input")
	public WebElement TranslationSupportedLangTarget;
		
		
	//This try button show the supported Languages	
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_get_translation_supportedLanguages']/div/form/div[6]/input")
	public WebElement TranslateSupportedLangTrybutton;
	
	//Supported Formats
	/*
	 * This gives the supported format for the translation.
	 */
	
	//This try button show the supported format	
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_get_translation_supportedFormats']/div/form/div[6]/input")
	public WebElement TranslateSupportedFormatTrybutton;
	
	
	//Api Version 
	/*
	 * This will show the version of api that you are using right now
	 */
	//This try button show the supported format	
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_get_translation_apiVersion']/div/form/div[6]/input")
	public WebElement TranslateApiVersionTrybutton;
	
	
	

	
	
	public String fileCheck(){
		
		String fileTranslateFile=null;
		File file= new File("src/test/resources/file.txt");
		if(file.exists()){
			fileTranslateFile=file.getAbsolutePath();
			
		}
		
		else
		{
			System.out.println("NO FILE FOUND");
		}
		
		return fileTranslateFile;
	}
	
	
	
	
	
	
	
	
}
