/**
 * 
 */
package com.platform.asserting.attribute;
import java.util.UUID;


/**
 * @author pandey
 *
 */
public class CorpusAssertPage {
	
	private static final String name=(UUID.randomUUID().toString()).substring(0, 10);
	private static final String assertResponseCode="200";
	private static final String SrcLanguage="en";
	private static final String TargetLanguage="fr";
	private static final String assertAddANewCorpus="corpus";
	private static final String assertCorpusExist="true";
	
	public static String getAssertcorpusexist() {
		return assertCorpusExist;
	}

	public static String getAssertresponsecode() {
		return assertResponseCode;
	}

	public static String getAssertaddanewcorpus() {
		return assertAddANewCorpus;
	}

	public static String getSrclanguage() {
		return SrcLanguage;
	}

	public static String getTargetlanguage() {
		return TargetLanguage;
	}



	public static String getName() {
		return name;
	}

}
