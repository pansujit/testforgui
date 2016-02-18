package com.platform.gui.nlp.ner.test;


import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.NLP.Method.NLPNerMethods;
import com.platform.asserting.attribute.AssertAttributesinNLP;
import com.platform.gui.test.baseclass.BaseTestClassExtended;


public class TestNerAnnotationWithInputFile extends BaseTestClassExtended {
	

	
	@Test
	public void nerAnnotationWithInputFile() throws InterruptedException, ParseException, IOException{
		String MyTestArray="";
		NLPNerMethods nlpnermethod=PageFactory.initElements(driver, NLPNerMethods.class);
		MyTestArray=nlpnermethod.getAnnotationWithInputFile();
		String[] mytest=AssertAttributesinNLP.testData;
		
		OuterLoop:
			for(String test: mytest){
				if(MyTestArray.contains(test))
				{
					Assert.assertEquals(true, true);
					break OuterLoop;
				}
				else
				{
					Assert.assertEquals(true, false);
				}
						
			}
		
		}
	
}
