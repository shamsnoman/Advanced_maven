package com.automationcode_08thApril_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RediffCreateAccountTest {
public WebDriver driver;
Select select;

public SoftAssert softassert = new SoftAssert();


@Test
public void rediffCreateAccount() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.rediff.com/");
	driver.findElement(By.linkText("Create Account")).click();
	
	WebElement fullName = driver.findElement(By.xpath("//input[contains(@name,'name')]"));
	fullName.sendKeys("abcd");
	
	WebElement rediffId = driver.findElement(By.xpath("//input[starts-with(@name,'login')]"));
	rediffId.sendKeys("abcdse5e");
	
	WebElement chckAvailabilityBtn = driver.findElement(By.xpath("//input[starts-with(@name,'btn')]"));
	chckAvailabilityBtn.click();
	
    String actualTxt = driver.findElement(By.xpath("//div[@id='check_availability']")).getText();
    

//    String ExpectedTxt = "Type a new ID or choose from the suggested IDs";
      String expectedTxt = "Yippie! The ID you've chosen is available.";
      softassert.assertEquals(actualTxt, expectedTxt);
//    softassert.assertTrue(actualTxt.contains(expectedTxt));
    
    
    
    
//	System.out.println("****************************************");
//	System.out.println(availabilityTxt);
	
	
	WebElement password = driver.findElement(By.id("newpasswd"));
	password.sendKeys("1234");
	
	WebElement rePassword = driver.findElement(By.id("newpasswd1"));
	rePassword.sendKeys("1234");
	
	WebElement altEmail = driver.findElement(By.xpath("//input[starts-with(@name,'altemail')]"));
	altEmail.sendKeys("alt@email.com");
	
//	WebElement countryCode = driver.findElement(By.xpath("//div[@id='country_id']/following-sibling::div"));
//	Actions actions = new Actions(driver);
//	actions.keyDown(countryCode, Keys.);
	
	WebElement phoneNumber = driver.findElement(By.id("mobno"));
	phoneNumber.sendKeys("12345");
	
	select = new Select(driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Day')]")));
	select.selectByVisibleText("01");
	
	select = new Select(driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Month')]")));
	select.selectByVisibleText("JAN");
	
	Select selectYear = new Select(driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Year')]")));
	selectYear.selectByVisibleText("2010");
	
	
	driver.findElement(By.xpath("//input[starts-with(@name, 'gender')][@value = 'm']")).click();
	
	select = new Select(driver.findElement(By.id("country")));
	select.selectByVisibleText("United States");
	
	driver.findElement(By.className("captcha")).sendKeys("ABCD");
	driver.findElement(By.id("Register")).click();
	
	String actualUnregisteredWarningMessage = driver.findElement(By.className("errbody")).getText();
	String expectedUnregisteredWarninngMessage = "Sorry! We will not be able to register you right now.";
	softassert.assertTrue(actualUnregisteredWarningMessage.contains(expectedUnregisteredWarninngMessage));
	
	
	softassert.assertAll();
	
}
}
