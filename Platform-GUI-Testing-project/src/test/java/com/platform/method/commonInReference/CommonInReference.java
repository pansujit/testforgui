/**
 * 
 */
package com.platform.method.commonInReference;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.platform.path.locator.CommonLocators;
import com.platform.path.locator.LocatorsInReferenceDropDown;

/**
 * @author sujit
 *
 */
public class CommonInReference {
	public WebDriver driver;
	public CommonInReference(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	public void commonInReferenceMenu() throws InterruptedException{
		
			
		CommonLocators commonlocator=PageFactory.initElements(driver, CommonLocators.class);
		driver.switchTo().frame(driver.findElement(By.id("documentationContent")));
		commonlocator.apiKey.sendKeys("2965f61d-a0cb-46b9-9667-21ee1d284b24");
	
		
	}
	
	
public void commonInReferenceMenuFace() throws InterruptedException{
		
				
	LocatorsInReferenceDropDown locatorreferencedropdown=PageFactory.initElements(driver, LocatorsInReferenceDropDown.class);
	locatorreferencedropdown.referenceDropDownItems("reference").click();
	locatorreferencedropdown.clicktranslation.click();
	
		Thread.sleep(2000);
		commonInReferenceMenu();
	
		
	}
	
	
	
	
	
public void commonInReferenceMenuNLP() throws InterruptedException{
		
		LocatorsInReferenceDropDown locatorreferencedropdown=PageFactory.initElements(driver, LocatorsInReferenceDropDown.class);
		locatorreferencedropdown.referenceDropDownItems("reference").click();
		locatorreferencedropdown.clickNLP.click();
		
		Thread.sleep(2000);
		commonInReferenceMenu();
	
		
	}

}
