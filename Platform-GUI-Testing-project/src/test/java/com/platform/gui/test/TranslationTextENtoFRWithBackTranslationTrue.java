package com.platform.gui.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.platform.method.RESTAPITextTranslation;

import junit.framework.Assert;

// this will test en to fr text translation

public class TranslationTextENtoFRWithBackTranslationTrue extends BaseTestClassExtended {
	

	
	@Test
	public void testENtoFRBackTranslation() throws InterruptedException{
		RESTAPITextTranslation testme=PageFactory.initElements(driver,RESTAPITextTranslation.class);
		Assert.assertTrue(testme.textTranslationfromENtoFRBackTranslation());
		
		
	}

}
