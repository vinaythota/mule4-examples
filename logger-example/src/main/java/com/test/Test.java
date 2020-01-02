package com.test;


public class Test {
	
	public static String getDataToLog(String message) throws InterruptedException {
		
		Thread.sleep(10000);
		
		return "Test Message from Java Class: " + message;
	}

}
