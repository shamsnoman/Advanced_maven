package com.automationcode_19thMarch_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TN_Register {
	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void openBrowser() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		options.addArguments("--start-maximized");
		
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.get("http://tutorialsninja.com/demo/");
	}
	
	
	@Test (priority=1)
	public void register() {
	
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		//driver.findElement(By.xpath("//a[@title='My Account']")).click();
		
		
		
	  //  driver.findElement(By.linkText("My Account")).click();
//		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("shams");
//		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("noman");
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("shams@gmail.com");
//		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("09987867");
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@name='agree']")).click();
//		driver.findElement(By.xpath("//input[@type='submit']")).click()
		;
	}
	
//	@Test(priority=2, dependsOnMethods= "register")
//	public void loginUsingRegisterDetails() {
//		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
//		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("shams");
//		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("noman");
//	}
//	
//	@AfterMethod
//	public void tearDown() {
//	driver.quit();
//	}
}
