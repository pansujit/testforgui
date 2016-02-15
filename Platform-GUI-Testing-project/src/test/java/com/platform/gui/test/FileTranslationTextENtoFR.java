package com.platform.gui.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.platform.asserting.attribute.TranslationPageAsserts;
import com.platform.method.RESTAPIFileTranslation;


// this will test en to fr text translation

public class FileTranslationTextENtoFR extends BaseTestClassExtended {
	

	
	@Test
	public void fileTestENtoFR() throws InterruptedException{
		
		RESTAPIFileTranslation filetranslation=PageFactory.initElements(driver, RESTAPIFileTranslation.class);
		
		Assert.assertEquals(filetranslation.fileTranslationfromENtoFR(), TranslationPageAsserts.getFileentofrtranslation());
		
	}

}
