package com.platform.gui.nlp.ner.test;


import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.NLP.Method.NLPNerMethods;
import com.platform.asserting.attribute.AssertAttributesinNLP;
import com.platform.gui.test.baseclass.BaseTestClassExtended;


public class TestNerAnnotationWithInput extends BaseTestClassExtended {
	

	
	@Test
	public void nerAnnotationWithInput() throws InterruptedException, ParseException, IOException{
		String MyTestArray="";
		NLPNerMethods nlpnermethod=PageFactory.initElements(driver, NLPNerMethods.class);
		MyTestArray=nlpnermethod.getAnnotationWithInput();
		String[] mytest=AssertAttributesinNLP.testData;
		outerloop:
		for(String testme: mytest){
			if (MyTestArray.contains(testme)){
			Assert.assertEquals(true, true);
			break outerloop;
			}
			else{
				Assert.assertEquals(true, false);
			}
				
		
		}
		
	}		
}
