package com.automationcode_2ndApril_2023;

import org.testng.annotations.DataProvider;

public class SeperateDataProvider {
	
	@DataProvider
  
	public static Object[][] getTNData(){

	Object[][] data = {{"seleniumpanda@gmail.com", "Selenium@123"},
	{ "seleniumpanda1@gmail.com", "Selenium@123"},
	{ "seleniumpanda2@gmail.com", "Selenium@123"},
	{ "seleniumpanda845@gmail.com", "Selenium@123" }};

	return data;
	}

	 
	
	@DataProvider 

	public static Object[][] getRediffData(){

	Object[][] data = {{"seleniumpanda@rediffmail.com", "Selenium@123"},
	{ "seleniumpanda1@rediffmail.com", "Selenium@123"},
	{ "seleniumpanda3@rediffmail.com", "Selenium@123"},
	{ "seleniumpanda499@rediffmail.com", "Selenium@123" }};

	return data;
	}
}
