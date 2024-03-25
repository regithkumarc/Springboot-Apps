package com.example.springbootsplunk.common;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Util {
	
	public static String mapJsonToString(Object object) {

		try {

			return new ObjectMapper().writeValueAsString(object);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

}
