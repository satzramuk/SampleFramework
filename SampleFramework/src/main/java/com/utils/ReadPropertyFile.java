package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

import com.practise.constants.FrameworkConstant;

public class ReadPropertyFile {

	private ReadPropertyFile() {}


	private static Properties prop = new Properties();


	static {

		try {
			FileInputStream	file = new FileInputStream(FrameworkConstant.getConfigFilePath());
			prop.load(file);
		} 
		catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		catch (IOException e) {

			e.printStackTrace();
		}



	}


	//Lazy Initialization
	public static String getValue(String key) throws Exception {


		String value ="";
        value= prop.getProperty(key);
		if(Objects.isNull(value)) {
			throw new Exception("Property name " + key +" is not found. Please check config.properties");
		}
		return value;


	}

}
