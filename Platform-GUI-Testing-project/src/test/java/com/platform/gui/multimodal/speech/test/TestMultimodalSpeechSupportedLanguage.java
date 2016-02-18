/**
 * 
 */
package com.platform.gui.multimodal.speech.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.gui.test.baseclass.BaseTestClassExtended;
import com.platform.multimodal.method.ResourcesAPIMultimodal;

/**
 * This will test the supported language of dictionary.
 * @author sujit
 *
 */
public class TestMultimodalSpeechSupportedLanguage extends BaseTestClassExtended {
	
	
	
	
	
	@Test
	public void speechSupportedLanguage() throws InterruptedException{
		
		ResourcesAPIMultimodal resourcesapimultimodal=PageFactory.initElements(driver, ResourcesAPIMultimodal.class );
		Assert.assertEquals(resourcesapimultimodal.speechSupportedLanguage(),"200");
		
			}
	
	
	

}
