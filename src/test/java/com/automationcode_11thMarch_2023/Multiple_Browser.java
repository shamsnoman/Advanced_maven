package com.automationcode_11thMarch_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Browser {
public static WebDriver driver;
	public static void main(String[] args) {
	
		
		String browserName = "chrome";
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://tutorialsninja.com/demo");
			
		}
		else if(browserName.equals("firefox")) {
		    driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://flipkart.com");
		}
		else {
			System.out.println("Nothing opened");
		}

	}
	
}
