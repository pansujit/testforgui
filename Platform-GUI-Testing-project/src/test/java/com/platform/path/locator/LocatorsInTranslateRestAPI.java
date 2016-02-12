package com.platform.path.locator;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatorsInTranslateRestAPI {
	
	public WebDriver driver;
	/*@FindBy(how=How.XPATH, using=".//*[@id='navMenu']/div/div[2]/a[1]")
 	public WebElement texttranslation;*/
	
	public  LocatorsInTranslateRestAPI(WebDriver ldriver) {
		// TODO Auto-generated constructor stub
		this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_text_translate']/div[1]/div[2]/input")
 	public WebElement inputText;
	
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_text_translate']/div[2]/div[2]/input")
 	public WebElement sourceText;
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_text_translate']/div[3]/div[2]/input")
 	public WebElement targetText;
	
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_post_translation_text_translate']/div/form/div[6]/input")
 	public WebElement tryButton;
	
	@FindBy(how=How.XPATH, using="//div[@id='parm-Translation_post_translation_file_translate']//div[@class='parameter-item']//div[@class='param-property']//input[@name='input']")
 	public WebElement fileInput;
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_translate']/div[2]/div[2]/input")
 	public WebElement fileSource;
	
	@FindBy(how=How.XPATH, using=".//*[@id='parm-Translation_post_translation_file_translate']/div[3]/div[2]/input")
 	public WebElement fileTargetText;
	
	
	@FindBy(how=How.XPATH, using=".//*[@id='Translation_post_translation_file_translate']/div/form/div[6]/input")
 	public WebElement fileTryButton;
	@FindBy(how=How.CSS, using="#Translation_post_translation_file_translate > div > div.response > div.block.response_body > pre > code")
 	public WebElement fileResult;
	
	
	
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
