package com.qa.cart.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
	private Properties prop;

	public Properties initializeprop() {
		prop = new Properties();

		FileInputStream fl;
		try {
			fl = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\qa\\cart\\properties\\config.properties");
			prop.load(fl);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prop;
	}
}
