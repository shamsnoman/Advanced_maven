package com.automationcode_25thMarch_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_CssSelector {

	
	public WebDriver driver;
	
	
	@BeforeMethod
	public void openUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		}
	
	@Test
	public void clickOnSignInLink() {
		driver.findElement(By.cssSelector("a[class=signin]")).click();
	}
	
	
	@Test
	public void logInCredentials() {
		driver.findElement(By.cssSelector("a[class=signin]")).click();
		driver.findElement(By.cssSelector("input[id=login1]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input[id=password]")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[class=signinbtn]")).click();
	}
	
	@Test
	public void logOut() {
		driver.findElement(By.cssSelector("a[class=signin]")).click();
		driver.findElement(By.cssSelector("input[id=login1]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input[id=password]")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[class=signinbtn]")).click();
		driver.findElement(By.cssSelector("a.rd_logout")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		//i.fa.fa-user+span
		//
	}
	
	
	
	
	
	
	
}
