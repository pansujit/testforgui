/**
 * 
 */
package com.platform.NLP.Method;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.platform.asserting.attribute.JsonParser;
import com.platform.common.input.TextAndOtherInputs;
import com.platform.method.commonInReference.CommonInReference;
import com.platform.path.locator.LocatorsInNLPNerAPI;

/**
 * @author sujit
 *
 */
public class NLPNerMethods {
	
	public WebDriver driver;
	
	public NLPNerMethods(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	
	public String[] getEntitiesWithInput() throws InterruptedException, ParseException, IOException{
		
		
		CommonInReference comoninreferece=PageFactory.initElements(driver, CommonInReference.class);
		comoninreferece.commonInReferenceMenuNLP();
		LocatorsInNLPNerAPI locatorsinnlpAPI= PageFactory.initElements(driver,LocatorsInNLPNerAPI.class);
		locatorsinnlpAPI.clickOnNER.click();
		locatorsinnlpAPI.clickonNergetListOfEntities.click();
		locatorsinnlpAPI.inputOnNerInput.sendKeys(TextAndOtherInputs.getNlpinput());
		locatorsinnlpAPI.inputOnNerLanguage.sendKeys(TextAndOtherInputs.getLanguage());
		locatorsinnlpAPI.clickOnNerGetentitiesTryButton.click();
		Thread.sleep(2000);
		String myString=locatorsinnlpAPI.getNerGetentitiesResult.getText().toString();
		System.out.println(myString);
		return JsonParser.jsontToTextConverterarray(myString);
		//System.out.println(myassert);				
	}
	
	public String[] getEntitiesWithInputFile() throws InterruptedException, ParseException, IOException{
		
		
		CommonInReference comoninreferece=PageFactory.initElements(driver, CommonInReference.class);
		comoninreferece.commonInReferenceMenuNLP();
		LocatorsInNLPNerAPI locatorsinnlpAPI= PageFactory.initElements(driver,LocatorsInNLPNerAPI.class);
		locatorsinnlpAPI.clickOnNER.click();
		//locatorsinnlpAPI.clickonNergetListOfEntities.click();
		locatorsinnlpAPI.inputNerInputFile.sendKeys(TextAndOtherInputs.fileCheck());
		locatorsinnlpAPI.inputOnNerLanguage.sendKeys(TextAndOtherInputs.getLanguage());
		locatorsinnlpAPI.clickOnNerGetentitiesTryButton.click();
		Thread.sleep(2000);
		String myString=locatorsinnlpAPI.getNerGetentitiesResult.getText().toString();
		System.out.println(myString);
		return JsonParser.jsontToTextConverterarray(myString);
		//System.out.println(myassert);				
	}
	
	public String[] getAnnotationWithInputFile() throws InterruptedException, ParseException, IOException{
		
		
		CommonInReference comoninreferece=PageFactory.initElements(driver, CommonInReference.class);
		comoninreferece.commonInReferenceMenuNLP();
		LocatorsInNLPNerAPI locatorsinnlpAPI= PageFactory.initElements(driver,LocatorsInNLPNerAPI.class);
		locatorsinnlpAPI.clickOnNER.click();
		locatorsinnlpAPI.selectNerAnnotation.click();
		locatorsinnlpAPI.inputNerAnnotationInputFile.sendKeys(TextAndOtherInputs.fileCheck());
		locatorsinnlpAPI.inputNerAnnotationLanguage.sendKeys(TextAndOtherInputs.getLanguage());
		locatorsinnlpAPI.clickNerAnnotationTryButton.click();
		Thread.sleep(2000);
		String myString=locatorsinnlpAPI.getNerAnnotationResult.getText().toString();
		System.out.println(myString);
		return JsonParser.jsontToTextConverterarray(myString);
		//System.out.println(myassert);				
	}
	
	public String[] getAnnotationWithInput() throws InterruptedException, ParseException, IOException{
		
		
		CommonInReference comoninreferece=PageFactory.initElements(driver, CommonInReference.class);
		comoninreferece.commonInReferenceMenuNLP();
		LocatorsInNLPNerAPI locatorsinnlpAPI= PageFactory.initElements(driver,LocatorsInNLPNerAPI.class);
		locatorsinnlpAPI.clickOnNER.click();
		locatorsinnlpAPI.selectNerAnnotation.click();
		locatorsinnlpAPI.inputNerAnnotationInput.sendKeys(TextAndOtherInputs.getNlpinput());
		locatorsinnlpAPI.inputNerAnnotationLanguage.sendKeys(TextAndOtherInputs.getLanguage());
		locatorsinnlpAPI.clickNerAnnotationTryButton.click();
		Thread.sleep(2000);
		String myString=locatorsinnlpAPI.getNerAnnotationResult.getText().toString();
		System.out.println(myString);
		return JsonParser.jsontToTextConverterarray(myString);
		//System.out.println(myassert);				
	}

}
