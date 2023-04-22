package com.fileHandling_08thApril_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Rediff_TN_Login_ExcelSheet {

	
	public WebDriver driver;
	
	@Test(priority = 1,dataProvider = "getRediffData",dataProviderClass = ExcelData.class)
	public void rediffLogin(String username,String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver .manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		
	}
	
	@Test(priority = 2,dataProvider = "getTNData",dataProviderClass = ExcelData.class)
	public void TNLogin(String username,String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		

	}
	
	 
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
