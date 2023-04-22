package com.automationcode_18thMarch_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MoreConcepts_Automation {
	
	@Test(priority=1 )
	public void moreAutomationLocators() {
		
	}
	
	public WebDriver driver;
	public ChromeOptions options;
	
	
	@BeforeMethod
	public void openBrowser(){
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		options.addArguments("--start-maximized");
		//options.addArguments("--incognito");
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");
		
		
	}
	
	
	@Test(priority=3)
	
	public void logInCredentials() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("rd_logout")).click();
	}
	
	@Test
	public void clickOnLogOutLink() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.className("rd_logout")).click();
				
	}
	
	@Test(priority =1)
	public void logOut() {
		
	}
	
	@AfterMethod 
	public void tearDown() {
		driver.quit();
	}

}
