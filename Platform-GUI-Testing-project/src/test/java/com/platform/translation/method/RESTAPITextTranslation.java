/**
 * 
 */
package com.platform.translation.method;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.platform.asserting.attribute.JsonParser;
import com.platform.gui.test.baseclass.CommonLocators;
import com.platform.gui.test.baseclass.LocatorsInReferenceDropDown;
import com.platform.locator.translation.LocatorsInTranslateRestAPI;
import com.platform.locator.translation.LocatorsInTranslationTextTranslation;



/**
 * This method will test the test translation and check if it is good or not
 * @author pandey
 *
 */
public class RESTAPITextTranslation   {
	
	public  WebDriver driver;
	
	

	public RESTAPITextTranslation(WebDriver ldriver){
		this.driver=ldriver;
		
		
	}
	
	public void textTranslationfromENtoFR() throws InterruptedException{
		
		//getting front page sign in web element from locator front page
		//LocatorsInFrontPage.signIn.click();
		
		
		LocatorsInReferenceDropDown locatorreferencedropdown=PageFactory.initElements(driver, LocatorsInReferenceDropDown.class);
		locatorreferencedropdown.referenceDropDownItems("reference").click();
		locatorreferencedropdown.clicktranslation.click();
		Thread.sleep(1000);
		
		CommonLocators commonlocator=PageFactory.initElements(driver, CommonLocators.class);
		driver.switchTo().frame(driver.findElement(By.id("documentationContent")));
		commonlocator.apiKey.sendKeys("2965f61d-a0cb-46b9-9667-21ee1d284b24");
		
		LocatorsInTranslationTextTranslation texttranslation=PageFactory.initElements(driver,LocatorsInTranslationTextTranslation.class);
		texttranslation.translation.click();
		texttranslation.inputText.sendKeys("hello");
		texttranslation.sourceText.clear();
		texttranslation.sourceText.sendKeys("en");
		texttranslation.targetText.sendKeys("fr");
		texttranslation.tryButton.click();
		
		
		
	}
	
public String textTranslationfromENtoFRWithSourceTrue() throws InterruptedException, IOException, ParseException{
		
		LocatorsInReferenceDropDown locatorreferencedropdown=PageFactory.initElements(driver, LocatorsInReferenceDropDown.class);
		locatorreferencedropdown.referenceDropDownItems("reference").click();
		locatorreferencedropdown.clicktranslation.click();
		Thread.sleep(2000);
		
		CommonLocators commonlocator=PageFactory.initElements(driver, CommonLocators.class);
		driver.switchTo().frame(driver.findElement(By.id("documentationContent")));
		commonlocator.apiKey.sendKeys("7b9b3039-c7e7-4017-8c19-a69fd9ed35b4");
		
		LocatorsInTranslationTextTranslation texttranslation=PageFactory.initElements(driver,LocatorsInTranslationTextTranslation.class);
		texttranslation.translation.click();
		texttranslation.inputText.sendKeys("hello");
		texttranslation.sourceText.clear();
		texttranslation.sourceText.sendKeys("en");
		texttranslation.targetText.sendKeys("fr");
		texttranslation.textWithSourceeTrue.click();
		texttranslation.tryButton.click();
		Thread.sleep(1000);
		return (JsonParser.jsontToTextConverterSourceArray(texttranslation.getTextWithSourceTrue.getText().toString()));
		

			
	}


public Boolean textTranslationfromENtoFRBackTranslation() throws InterruptedException{
	
	
	LocatorsInReferenceDropDown locatorreferencedropdown=PageFactory.initElements(driver, LocatorsInReferenceDropDown.class);
	locatorreferencedropdown.referenceDropDownItems("reference").click();
	locatorreferencedropdown.clicktranslation.click();
	Thread.sleep(2000);
	
	CommonLocators commonlocator=PageFactory.initElements(driver, CommonLocators.class);
	driver.switchTo().frame(driver.findElement(By.id("documentationContent")));
	commonlocator.apiKey.sendKeys("7b9b3039-c7e7-4017-8c19-a69fd9ed35b4");
	
	LocatorsInTranslationTextTranslation texttranslation=PageFactory.initElements(driver,LocatorsInTranslationTextTranslation.class);
	texttranslation.translation.click();
	texttranslation.inputText.sendKeys("hello");
	texttranslation.sourceText.clear();
	texttranslation.sourceText.sendKeys("en");
	texttranslation.targetText.sendKeys("fr");
	texttranslation.textWithSourceeTrue.click();
	texttranslation.textWithBackTranslationTrue.click();
	texttranslation.tryButton.click();
	Thread.sleep(1000);
	String compare=texttranslation.backTranslationTrue.getText().toString();
	return (compare.contains("output")&&compare.contains("source")&&compare.contains("backTranslation"));
	
	
}

}
