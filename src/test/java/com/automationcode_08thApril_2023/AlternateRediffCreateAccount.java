package com.automationcode_08thApril_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlternateRediffCreateAccount {
	
	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();
	
	@Test(priority =1)
	public void verifyingExistingFullnameAndID() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Create Account")).click();
		
		WebElement fullName = driver.findElement(By.xpath("//input[contains(@name,'name')]"));
		fullName.sendKeys("abcd");
		
		WebElement rediffId = driver.findElement(By.xpath("//input[starts-with(@name,'login')]"));
		rediffId.sendKeys("abcd");
		
		WebElement chckAvailabilityBtn = driver.findElement(By.xpath("//input[starts-with(@name,'btn')]"));
		chckAvailabilityBtn.click();
		
	    String actualTxt = driver.findElement(By.xpath("//div[@id='check_availability']")).getText();
	    System.out.println(actualTxt);
	    String ExpectedTxt = "Type a new ID or choose from the suggested IDs";
	    softassert.assertEquals(actualTxt, ExpectedTxt);
		
		
	}

	
	@Test(priority =1)
	public void selectCountryCode() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Create Account")).click();
		
		WebElement fullName = driver.findElement(By.xpath("//input[contains(@name,'name')]"));
		fullName.sendKeys("abcd");
		
		WebElement rediffId = driver.findElement(By.xpath("//input[starts-with(@name,'login')]"));
		rediffId.sendKeys("abcd");
		
		WebElement chckAvailabilityBtn = driver.findElement(By.xpath("//input[starts-with(@name,'btn')]"));
		chckAvailabilityBtn.click();
		
	    String actualTxt = driver.findElement(By.xpath("//div[@id='check_availability']")).getText();
	    System.out.println(actualTxt);
	    String ExpectedTxt = "Type a new ID or choose from the suggested IDs";
	    softassert.assertEquals(actualTxt, ExpectedTxt);
		
	    Actions actions = new Actions(driver);
	    
	    softassert.assertAll();
		
	}
	
}
