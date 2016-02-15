package com.platform.gui.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.method.RESTAPIFileTranslation;


// this will test en to fr text translation

public class FileTranslationTextENtoFRWithSourceTrue extends BaseTestClassExtended {
	

	
	@Test
	public void fileTestENtoFRWithSourceTrue() throws InterruptedException{
		
		RESTAPIFileTranslation filetranslation=PageFactory.initElements(driver, RESTAPIFileTranslation.class);
		Boolean sourceTrue=filetranslation.fileTranslationfromENtoFRWithSourceTrue();
		Assert.assertTrue(sourceTrue);
		
		
	
		
	}

}
