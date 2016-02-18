/**
 * 
 */
package com.platform.gui.resources.dictionary.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.gui.test.baseclass.BaseTestClassExtended;
import com.platform.resources.Method.ResourcesDictionary;

/**
 * @author pandey
 *
 */
public class TestResourcesDictionaryLookUpSuppLanguage extends BaseTestClassExtended {
	
	
	@Test
	public void lookUpSupportedLanguage() throws InterruptedException{
		ResourcesDictionary lookup=PageFactory.initElements(driver, ResourcesDictionary.class);
		Assert.assertTrue(lookup.dictionaryLookUpSupportedLanguages());
		
		
	}
	
}
