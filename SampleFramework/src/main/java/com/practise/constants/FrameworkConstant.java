package com.practise.constants;

public class FrameworkConstant {
	
	private FrameworkConstant() {

	}
	
	private static final String RESOURCEPATH = System.getProperty("user.dir")+"/src/test/resources";
	private static final String CHROMEDRIVERPATH = RESOURCEPATH+"/executables/chromedriver1.exe";
	private static final String CONFIGFILEPATH = RESOURCEPATH+"/config/config.properties";
	
	
	

	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}




	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}

	

}
