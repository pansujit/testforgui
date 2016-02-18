package com.platform.gui.translation.text.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.platform.gui.test.baseclass.BaseTestClassExtended;
import com.platform.translation.method.RESTAPITextTranslation;

import junit.framework.Assert;

// this will test en to fr text translation

public class TestTranslationTextENtoFRWithBackTranslationTrue extends BaseTestClassExtended {
	

	
	@Test
	public void testENtoFRBackTranslation() throws InterruptedException{
		RESTAPITextTranslation testme=PageFactory.initElements(driver,RESTAPITextTranslation.class);
		Assert.assertTrue(testme.textTranslationfromENtoFRBackTranslation());
		
		
	}

}
