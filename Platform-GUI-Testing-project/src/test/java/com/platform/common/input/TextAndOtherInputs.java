package com.platform.common.input;
import java.io.File;

import org.openqa.selenium.WebDriver;

/**
 * 
 */

/**
 * @author sujit
 *
 */
public class TextAndOtherInputs {
	
	WebDriver driver;
	public TextAndOtherInputs (WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
private static final String NLPInput="This is Barrac Obama, a very nice person.";
private static final String Language="en";
public static String getLanguage() {
	return Language;
}
public static String getNlpinput() {
	return NLPInput;
}


public static String fileCheck(){
	
	String fileTranslateFile=null;
	File file= new File("src/test/resources/NLPNerTextFile.txt");
	if(file.exists()){
		fileTranslateFile=file.getAbsolutePath();
		
	}
	
	else
	{
		System.out.println("NO FILE FOUND");
	}
	
	return fileTranslateFile;
}



}
