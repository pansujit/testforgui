/**
 * 
 */
package com.platform.gui.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.platform.method.ResourcesAPIMultimodal;

/**
 * This will test the supported language of dictionary.
 * @author sujit
 *
 */
public class MultimodalSpeechSupportedLanguage extends BaseTestClassExtended {
	
	
	
	
	
	@Test
	public void speechSupportedLanguage() throws InterruptedException{
		
		ResourcesAPIMultimodal resourcesapimultimodal=PageFactory.initElements(driver, ResourcesAPIMultimodal.class );
		Assert.assertEquals(resourcesapimultimodal.speechSupportedLanguage(),"200");
		
			}
	
	
	

}
