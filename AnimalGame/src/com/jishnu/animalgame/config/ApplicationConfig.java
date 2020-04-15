package com.jishnu.animalgame.config;

import java.util.Properties;
import java.io.*;


/**
 * 
 * @author jishnuj
 *
 * Singleton Pattern
 *
 */

public class ApplicationConfig {


	public String filename = "application.properties"; 

	private InputStream inputStream;
	
	private PlatformType platform;

	private static final ApplicationConfig instance = new ApplicationConfig();

	private ApplicationConfig() {}
	
	public static ApplicationConfig getInstance() {
		return instance;
	}
	
	public void loadConfig() throws IOException {

		try {
			Properties properties = new Properties();
			inputStream = getClass().getClassLoader().getResourceAsStream(filename);
			if (inputStream != null) {
				properties.load(inputStream);
				this.setPlatform(properties);
			} else {
				throw new FileNotFoundException("property file '" + filename + "' not found in the classpath");
			}

		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				System.out.println("Unable to load Configuration File");
			}
		}
	}
	
	public void setPlatform(Properties properties) {
		switch(properties.getProperty("platform")) {
			case "iot": this.platform = PlatformType.IOT;break;
			case "mobile": this.platform = PlatformType.MOBILE;break;
			case "web": this.platform = PlatformType.WEB;break;
		}
	}
	
	public PlatformType getPlatform() {
		return this.platform;
	}

}
