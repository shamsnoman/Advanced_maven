package com.automationcode_04thMarch_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub http://tutorialsninja.com/demo/

		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://tutorialsninja.com/demo/");
			driver.quit();
		
	}

}
