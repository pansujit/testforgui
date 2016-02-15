package com.platform.gui.test;


import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.asserting.attribute.TranslationPageAsserts;
import com.platform.method.RESTAPITextTranslation;

// this will test English to French text translation

public class TranslationTextENtoFRWithSourceTrue extends BaseTestClassExtended {
	

	
	@Test
	public void textENtoFRWithSourceTrue() throws InterruptedException, IOException, ParseException{
		RESTAPITextTranslation testme=PageFactory.initElements(driver,RESTAPITextTranslation.class);
		Assert.assertEquals(testme.textTranslationfromENtoFRWithSourceTrue(),TranslationPageAsserts.getTextwithsource());
		
		
	}

}
