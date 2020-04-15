package com.mhmdanish.animalgame.config;

import java.io.*;
import java.util.Properties;

public class AnimalTypeConfigMAB {
	String result = "";
	InputStream inputStream;
	
	public String getTypeMAB() throws IOException {
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
			
			result = prop.getProperty("animaltype");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			inputStream.close();
		}
		System.out.println(result);
		return result;
	}
}
