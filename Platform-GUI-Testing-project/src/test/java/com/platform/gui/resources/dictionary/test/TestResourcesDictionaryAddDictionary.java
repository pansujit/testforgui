/**
 * 
 */
package com.platform.gui.resources.dictionary.test;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.gui.test.baseclass.BaseTestClassExtended;
import com.platform.resources.Method.ResourcesDictionary;

/**
 * @author pandey
 *
 */
public class TestResourcesDictionaryAddDictionary extends BaseTestClassExtended {
	
	@Test
	public void dictionaryAddDictionary() throws InterruptedException, ParseException{
		
		ResourcesDictionary lookup=PageFactory.initElements(driver, ResourcesDictionary.class);
		Assert.assertTrue(lookup.dictionaryAddDictionary());
		
	}

	
	
}
