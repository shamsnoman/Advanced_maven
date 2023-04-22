package com.automationcode_2ndApril_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	public WebDriver driver;

	@Test(priority = 1,dataProvider = "getTNData",enabled = false)
	public void loginNinjaTest(String username, String password) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://tutorialsninja.com/demo");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys(username);
	driver.findElement(By.id("input-password")).sendKeys(password);
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	driver.quit();
	}

	@DataProvider 

	public Object[][] getTNData(){

	Object[][] data = {{"seleniumpanda@gmail.com", "Selenium@123"},
	{ "seleniumpanda1@gmail.com", "Selenium@123"},
	{ "seleniumpanda2@gmail.com", "Selenium@123"},
	{ "seleniumpanda845@gmail.com", "Selenium@123" }};

	return data;
	}
	
	
	@Test(dataProvider="getRediffData")
	public void signinRediffMail(String username,String passwd) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(passwd);
		driver.findElement(By.cssSelector("signinbtn")).click();
		driver.quit();
	}
	
	@DataProvider 

	public Object[][] getRediffData(){

	Object[][] data = {{"seleniumpanda@rediffmail.com", "Selenium@123"},
	{ "seleniumpanda1@rediffmail.com", "Selenium@123"},
	{ "seleniumpanda3@rediffmail.com", "Selenium@123"},
	{ "seleniumpanda499@rediffmail.com", "Selenium@123" }};

	return data;
	}
	
	
	
	
	
}
