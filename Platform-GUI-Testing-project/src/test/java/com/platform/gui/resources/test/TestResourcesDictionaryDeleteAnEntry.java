/**
 * 
 */
package com.platform.gui.resources.test;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.platform.gui.test.BaseTestClassExtended;
import com.platform.resources.Method.ResourcesDictionary;

/**
 * This class test the delete an entry for a dictionary
 * @author pandey
 *
 */
public class TestResourcesDictionaryDeleteAnEntry extends BaseTestClassExtended {
	
	@Test
	public void dictionaryDeleteAnEntry() throws InterruptedException, ParseException{
		
		ResourcesDictionary lookup=PageFactory.initElements(driver, ResourcesDictionary.class);
		Assert.assertTrue(lookup.dictionaryDeleteAnEntry());
		
	}

	
	
}
