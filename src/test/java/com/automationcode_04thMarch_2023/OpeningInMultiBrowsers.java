package com.automationcode_04thMarch_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningInMultiBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.quit();
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com");
		driver1.quit();
		
		WebDriver driver2 = new EdgeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.google.com");
		driver2.quit();

	}

}
