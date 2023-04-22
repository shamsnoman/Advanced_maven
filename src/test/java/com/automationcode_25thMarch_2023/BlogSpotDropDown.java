package com.automationcode_25thMarch_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BlogSpotDropDown {
	
	public WebDriver driver;
	public Select select;
	
	@BeforeMethod
	public void openUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2019/01/dropdown-demo-for-selenium.html");
	}
	
	@Test
	public void dropDowntest() {
		select = new Select(driver.findElement(By.id("tools")));
		select.selectByVisibleText("Cucumber");
		
		select = new Select(driver.findElement(By.id("tools1")));
		select.selectByVisibleText("TestNG");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
