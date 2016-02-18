package com.platform.gui.translation.filetranlation.test;


import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.asserting.attribute.TranslationPageAsserts;
import com.platform.gui.test.baseclass.BaseTestClassExtended;
import com.platform.translation.method.RESTAPIFileTranslation;


// this will test en to fr text translation

public class TestTranslationFileTranslationTextENtoFRAsyncResult extends BaseTestClassExtended {
	

	
	@Test
	public void fileTestENtoFR() throws InterruptedException, ParseException{
				
		RESTAPIFileTranslation filetranslation=PageFactory.initElements(driver, RESTAPIFileTranslation.class);
		String[] compareStrings=filetranslation.fileTranslationfromENtoFRAsync();
		Assert.assertEquals(filetranslation.fileTranslationfromENtoFRAsyncResult(compareStrings[0]),TranslationPageAsserts.getFileentofrtranslation());
		
		}

}
