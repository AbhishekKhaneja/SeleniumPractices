package com.abhishek.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JasonUtil {
	private static ObjectMapper mapper;
	
	static {
		mapper = new ObjectMapper();
	}
	
	public static String ConvertjavaobjtoJason(Object obj)
	{
		String JasonResult="";
		try {
			JasonResult=mapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			System.out.println("Exception occured while converting java object into Jason");
		} catch (JsonMappingException e) {
			System.out.println("Exception occured while converting java object into Jason");
		} catch (IOException e) {
			System.out.println("Exception occured while converting java object into Jason");
		}
		return JasonResult;
	}
	
	public static <T> T ConvertJasontoJavaObject(String JasonString,Class<T> cls) {
	    T result =null;
		try {
			result =mapper.readValue(JasonString, cls);
		} catch (JsonParseException e) {
			System.out.println("Exception occured while converting Jason into Javaobject");
		} catch (JsonMappingException e) {
			System.out.println("Exception occured while converting Jason into Javaobject");
				} catch (IOException e) {
			System.out.println("Exception occured while converting Jason into Javaobject");
		}
		return result;
		
	}

}
