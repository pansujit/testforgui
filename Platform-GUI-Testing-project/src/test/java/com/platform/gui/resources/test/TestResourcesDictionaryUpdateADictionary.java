/**
 * 
 */
package com.platform.gui.resources.test;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.asserting.attribute.ResourcesAssertPage;
import com.platform.gui.test.BaseTestClassExtended;
import com.platform.resources.Method.ResourcesDictionary;

/**
 * @author pandey
 *
 */
public class TestResourcesDictionaryUpdateADictionary extends BaseTestClassExtended {
	
	@Test
	public void dictionaryUpdateADictionary() throws InterruptedException, ParseException{
		
		ResourcesDictionary lookup=PageFactory.initElements(driver, ResourcesDictionary.class);
		Assert.assertTrue(lookup.dictionaryUpdateADictionary());
		
	}

	
	
}
