/**
 * 
 */
package com.platform.gui.nlp.ner.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.NLP.Method.RESTNLPNerTranslation;
import com.platform.gui.test.baseclass.BaseTestClassExtended;




/**
 * @author pandey
 *
 */
public class TestNLPNerSupportedLanguage extends BaseTestClassExtended {
	

	
	
	@Test
	public void testNLPSupportedLanguage() throws InterruptedException{
		
		
		RESTNLPNerTranslation NLPSupportedLanguage=PageFactory.initElements(driver,RESTNLPNerTranslation.class);
		
		Assert.assertEquals(NLPSupportedLanguage.nerSupportedLanguage(),"200");
		
			
	}
	
	
	
}
