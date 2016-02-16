/**
 * 
 */
package com.platform.asserting.attribute;

/**
 * Here we can get the resources that used to assert during the test execution
 * @author pandey
 *
 */
public class ResourcesAssertPage {

	private static final String DictionarySuppLanguage="languages";
	private static final String DictionaryresponseCode="200";
	private static final String dictionaryLookupInput="hello hello hello hi good morning";
	private static final String lookUpSource="en";
	private static final String lookUpTarget="fr";
	private static final String lookUpRespose1="outputs";
	private static final String lookUpRespose2="output";
	private static final String lookUpRespose3="matches";
	private static final String lookUpRespose4="targets";
	private static final String LookUpResponse="LanguagePairs";
	private static final String createDictionary="{\"dictionary\":{ \"sourceLang\":\"en\",\"name\":\"My dict\",\"targetLangs\":\"fr\",\"comments\":\"hehheh\" , \"type\":\"UD\"  }}";
	private static final String addDictionary="id";
	private static final String updateDictionary="{"
			+ "\"dictionary\": {"
			+ "\"sourceLang\": \"en\","
			+ "\"name\": \"My Dictionary\","
			+ "\"targetLangs\":\"fr,es,it\","
			+ "\"comments\": \"My new dictionary enfr\","
			+ "\"type\": \"UD\" "
			+ "}"
			+ "}";
	private static final String updateDictionaryresponsebody="updated";
	private static final String listDictionariesAssert="dictionaries";

	private static final String sortDictInAscendingOrder=  "{ \"sort\": "
			+ "{"
			+ "\"name\": 1,"
			+"\"sourceLang\": 1,"
			+"\"targetLangs\": 1"
			+"}}";
	public static String getSortdictinascendingorder() {
		return sortDictInAscendingOrder;
	}

	public static String getSortdictindescendingorder() {
		return sortDictInDescendingOrder;
	}

	private static final String sortDictInDescendingOrder=  "{ \"sort\": "
			+ "{"
			+ "\"name\": -1,"
			+"\"sourceLang\": 1,"
			+"\"targetLangs\": 1"
			+"}}";





	public static String getListdictionariesassert() {
		return listDictionariesAssert;
	}

	public static String getUpdatedictionaryresponsebody() {
		return updateDictionaryresponsebody;
	}

	public static String getUpdatedictionary() {
		return updateDictionary;
	}

	public static String getCreatedictionary() {
		return createDictionary;
	}

	public static String getAdddictionary() {
		return addDictionary;
	}

	public static String getLookupresponse() {
		return LookUpResponse;
	}

	public static String getDictionarylookupinput() {
		return dictionaryLookupInput;
	}

	public static String getLookuprespose1() {
		return lookUpRespose1;
	}

	public static String getLookuprespose2() {
		return lookUpRespose2;
	}

	public static String getLookuprespose3() {
		return lookUpRespose3;
	}

	public static String getLookuprespose4() {
		return lookUpRespose4;
	}

	public static String getLookupsource() {
		return lookUpSource;
	}

	public static String getLookuptarget() {
		return lookUpTarget;
	}

	public static String getDictionaryresponsecode() {
		return DictionaryresponseCode;
	}

	public static String getDictionarysupplanguage() {
		return DictionarySuppLanguage;
	}



}
