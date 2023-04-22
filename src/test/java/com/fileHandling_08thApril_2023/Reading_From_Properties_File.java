package com.fileHandling_08thApril_2023;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Reading_From_Properties_File {

	
public WebDriver driver;

	

	@Test()
	public void TNLogin() throws IOException {
		
		Properties properties = new Properties();
		
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\fileHandling_08thApril_2023\\tutorialsninja.properties");
		FileInputStream	fileInput = new FileInputStream(file);
		properties.load(fileInput);
		
		if(properties.getProperty("Browser").equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(properties.getProperty("url"));
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(properties.getProperty("validUsername"));
		driver.findElement(By.id("input-password")).sendKeys(properties.getProperty("validPassword"));
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		

	}
	
	@Test()
	
	public void rediffLogin() throws IOException {

		Properties properties = new Properties();
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\fileHandling_08thApril_2023\\tutorialsninja.properties");
		FileInputStream	fileInput = new FileInputStream(file);
		properties.load(fileInput);
		
		if(properties.getProperty("Browser").equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		
		
		driver.manage().window().maximize();
		driver .manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(properties.getProperty("url"));
		driver.findElement(By.id("login1")).sendKeys(properties.getProperty("validUsername"));
		driver.findElement(By.id("password")).sendKeys(properties.getProperty("validPassword"));
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
