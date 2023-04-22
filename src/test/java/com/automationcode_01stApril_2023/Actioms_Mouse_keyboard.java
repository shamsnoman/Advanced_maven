package com.automationcode_01stApril_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actioms_Mouse_keyboard {
	WebDriver driver;
	
	@Test
	public void mouseActionsTest() {
		driver = new FirefoxDriver();
		//driver.get("https://jqueryui.com/draggable");
		driver.get("https://www.browserstack.com/");
		
		Actions action = new Actions(driver);

		WebElement getADemoButton = driver.findElement(By.xpath("//div[@class = 'relative']/preceding::button[1]"));
		action.moveToElement(getADemoButton).perform();



		WebElement getStartedFreeButton1 = driver.findElement(By.id("signupModalButton"));
		action.moveToElement(getStartedFreeButton1).contextClick().perform();


		WebElement getStartedFreeButton = driver.findElement(By.id("signupModalButton"));
		action.moveToElement(getStartedFreeButton).click().perform();
		
		
		
	}

}
