package com.platform.gui.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.platform.method.RESTAPITextTranslation;

// this will test English to French text translation

public class TranslationTextENtoFRWithSourceTrue extends BaseTestClassExtended {
	

	
	@Test
	public void testENtoFR() throws InterruptedException{
		RESTAPITextTranslation testme=PageFactory.initElements(driver,RESTAPITextTranslation.class);
		testme.textTranslationfromENtoFRWithSourceTrue();
		Thread.sleep(3000);
		//assertEquals(driver.findElement(By.xpath(".//*[@id='Translation_post_translation_text_translate']/div/div[3]/div[3]/pre/code/span[2]/span[2]/span")).getText().toString().replace("\"", ""),TranslationPageAsserts.textEntoFRTranslation );
	}

}
