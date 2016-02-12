package com.platform.gui.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.platform.asserting.attribute.TranslationPageAsserts;
import com.platform.method.RESTAPIFileTranslation;


// this will test en to fr text translation

public class FileTranslationTextENtoFRAsync extends BaseTestClassExtended {
	

	
	@Test
	public void fileTestENtoFR() throws InterruptedException{
		
		RESTAPIFileTranslation filetranslation=PageFactory.initElements(driver, RESTAPIFileTranslation.class);
		String[] compareStrings=filetranslation.fileTranslationfromENtoFRAsync();
		Assert.assertEquals((compareStrings[0]).length()>5, true);
		Assert.assertEquals(compareStrings[1],"200");
		
	
		
	}

}
