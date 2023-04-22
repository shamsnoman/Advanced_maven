package com.testngcode_08thApr_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterize_Rediff {
	
	
	public WebDriver driver;
	@Test
	@Parameters({"Browser","url","username","password"})
	public void rediffLogin(String browser,String url,String username,String password) {
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();	
		}else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
	
		driver.manage().window().maximize();
		driver .manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		
	}
	 
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
