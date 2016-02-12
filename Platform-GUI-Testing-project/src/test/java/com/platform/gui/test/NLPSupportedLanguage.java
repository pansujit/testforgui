/**
 * 
 */
package com.platform.gui.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.method.RESTNLPNerTranslation;




/**
 * @author pandey
 *
 */
public class NLPSupportedLanguage extends BaseTestClassExtended {
	

	
	
	@Test
	public void testNLPSupportedLanguage() throws InterruptedException{
		
		
		RESTNLPNerTranslation NLPSupportedLanguage=PageFactory.initElements(driver,RESTNLPNerTranslation.class);
		
		Assert.assertEquals(NLPSupportedLanguage.nerSupportedLanguage(),"200");
		
			
	}
	
	
	
}
