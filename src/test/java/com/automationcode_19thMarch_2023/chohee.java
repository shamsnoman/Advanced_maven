package com.automationcode_19thMarch_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class chohee {
	
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
	

	@Test(priority=1)
	public void registertn(){
	driver.findElement(By.xpath("//a[@title='My Account']")).click();
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Sam");
	driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("NG");
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("samng@gmail.com");
	driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("2012356789");
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("CHGML729");
	driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("CHGML729");
	driver.findElement(By.xpath("//input[@name='agree']")).click();
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@Test(priority=2)
	public void login () {
	driver.findElement(By.xpath("//a[@title='My Account']")).click();
	driver.findElement(By.xpath("//a[text()='Login']")).click();
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("samng@gmail.com");
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("CHGML729");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

}
