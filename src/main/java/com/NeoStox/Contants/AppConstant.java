package com.NeoStox.Contants;

public final  class AppConstant {
	
	private AppConstant() {}
	
	private static final String ChromePath = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
	
	
	public static String getChromePath() {
		return ChromePath;
	}
	
}
