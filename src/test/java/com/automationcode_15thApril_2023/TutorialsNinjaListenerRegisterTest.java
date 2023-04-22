package com.automationcode_15thApril_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialsNinjaListenerRegisterTest {
	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
	}
	
	
	@Test
	public void registerPage() throws Exception {
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Register")).click();	
		Thread.sleep(1000);
		driver.findElement(By.id("input-firstname")).sendKeys("Selenium100");
		Thread.sleep(1000);
		driver.findElement(By.id("input-lastname")).sendKeys("Panda100");
		Thread.sleep(1000);
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda100@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		Thread.sleep(1000);
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		Thread.sleep(1000);
		driver.findElement(By.id("input-confirm")).sendKeys("Selenium@123");
		Thread.sleep(1000);
		driver.findElement(By.name("agree")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
