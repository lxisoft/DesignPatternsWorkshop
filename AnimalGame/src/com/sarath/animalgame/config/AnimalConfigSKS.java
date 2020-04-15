package com.sarath.animalgame.config;
/**
 * @author SarathKumar S
 
 *
 */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AnimalConfigSKS {
	String result = "";
	InputStream inputStream;
	private static final AnimalConfigSKS instance = new AnimalConfigSKS();

	private AnimalConfigSKS() {

	}

	public static AnimalConfigSKS getInstance() {
		return instance;
	}

	public String getType() {
		try {
			Properties prop = new Properties();
//			System.out.print("Configgg");
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