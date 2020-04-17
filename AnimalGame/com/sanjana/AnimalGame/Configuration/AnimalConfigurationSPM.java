package com.sanjana.AnimalGame.Configuration;
/**
 * @author sanjana p
 *
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AnimalConfigurationSPM {
	String result = "";
	InputStream inputStream;
	private static final AnimalConfigurationSPM instance = new AnimalConfigurationSPM();

	private AnimalConfigurationSPM() {

	}

	public static AnimalConfigurationSPM getInstance() {
		return instance;
	}

	public String getType() {
		try {
			Properties prop = new Properties();
			String propFileName = "configuration.properties";

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
		return result;
	}

}