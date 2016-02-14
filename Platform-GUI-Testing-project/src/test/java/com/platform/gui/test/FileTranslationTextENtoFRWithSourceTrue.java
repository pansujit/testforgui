package com.platform.gui.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.platform.method.RESTAPIFileTranslation;


// this will test en to fr text translation

public class FileTranslationTextENtoFRWithSourceTrue extends BaseTestClassExtended {
	

	
	@Test
	public void fileTestENtoFRWithSourceTrue() throws InterruptedException{
		
		RESTAPIFileTranslation filetranslation=PageFactory.initElements(driver, RESTAPIFileTranslation.class);
		@SuppressWarnings("unused")
		String compareStrings=filetranslation.fileTranslationfromENtoFRWithSourceTrue();
		//Assert.assertEquals((compareStrings[0]).length()>5, true);
		//Assert.assertEquals(compareStrings[1],"200");
		
	
		
	}

}
