package com.automationcode_19thMarch_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IntroductionToXpath {

	public WebDriver driver;
	public ChromeOptions options;
	
	
	@BeforeMethod
	public void openBrowser() {
	options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	options.addArguments("--start-maximized");
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.get("https://www.rediff.com/");
	}
	
	@Test
	public void clickOnSignInLink() {
		//driver.findElement(By.xpath("//a[@class='signin']")).click();
		
		driver.findElement(By.xpath("//a[@class='mailicon']")).click();
//		driver.findElement(By.xpath("//a[@class='moneyicon relative']")).click();
//		driver.findElement(By.xpath("//a[@class='bmailicon relative']")).click();
//		driver.findElement(By.xpath("//a[@class='vdicon']")).click();		
		}
	@Test
	public void enterLogInCredentials() {
		//signin, username,password then click onto sign in
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("//input[@id='login1' and @name='login1']")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
