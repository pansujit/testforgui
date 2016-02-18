/**
 * 
 */
package com.platform.gui.resources.corpus.test;

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
public class TestResourcesCorpusAddANewCorpus extends BaseTestClassExtended {
	
	@Test
	public void corpusAddANewCorpus() throws InterruptedException{
		ResourcesCorpus resourcecorpus=PageFactory.initElements(driver, ResourcesCorpus.class);
		String[] lookUpText=resourcecorpus.corpusAddANewEmptyCorpus();
		Assert.assertTrue((lookUpText[0].contains(CorpusAssertPage.getAssertaddanewcorpus())) &&(lookUpText[1].contains(CorpusAssertPage.getAssertresponsecode())));
		
		
	}
	
	

}
