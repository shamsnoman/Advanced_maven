package com.automationcode_01stApril_2023;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Frame {
	public WebDriver driver;
	
	@Test
	public void handlingFrames() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		
	}

}
