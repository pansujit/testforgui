package com.platform.gui.translation.filetranlation.test;


import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.platform.asserting.attribute.TranslationPageAsserts;
import com.platform.gui.test.baseclass.BaseTestClassExtended;
import com.platform.translation.method.RESTAPIFileTranslation;

import junit.framework.Assert;


// this will test en to fr text translation

public class TestTranslationFileTranslationBatchCreate extends BaseTestClassExtended {
	

	
	@Test
	public void fileTranslationBatchCreate() throws InterruptedException, ParseException{
		
		RESTAPIFileTranslation filetranslation=PageFactory.initElements(driver, RESTAPIFileTranslation.class);
		Assert.assertEquals(filetranslation.fileTranslationBatchCreate(),TranslationPageAsserts.getFilebatchcreateid());
		
			
		
	}

}
