package com.amazonweb.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationFileReader {

	static Properties prop;
	FileInputStream fis;
	String filepath = System.getProperty("user.dir") + "/src/main/resources/ConfigurationFile/config.properties";

	public static final String BROWSER = "BROWSER";
	public static final String URL = "URL";
	public static final String VERSION = "BROWSER_VERSION";

	public ConfigurationFileReader() {
		try {
			prop = new Properties();
			fis = new FileInputStream(filepath);
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration file not found at location:" + filepath);
		}
	}

	public String getURL() {
		return prop.getProperty(URL);
	}

	public String getBrowser() {
		return prop.getProperty(BROWSER);
	}

	public String getVersion() {
		return prop.getProperty(VERSION);
	}
}
