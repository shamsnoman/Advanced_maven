package com.automationcode_01stApril_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Actions_keyboard {
 public WebDriver driver;
 
 
 @Test
 public void keyBoardActionsItems() {
	 driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("http://tutorialsninja.com/demo/");
	 
	 driver.findElement(By.linkText("My Account")).click();
 }
}
