package com.automationcode_19thMarch_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook {

	
	public WebDriver driver;
	public ChromeOptions options;

	@BeforeMethod
	public void openBrowser() {
	options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	options.addArguments("--start-maximized");
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void createAccount() {
		driver.findElement(By.linkText("Create new account")).click();
		
		
	}
	
@Test 
public void AccountDetails() {
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abcd");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("xtg");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("xtg");
	driver.findElement(By.xpath("//input[@name='reg_email_']")).sendKeys("abcd@email");
}
}
