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
	private static final String assertDetailCorpus="createdAt";
	private static final String assertStatus="status";
	private static final String assertUpdateCorpus="\"updated\": true";
	private static final String inputInAddCorpusSegment="{\"corpusId\": \"%s\","
			+ " \"segments\":"
			+ " [{ \"lang\": \"en\",\"source\": \"Translation example\","
			+ "\"targets\": ["
			+ "{\"lang\": \"fr\",\"target\": \"Exemple de traduction\"},"
			+ "{\"lang\": \"es\",\"target\": \"ejemplo de traducción\""
			+ " }]}]}";
	private static final String assertInAddCorpusSegment="segments";
	private static final String assertInAddCorpusSegmentComma=",";
	
	


	public static String getAssertinaddcorpussegmentcomma() {
		return assertInAddCorpusSegmentComma;
	}

	public static String getAssertinaddcorpussegment() {
		return assertInAddCorpusSegment;
	}

	public static String getInputinaddcorpussegment() {
		return inputInAddCorpusSegment;
	}

	public static String getAssertupdatecorpus() {
		return assertUpdateCorpus;
	}

	public static String getAssertdetailcorpus() {
		return assertDetailCorpus;
	}

	public static String getAssertstatus() {
		return assertStatus;
	}

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
