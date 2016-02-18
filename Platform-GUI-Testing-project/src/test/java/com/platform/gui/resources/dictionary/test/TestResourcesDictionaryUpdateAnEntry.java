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
 * This class test the delete an entry for a dictionary
 * @author pandey
 *
 */
public class TestResourcesDictionaryUpdateAnEntry extends BaseTestClassExtended {
	
	@Test
	public void dictionaryUpdateAnEntry() throws InterruptedException, ParseException{
		
		ResourcesDictionary lookup=PageFactory.initElements(driver, ResourcesDictionary.class);
		Assert.assertTrue(lookup.dictionaryUpdateAnEntry());
		
	}

	
	
}
