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
public class JsonParser {
	
	
	
	public static String jsontToTextConverter(String jsonFile) throws ParseException{
		
		String value="";
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonFile);
		// get a String from the JSON object
		//String resuestidValue = (String) jsonObject.get("requestId");
		//return resuestidValue;
		Set<?> keys = jsonObject.keySet();
		Iterator<?> a = keys.iterator();
		while(a.hasNext()) {
		   	String key = (String)a.next();
		    // loop to get the dynamic key
		   value = (String)jsonObject.get(key);
		     
		    }
		
		
		return value;
	}
	
	public static String[] jsontToTextConverterarray(String jsonFile) throws IOException, ParseException{
		
		String[] typo1 = new String[5];
		String typo="";
		int i=0;
           JSONParser jsonParser = new JSONParser();
    		JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonFile);
            JSONArray characters = (JSONArray) jsonObject.get("entities");
            Iterator<JSONObject> iterator = characters.iterator();
             while (iterator.hasNext()) {
            	JSONObject factObj = (JSONObject) iterator.next();
            	 //typo= (String []) factObj.get("type");
            	typo= (String) factObj.get("type");
            	typo1[i]=typo;
            	i++;
            	 System.out.println(typo);
            	 //String value = (String) factObj.get("value");
            	 
            }
       
            return typo1;
       
	}
		


}
