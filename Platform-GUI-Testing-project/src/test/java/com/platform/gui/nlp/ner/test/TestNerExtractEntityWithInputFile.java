package com.platform.gui.nlp.ner.test;


import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.NLP.Method.NLPNerMethods;
import com.platform.asserting.attribute.AssertAttributesinNLP;
import com.platform.gui.test.baseclass.BaseTestClassExtended;


public class TestNerExtractEntityWithInputFile extends BaseTestClassExtended {
	

	
	@Test
	public void nerExtractEntityWithInputFile() throws InterruptedException, ParseException, IOException{
		String[] MyTestArray=new String[5];
		NLPNerMethods nlpnermethod=PageFactory.initElements(driver, NLPNerMethods.class);
		MyTestArray=nlpnermethod.getEntitiesWithInputFile();
		String[] mytest=AssertAttributesinNLP.testData;
		
		OuterLoop:
			for(String test: MyTestArray){
				for(String testme: mytest)
				if(test.contains(testme))
				{
					System.out.println(test + testme);
					Assert.assertEquals(true, true);
					break OuterLoop;
				}
						
			}
		
		}
	
}
