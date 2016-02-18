/**
 * 
 */
package com.platform.translation.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.platform.asserting.attribute.JsonParser;
import com.platform.gui.test.baseclass.CommonLocators;
import com.platform.gui.test.baseclass.LocatorsInReferenceDropDown;
import com.platform.locator.translation.LocatorsInTranslateRestAPI;
import com.platform.method.commonInReference.CommonInReference;

import org.json.simple.parser.ParseException;




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
		
		
		
		/*LocatorsInReferenceDropDown locatorreferencedropdown=PageFactory.initElements(driver, LocatorsInReferenceDropDown.class);
		locatorreferencedropdown.referenceDropDownItems("reference").click();
		locatorreferencedropdown.clicktranslation.click();
		Thread.sleep(2000);*/
		CommonInReference comoninreferece=PageFactory.initElements(driver, CommonInReference.class);
		comoninreferece.commonInReferenceMenuFace();
						
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
		
		CommonInReference comoninreferece=PageFactory.initElements(driver, CommonInReference.class);	
		comoninreferece.commonInReferenceMenuFace();
		Thread.sleep(1000);
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
	
	
public Boolean fileTranslationfromENtoFRWithSourceTrue() throws InterruptedException{
		
		//getting front page sign in web element from locator front page
		//LocatorsInFrontPage.signIn.click();
		
		
		//comoninreferece.commonInReferenceMenu();
	
		CommonInReference comoninreferece=PageFactory.initElements(driver, CommonInReference.class);
		comoninreferece.commonInReferenceMenuFace();
		Thread.sleep(1000);		
		LocatorsInTranslateRestAPI locatorsintranslateapi=PageFactory.initElements(driver, LocatorsInTranslateRestAPI.class);
		locatorsintranslateapi.translation.click();
		locatorsintranslateapi.fileTranslation.click();
		
		
		LocatorsInTranslateRestAPI locatorsintranslationAPI=PageFactory.initElements(driver, LocatorsInTranslateRestAPI.class);
		locatorsintranslationAPI.fileInput.sendKeys(locatorsintranslationAPI.fileCheck());
		locatorsintranslationAPI.fileSource.clear();
		locatorsintranslationAPI.fileSource.sendKeys("en");
		locatorsintranslationAPI.fileTargetText.sendKeys("fr");
		locatorsintranslationAPI.fileWithSourceSelectTrue.click();
		locatorsintranslationAPI.fileTryButton.click();
		
		Thread.sleep(2000);
		
		
		return (locatorsintranslationAPI.getFileResultSourceTrue.getText().contains("part-name: source"));
		
		
		
		
	}


	public String fileTranslationfromENtoFRAsyncStatus(String requestId) throws InterruptedException, ParseException{
		
		LocatorsInTranslateRestAPI locatorsintranslateapi=PageFactory.initElements(driver, LocatorsInTranslateRestAPI.class);
		//JSONObject obj = new JSONObject(requestId);
		//String requestid=JSONObject.getString(requestId);
		   //Dictionary dict = new Hashtable();
		//System.out.println(requestId.get("requestId"));
			
		locatorsintranslateapi.fileTranslateStatusTequestId.sendKeys(JsonParser.jsontToTextConverter(requestId));
		locatorsintranslateapi.fileTranslateStatusTryButton.click();
		//return (driver.findElement(By.xpath(".//*[@id='Translation_get_translation_file_status']/div/div[3]/div[3]/pre/code/span[7]")).getText());
		Thread.sleep(2000);
		return(driver.findElement(By.cssSelector("#Translation_get_translation_file_status > div > div.response > div.block.response_body.json > pre > code > span:nth-child(13)")).getText().toString());
		
		
	
	}
	
public String fileTranslationfromENtoFRAsyncResult(String requestId) throws InterruptedException, ParseException{
		
		LocatorsInTranslateRestAPI locatorsintranslateapi=PageFactory.initElements(driver, LocatorsInTranslateRestAPI.class);
		System.out.println(JsonParser.jsontToTextConverter(requestId));
		Thread.sleep(3000);
		locatorsintranslateapi.fileTranslateResultRequestId.sendKeys(JsonParser.jsontToTextConverter(requestId));
		locatorsintranslateapi.fileTranslateResultTryButton.click();
		Thread.sleep(2000);
		return (driver.findElement(By.cssSelector("#Translation_get_translation_file_result > div > div.response > div.block.response_body.undefined > pre > code")).getText());
		
		
	
	}

public String fileTranslationBatchCreate() throws InterruptedException, ParseException{
	
	//getting front page sign in web element from locator front page
	//LocatorsInFrontPage.signIn.click();
	
	
	//comoninreferece.commonInReferenceMenu();
	CommonInReference comoninreferece=PageFactory.initElements(driver, CommonInReference.class);
	comoninreferece.commonInReferenceMenuFace();
	Thread.sleep(1000);	
	
	LocatorsInTranslateRestAPI locatorsintranslateapi=PageFactory.initElements(driver, LocatorsInTranslateRestAPI.class);
	locatorsintranslateapi.translation.click();
	locatorsintranslateapi.fileTranslation.click();
	
	
	LocatorsInTranslateRestAPI locatorsintranslationAPI=PageFactory.initElements(driver, LocatorsInTranslateRestAPI.class);
	locatorsintranslationAPI.fileInput.sendKeys(locatorsintranslationAPI.fileCheck());
	locatorsintranslationAPI.fileSource.clear();
	locatorsintranslationAPI.fileSource.sendKeys("en");
	locatorsintranslationAPI.fileTargetText.sendKeys("fr");
	locatorsintranslationAPI.fileTranslateBatchCreateButton.click();
	Thread.sleep(2000);
	return JsonParser.jsontToTextConverterReturnKey(locatorsintranslationAPI.getTranslateBatchCreateResult.getText());
		
}





}
