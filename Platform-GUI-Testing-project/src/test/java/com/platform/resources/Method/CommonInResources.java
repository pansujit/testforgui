/**
 * 
 */
package com.platform.resources.Method;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.platform.gui.test.baseclass.CommonLocators;
import com.platform.gui.test.baseclass.LocatorsInReferenceDropDown;

/**
 * @author pandey
 *
 */
public class CommonInResources {


	public WebDriver driver;

	public CommonInResources(WebDriver ldriver){

		this.driver=ldriver;
	}


	public void commonInAll() throws InterruptedException{

		LocatorsInReferenceDropDown locatorsinReference=PageFactory.initElements(driver,LocatorsInReferenceDropDown.class );
		locatorsinReference.referenceDropDownItems("reference").click();
		locatorsinReference.clickResources.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("documentationContent")));

		CommonLocators commonlocator=PageFactory.initElements(driver, CommonLocators.class);
		commonlocator.apiKey.sendKeys("7b9b3039-c7e7-4017-8c19-a69fd9ed35b4");

	}
	
	public static String fileCheck(String fileName){
		
		String fileTranslateFile=null;
		File file= new File(String.format("src/test/resources/%s", fileName));
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
