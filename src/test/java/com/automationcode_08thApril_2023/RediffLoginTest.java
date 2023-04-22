package com.automationcode_08thApril_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RediffLoginTest {

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
	
	@Test
	public void TNLogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("shamsnoman@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		

	}
	 
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
