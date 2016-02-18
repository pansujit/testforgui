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




}
