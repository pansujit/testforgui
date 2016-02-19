/**
 * 
 */
package com.platform.gui.resources.corpus.test;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.asserting.attribute.CorpusAssertPage;
import com.platform.gui.test.baseclass.BaseTestClassExtended;
import com.platform.resources.Method.ResourcesCorpus;

/**
 * @author pandey
 *
 */
public class TestResourcesCorpusDeleteCorpus extends BaseTestClassExtended {
	
	@Test
	public void corpusDeleteCorpus() throws InterruptedException, IOException, ParseException{
		ResourcesCorpus resourcecorpus=PageFactory.initElements(driver, ResourcesCorpus.class);
	
		Assert.assertEquals(resourcecorpus.corpusDeleteCorpus(),CorpusAssertPage.getAssertresponsecode());
		
		
	}
	
	

}
