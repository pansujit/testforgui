package com.platform.gui.translation.filetranlation.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.gui.test.baseclass.BaseTestClassExtended;
import com.platform.translation.method.RESTAPIFileTranslation;


// this will test en to fr text translation

public class TestTranslationFileTranslationTextENtoFRWithSourceTrue extends BaseTestClassExtended {
	

	
	@Test
	public void fileTestENtoFRWithSourceTrue() throws InterruptedException{
		
		RESTAPIFileTranslation filetranslation=PageFactory.initElements(driver, RESTAPIFileTranslation.class);
		Boolean sourceTrue=filetranslation.fileTranslationfromENtoFRWithSourceTrue();
		Assert.assertTrue(sourceTrue);
		
		
	
		
	}

}
