package com.greeshma.animalgame;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigGCG {
	String result = "";
	InputStream inputStream;
	
	public String getValueGCG() {
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			}
			
			result = prop.getProperty("type");
		} catch(Exception e) {
			e.printStackTrace();
		}
			return result;
	}
}
