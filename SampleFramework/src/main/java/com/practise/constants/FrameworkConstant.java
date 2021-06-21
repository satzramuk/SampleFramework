package com.practise.constants;

public class FrameworkConstant {
	
	private FrameworkConstant() {

	}
	
	private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver1.exe";

	public static String getChromedriverpath() {
		return CHROMEDRIVERPATH;
	}

	

}
