package com.automationcode_25thMarch_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelfPractice_Advanced_Xpath {
	
	public WebDriver driver;
		
		
	@BeforeMethod
	public void openUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yandex.com/?");
	}
	
	@Test
	public void test() {
		//parent to child node
		driver.findElement(By.xpath("//span[@class='worldwide__list']/child::a[1]"));
		//Or
		driver.findElement(By.xpath("//span[@class='worldwide__list']//child::a[1]"));
		
		
		//child to parent node
		driver.findElement(By.xpath("//input[@id='text']/parent::span"));
		driver.findElement(By.xpath("//input[@id='text']/parent::*"));
		
		driver.findElement(By.xpath("//input[@id='text']//parent::span"));
		driver.findElement(By.xpath("//input[@id='text']//parent::*"));
		
		//self Axis
		
		//input[@id = 'text']//self::*
		
		
	}

}
