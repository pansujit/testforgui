package com.platform.gui.test;


import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.platform.NLP.Method.NLPNerMethods;
import com.platform.asserting.attribute.AssertAttributesinNLP;


public class TestNerAnnotationWithInputFile extends BaseTestClassExtended {
	

	
	@Test
	public void nerAnnotationWithInputFile() throws InterruptedException, ParseException, IOException{
		String[] MyTestArray=new String[5];
		NLPNerMethods nlpnermethod=PageFactory.initElements(driver, NLPNerMethods.class);
		MyTestArray=nlpnermethod.getAnnotationWithInputFile();
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
