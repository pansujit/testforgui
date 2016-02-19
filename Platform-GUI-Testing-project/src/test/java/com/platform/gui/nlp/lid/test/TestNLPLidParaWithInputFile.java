/**
 * 
 */
package com.platform.gui.nlp.lid.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.NLP.Method.NLPLidMethods;
import com.platform.gui.test.baseclass.BaseTestClassExtended;

/**
 * @author pandey
 *
 */
public class TestNLPLidParaWithInputFile extends BaseTestClassExtended{
	
	
	
	
	@Test
	public void lidDocWithInputFile() throws InterruptedException{
		
		NLPLidMethods nlplodmethods=PageFactory.initElements(driver, NLPLidMethods.class);
		Assert.assertTrue(nlplodmethods.lidDocLangWithInputFile());
		
		
		
		
	}
	
	

}
