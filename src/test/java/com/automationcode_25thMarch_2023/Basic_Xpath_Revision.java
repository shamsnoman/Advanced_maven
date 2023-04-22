package com.automationcode_25thMarch_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basic_Xpath_Revision {
	

	public WebDriver driver;
	
	
	@BeforeMethod
	public void openUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
	}
	
	@Test
	public void demoTest() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
	}
	
//	@AfterMethod
//	public void tearDown() {
//		
//	}

}
