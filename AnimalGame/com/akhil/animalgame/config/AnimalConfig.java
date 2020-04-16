package com.akhil.animalgame.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Akhil
 * 
 *
 */

public class AnimalConfig {
	String result = "";
	InputStream inputStream;
	private static final AnimalConfig instance = new AnimalConfig();

	private AnimalConfig() {

	}

	public static AnimalConfig getInstance() {
		return instance;
	}

	public String getType() {
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";

			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}

			result = prop.getProperty("type");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				System.out.println("CONFIGURATION NOT LOADED");
			}
		}
		//System.out.println(result);
		return result;
	}

}
