package com.automationcode_18thMarch_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassAssignMent_TutorialsNinja {
	public ChromeOptions options;
	public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		options.addArguments("--start-maximized");
		
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
		driver.get("http://tutorialsninja.com/demo/");
	}
	
	/*
	 * @BeforeMethod - opening tutorialsninja
@Test - Click on My Account
@Test - click on Login
@Test - Login Page
@Test - Logout
@AfterMethod - driver.quit();
	 */
	
@Test(priority=1)
public void clickOnMyAccount() {
	driver.findElement(By.linkText("My Account")).click();	
   //driver.findElement(By.xpath("//*[title='My Account']")).click();
	
	}
	
@Test(priority=2)
public void clickOnLogIn() {
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	
}

@Test(priority=3)
public void LogInCredentials() {
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys("shamsnoman@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("1234");
	driver.findElement(By.xpath("//input[type='submit']")).click();
}

@Test (priority=4)
public void logOut() {
	
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys("shamsnoman@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("1234");
	driver.findElement(By.xpath("//input[type='submit']")).click();
	// then click on logout link
	driver.findElement(By.linkText("Logout")).click();
}

@AfterMethod
public void tearDown() {
	driver.quit();
	
}


}
