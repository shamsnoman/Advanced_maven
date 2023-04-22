package com.automationcode_25thMarch_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Advanced_Xpath {
	public WebDriver driver;
	@BeforeMethod
	public void openUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
	}
	
	@Test
	public void testXpath() {
		
		// Create Account xpath syntaxes
		
		//Descendant
		//p[@id='signin_info']/descendant::a[2]
		//div[@class= 'logobar']/descendant::a[7]
		//div[@class= 'logobar']/descendant::a[text()='Create Account']
		
	// the instructor advised to use descendant for descendant relationship/direct family {like Grandparent>parent>child relationship}
		//and not to use following/preceding in descendant relationship
		
		//following
		//span[@id= 'username']/following::a[2]
		//span[@id= 'username']/following::a[text()='Create Account']
		
		// following sibling
		//a[@class = 'signin']/following-sibling::a  OR
		//a[@class = 'signin']/following-sibling::a[1]
		
		// following-sibling /child
		//span[@id= 'username']/following-sibling::p/child::a[2]
		
		//a[@class='signin']/following-sibling::a[1]   >> sibling to sibling
		//p[@id='signin_info']/child::a[2]                  >> parent to child
		
		//span[@id='username']/following-sibling::p/child::a[2]
		//span[@id='username']/following::a[2]
		
		
		//writing xpath for Shopping link
		
	}
	
	//below code is for tutorials point 
	/*
	 * 
	 * driver.findElement(By.xpath("//div[@id = 'top-links']/descendant::span[contains(text(), 'My Account')]")).click();
driver.findElement(By.xpath("//div[@id = 'top-links']/descendant::span[contains(text(), 'My Account')]/following::ul[1]/child::li/a[contains(text(), 'Login')]")).click();
driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda@gmail.com");
driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
driver.findElement(By.xpath("//aside[@id = 'column-right']/preceding::input[@class = 'btn btn-primary' ]")).click();
driver.findElement(By.xpath("//aside[@id = 'column-right']/descendant::a[contains(text(), 'Logout')]")).click();
driver.findElement(By.xpath("//div[@id = 'content']/descendant::a[text() = 'Continue']")).click();
	 */

	
	
}
