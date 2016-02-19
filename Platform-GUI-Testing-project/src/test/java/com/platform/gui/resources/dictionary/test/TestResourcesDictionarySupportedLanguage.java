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
 * This will test the supported language of multimodal speech.
 * @author sujit
 *
 */
public class TestResourcesDictionarySupportedLanguage extends BaseTestClassExtended {

	@Test
	public void dictionarySupportedLanguage() throws InterruptedException{

		ResourcesDictionary dictionarysupportedlanguage=PageFactory.initElements(driver, ResourcesDictionary.class );
		Assert.assertTrue(dictionarysupportedlanguage.dictionarySupportedLanguage());

	}




}
