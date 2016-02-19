/**
 * 
 */
package com.platform.asserting.attribute;
import java.util.UUID;

import org.apache.commons.lang3.RandomStringUtils;


/**
 * @author pandey
 *
 */
public class CorpusAssertPage {
	
	private static final String name=UUID.randomUUID().toString().replace("-","").substring(10,20);
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
	private static final String assertDeleteSegment="nbDeleted";
	private static final String assertListCorpora="files";
	private static final String assertImportCorpusFirst="corpus";
	private static final String assertImportCorpusSecond="id";
	private static final String listSegmentResponseBody="{\"segments\": ["
			+ "{\"lang\": \"en\",      "
			+ "\"source\": \"Translation example\",  "
			+ "\"id\": \"56c60a4f617bd7d84348b980.56c60a53617bd7d84348b982\","
			+ "\"targets\": [ { \"id\": \"56c60a53617bd7d84348b983\",   "
			+ "\"lang\": \"fr\", \"target\": \"Exemple de traduction\" },"
			+ " {\"id\": \"56c60a53617bd7d84348b984\", \"lang\": \"es\","
			+ " \"target\": \"ejemplo de traducción\"  "
			+ "}]}]}";
	
	private static final String listSegmentSourceText="There is a cat.";
	private static final String assertInDeleteCorpusSegmentTargets="\"deleted\": true";
	private static final String assertInExportCorpusDefault="tmx";
	private static final String assertInExportCorpusBitext="#TM";
	private static final String inputInAddCorpusSegmentTarget="{  \"corpusId\": \"%s\", "
			+ " \"segId\": \"%s\", "
			+ " \"targets\": [{      \"lang\": \"%s\",     "
			+ " \"target\": \"added segment one\"},{\"lang\": \"%s\","
			+ "\"target\": \"added segment two\""
			+ "}]}";
	private static final String assertInAddCorpusSegmentTarget="\"added\": true";
	public static String getAssertinaddcorpussegmenttarget() {
		return assertInAddCorpusSegmentTarget;
	}

	public static String getInputinaddcorpussegmenttarget() {
		return inputInAddCorpusSegmentTarget;
	}

	public static String getAssertinexportcorpusdefault() {
		return assertInExportCorpusDefault;
	}

	public static String getAssertinexportcorpusbitext() {
		return assertInExportCorpusBitext;
	}

	public static String getAssertindeletecorpussegmenttargets() {
		return assertInDeleteCorpusSegmentTargets;
	}

	public static String getListsegmentresponsebody() {
		return listSegmentResponseBody;
	}

	public static String getListsegmentsourcetext() {
		return listSegmentSourceText;
	}

	public static String getAssertimportcorpusfirst() {
		return assertImportCorpusFirst;
	}

	public static String getAssertimportcorpussecond() {
		return assertImportCorpusSecond;
	}

	public static String getAssertlistcorpora() {
		return assertListCorpora;
	}

	public static String getAssertdeletesegment() {
		return assertDeleteSegment;
	}

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
		return String.format(name+"%s", RandomStringUtils.random(10, true, false));
	}

}
