package com.testngcode_9thApr_2023_Retry_Failed_TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TNRediffTest {

	

	public WebDriver driver;
	@Test
	public void rediffLogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver .manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("abcd");
		driver.findElement(By.id("password")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		
	}
	 
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
