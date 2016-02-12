/**
 * 
 */
package com.platform.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.platform.path.locator.CommonLocators;
import com.platform.path.locator.LocatorsInReferenceDropDown;
import com.platform.path.locator.LocatorsInTranslateRestAPI;



/**
 * This method will test the test translation and check if it is good or not
 * @author pandey
 *
 */
public class RESTAPIFileTranslation   {
	
	public  WebDriver driver;
	

	public RESTAPIFileTranslation(WebDriver ldriver){
		this.driver=ldriver;
	}
	
	public String fileTranslationfromENtoFR() throws InterruptedException{
		
		//getting front page sign in web element from locator front page
		//LocatorsInFrontPage.signIn.click();
		
		
		LocatorsInReferenceDropDown locatorreferencedropdown=PageFactory.initElements(driver, LocatorsInReferenceDropDown.class);
		locatorreferencedropdown.referenceDropDownItems("reference").click();
		locatorreferencedropdown.clicktranslation.click();
		
		Thread.sleep(2000);
		
		CommonLocators commonlocator=PageFactory.initElements(driver, CommonLocators.class);
		driver.switchTo().frame(driver.findElement(By.id("documentationContent")));
		commonlocator.apiKey.sendKeys("2965f61d-a0cb-46b9-9667-21ee1d284b24");
		
		
		LocatorsInTranslateRestAPI locatorsintranslateapi=PageFactory.initElements(driver, LocatorsInTranslateRestAPI.class);
		locatorsintranslateapi.translation.click();
		locatorsintranslateapi.fileTranslation.click();
		
		
		LocatorsInTranslateRestAPI locatorsintranslationAPI=PageFactory.initElements(driver, LocatorsInTranslateRestAPI.class);
		locatorsintranslationAPI.fileInput.sendKeys(locatorsintranslationAPI.fileCheck());
		locatorsintranslationAPI.fileSource.clear();
		locatorsintranslationAPI.fileSource.sendKeys("en");
		locatorsintranslationAPI.fileTargetText.sendKeys("fr");
		locatorsintranslationAPI.fileTryButton.click();
		
		Thread.sleep(2000);
		return (locatorsintranslationAPI.fileResult.getText());
		
		
		
	}
	
	
	public String[] fileTranslationfromENtoFRAsync() throws InterruptedException{
		
		//getting front page sign in web element from locator front page
		//LocatorsInFrontPage.signIn.click();
		
		
		LocatorsInReferenceDropDown locatorreferencedropdown=PageFactory.initElements(driver, LocatorsInReferenceDropDown.class);
		locatorreferencedropdown.referenceDropDownItems("reference").click();
		locatorreferencedropdown.clicktranslation.click();
		
		Thread.sleep(2000);
		
		CommonLocators commonlocator=PageFactory.initElements(driver, CommonLocators.class);
		driver.switchTo().frame(driver.findElement(By.id("documentationContent")));
		commonlocator.apiKey.sendKeys("2965f61d-a0cb-46b9-9667-21ee1d284b24");
		
		
		LocatorsInTranslateRestAPI locatorsintranslateapi=PageFactory.initElements(driver, LocatorsInTranslateRestAPI.class);
		locatorsintranslateapi.translation.click();
		locatorsintranslateapi.fileTranslation.click();
		
		
		LocatorsInTranslateRestAPI locatorsintranslationAPI=PageFactory.initElements(driver, LocatorsInTranslateRestAPI.class);
		locatorsintranslationAPI.fileInput.sendKeys(locatorsintranslationAPI.fileCheck());
		locatorsintranslationAPI.fileSource.clear();
		locatorsintranslationAPI.fileSource.sendKeys("en");
		locatorsintranslationAPI.fileTargetText.sendKeys("fr");
		locatorsintranslationAPI.fileSelectAsyncTrue.click();
		locatorsintranslationAPI.fileTryButton.click();
		
		Thread.sleep(2000);
		String [] myArray= new String[2];
		myArray[0]=locatorsintranslationAPI.fileTranslationAsyncRequestId.getText();
		myArray[1]=locatorsintranslationAPI.fileTranslationAsyncResposeCode.getText();
		return myArray;
		
		
		
	}

}
