/**
 * 
 */
package com.platform.asserting.attribute;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * This will decode the json file to normal text file for extracting string.
 * @author sujit
 *
 */
public class JsonParserCorpus {


	public static String jsontToTextConverterarray(String jsonFile) throws IOException, ParseException{

		String typo="";
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonFile);
		JSONArray characters = (JSONArray) jsonObject.get("corpus");
		Iterator<JSONObject> iterator = characters.iterator();
		while (iterator.hasNext()) {
			JSONObject factObj = (JSONObject) iterator.next();
			//typo= (String []) factObj.get("type");
			typo= (String) factObj.get("id");
		}
		System.out.println(typo);
		return typo;
	}


	public static String getCorpusId(String jsonFile) throws IOException, ParseException{
		String typo="";
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonFile.toString());
		JSONObject metrics = (JSONObject)jsonObject.get("corpus");
		typo=(metrics.get("id")).toString();

		return typo;

	}

	/**
	 * This will return the segment id 
	 * @param jsonFile
	 * @throws IOException
	 * @throws ParseException
	 */
	public static String getsegmentId(String jsonFile) throws IOException, ParseException{

		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonFile);
		JSONArray characters = (JSONArray) jsonObject.get("segments");
		return characters.get(0).toString();

	}


	/** This method will return the arrylist of all source id and lang and as well as target id and lang.
	 * @param jsonFile
	 * @return 
	 * @throws IOException
	 * @throws ParseException
	 */
	public static ArrayList<String> getListsegmentId(String jsonFile) throws IOException, ParseException{
		ArrayList<String> segmentIdAndLang =new ArrayList<String>();
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonFile);
		JSONArray getAllValue= (JSONArray) jsonObject.get("segments");
		JSONObject getFirstSegment = (JSONObject)getAllValue.get(0);
		segmentIdAndLang.add(getFirstSegment.get("id").toString());
		segmentIdAndLang.add(getFirstSegment.get("lang").toString());
		JSONArray  targetIdAndLang =  (JSONArray) getFirstSegment.get("targets");
		for (int i=0; i<targetIdAndLang.size();i++){
			JSONObject test= (JSONObject) targetIdAndLang.get(i);
			segmentIdAndLang.add(test.get("id").toString());
			segmentIdAndLang.add(test.get("lang").toString());

		}
		return segmentIdAndLang;

	}




}
