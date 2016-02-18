package com.platform.gui.translation.filetranlation.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.gui.test.baseclass.BaseTestClassExtended;
import com.platform.translation.method.RESTAPIFileTranslation;


// this will test en to fr text translation

public class TestTranslationFileTranslationTextENtoFRAsync extends BaseTestClassExtended {
	

	
	@Test
	public void fileTranslateENtoFRAsync() throws InterruptedException{
		
		RESTAPIFileTranslation filetranslation=PageFactory.initElements(driver, RESTAPIFileTranslation.class);
		String[] compareStrings=filetranslation.fileTranslationfromENtoFRAsync();
		Assert.assertEquals((compareStrings[0]).length()>5, true);
		Assert.assertEquals(compareStrings[1],"200");
		
	
		
	}

}
