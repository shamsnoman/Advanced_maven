package com.automationcode_04thMarch_2023;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstAutomationCode {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.com");
		
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.rediff.com");
	driver.close();

	}

}
