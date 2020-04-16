package com.sruthy.animalgame.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AnimalTypeConfig {
	
	String result = "";
	InputStream inputStream;
	
	public String getAnimalType() throws IOException {
	
		try {
			
			Properties properties = new Properties();
			String propertiesFileName = "typeconfig.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propertiesFileName);
			
			if (inputStream != null) {
				
				properties.load(inputStream);
			
			} else {
			
				throw new FileNotFoundException();
			}
			
			result = properties.getProperty("animalType");
		
		} catch (Exception e) {
		
			e.printStackTrace();
		
		} finally {
		
			inputStream.close();
		}
		
		return result;
	}

}