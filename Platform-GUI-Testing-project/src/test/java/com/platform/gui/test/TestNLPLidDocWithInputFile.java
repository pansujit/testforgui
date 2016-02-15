/**
 * 
 */
package com.platform.gui.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.NLP.Method.NLPLidMethods;

/**
 * @author pandey
 *
 */
public class TestNLPLidDocWithInputFile extends BaseTestClassExtended{
	
	
	
	
	@Test
	public void testLidParaWithInputFile() throws InterruptedException{
		
		NLPLidMethods nlplodmethods=PageFactory.initElements(driver, NLPLidMethods.class);
		Assert.assertTrue(nlplodmethods.lidParagraphWithInputFile());
		
		
		
		
	}
	
	

}
