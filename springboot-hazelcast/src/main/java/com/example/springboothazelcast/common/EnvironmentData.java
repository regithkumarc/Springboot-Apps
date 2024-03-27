package com.example.springboothazelcast.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentData {
	
	@Autowired
	private Environment env;
	
	public String getPropertiesValue(String name) {
		String value = env.getProperty(name);
		System.out.println("value env : " + value);
		return  value.isEmpty() ? null : value;
	}
}
