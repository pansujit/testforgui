package com.platform.gui.test;


import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.platform.method.RESTAPIFileTranslation;


// this will test en to fr text translation

public class FileTranslationBatchCreate extends BaseTestClassExtended {
	

	
	@Test
	public void fileTestENtoFR() throws InterruptedException, ParseException{
		
		RESTAPIFileTranslation filetranslation=PageFactory.initElements(driver, RESTAPIFileTranslation.class);
		System.out.println(filetranslation.fileTranslationBatchCreate());
		
		
	
		
	}

}
