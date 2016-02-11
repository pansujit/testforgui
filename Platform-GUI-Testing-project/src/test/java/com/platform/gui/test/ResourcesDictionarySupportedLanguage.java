/**
 * 
 */
package com.platform.gui.test;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.platform.method.ResourcesAPIDictionarySupportedLanguage;

/**
 * @author sujit
 *
 */
public class ResourcesDictionarySupportedLanguage extends BaseTestClassExtended {
	
	
	
	
	
	@Test
	public void dictionarySupportedLanguage() throws InterruptedException{
		
		ResourcesAPIDictionarySupportedLanguage dictionarysupportedlanguage=PageFactory.initElements(driver, ResourcesAPIDictionarySupportedLanguage.class );
		dictionarysupportedlanguage.dictionarySupportedLanguage();
	}
	
	
	

}
