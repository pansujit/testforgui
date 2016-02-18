/**
 * 
 */
package com.platform.NLP.Method;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.platform.asserting.attribute.NLPAssertPage;
import com.platform.locators.nlp.lid.LocatorsInNLPLidAPI;
import com.platform.method.commonInReference.CommonInReference;

/**
 * @author pandey
 *
 */
public class NLPLidMethods {
	
	
	public WebDriver driver;
	public NLPLidMethods(WebDriver ldriver){
		
		this.driver=ldriver;
		
	}
	
	// This will return the absolute path for the input
	public String fileCheck(){
		
		String fileTranslateFile=null;
		File file= new File("src/test/resources/lid_document.txt");
		if(file.exists()){
			fileTranslateFile=file.getAbsolutePath();
			
		}
		
		else
		{
			System.out.println("NO FILE FOUND");
		}
		
		return fileTranslateFile;
	}
	
	// This will return the absolute path for the input
		public String fileCheck2(){
			
			String fileTranslateFile=null;
			File file= new File("src/test/resources/lid_paragraph.txt");
			if(file.exists()){
				fileTranslateFile=file.getAbsolutePath();
				
			}
			
			else
			{
				System.out.println("NO FILE FOUND");
			}
			
			return fileTranslateFile;
		}
	
	
		
	public void lidCommon() throws InterruptedException{
		CommonInReference comoninreferece=PageFactory.initElements(driver, CommonInReference.class);
		comoninreferece.commonInReferenceMenuNLP();
		LocatorsInNLPLidAPI locatorinNLPlidAPI=PageFactory.initElements(driver, LocatorsInNLPLidAPI.class);
		locatorinNLPlidAPI.selectNLPLid.click();
				
	}
	
	
	
	public Boolean lidDocLangWithInput() throws InterruptedException{
		
		lidCommon();
		LocatorsInNLPLidAPI locatorinNLPlidAPI=PageFactory.initElements(driver, LocatorsInNLPLidAPI.class);
		locatorinNLPlidAPI.inputLidDocTextInput.sendKeys("the reason I left you is nothing than you hate me.");
		locatorinNLPlidAPI.clickLidDocTryButton.click();		
		return locatorinNLPlidAPI.getLidDocResult.getText().toString().contains(NLPAssertPage.getLidresponsevalue());
	}
	
	
	public Boolean lidDocLangWithInputFile() throws InterruptedException{
		
		lidCommon();
		LocatorsInNLPLidAPI locatorinNLPlidAPI=PageFactory.initElements(driver, LocatorsInNLPLidAPI.class);
		locatorinNLPlidAPI.inputLidDocInputFile.sendKeys(fileCheck());
		locatorinNLPlidAPI.clickLidDocTryButton.click();		
		return locatorinNLPlidAPI.getLidDocResult.getText().toString().contains(NLPAssertPage.getLidresponsevalue());
	}
	
	public Boolean lidParagraphWithInput() throws InterruptedException{
		
		lidCommon();
		LocatorsInNLPLidAPI locatorinNLPlidAPI=PageFactory.initElements(driver, LocatorsInNLPLidAPI.class);
		locatorinNLPlidAPI.selectLidParaLanguage.click();
		locatorinNLPlidAPI.inputLidParagraphInput.sendKeys(NLPAssertPage.getTextforparagraph());
		locatorinNLPlidAPI.clickLidParaTryButton.click();
		Thread.sleep(2000);
		return (locatorinNLPlidAPI.getLidParaResult.getText().toString().contains(NLPAssertPage.getLidresponsevalue())
				&& locatorinNLPlidAPI.getLidParaResult.getText().toString().contains(NLPAssertPage.getLidparagraphvalue()));
	}
	
public Boolean lidParagraphWithInputFile() throws InterruptedException{
		
		lidCommon();
		LocatorsInNLPLidAPI locatorinNLPlidAPI=PageFactory.initElements(driver, LocatorsInNLPLidAPI.class);
		locatorinNLPlidAPI.selectLidParaLanguage.click();
		locatorinNLPlidAPI.inputLidParaInputFile.sendKeys(fileCheck2());
		locatorinNLPlidAPI.clickLidParaTryButton.click();
		Thread.sleep(2000);
		return (locatorinNLPlidAPI.getLidParaResult.getText().toString().contains(NLPAssertPage.getLidresponsevalue())
				&& locatorinNLPlidAPI.getLidParaResult.getText().toString().contains(NLPAssertPage.getLidparagraphvalue()));
	}




}
