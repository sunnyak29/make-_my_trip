package com.makemytrip.automation.utils;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class PropertiesRead {


	private static Properties prop;

	public PropertiesRead() {
		try {
			Reader file = new FileReader(System.getProperty("user.dir") + "\\config\\config.properties");
			prop = new Properties();
			prop.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public  String readProperty(String key) {
		return prop.getProperty(key);
	}
	
}


