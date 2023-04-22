package learningTestNG;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {
	
	@Test
	public void testCase3Annotation() {
		System.out.println("This is Test Case 3");
		Assert.fail();
		}

	
	@Test
	
	public void testCase1Annotation() {
		System.out.println("This is Test Case 1");
	}
	
	@Test
	
	public void testCase2Annotation() {
		System.out.println("This is Test Case 2");
	}
	
	@BeforeSuite
	
	public void beforeSuiteAnnotation() {
		System.out.println("This is Before Suite");
	}
	
	@BeforeTest
	public void beforeTestAnnotation() {
		System.out.println("This is Before Test");
	}
	
	@BeforeClass
	public void beforeClassAnnotation() {
		System.out.println("This is Before Class");
	}
	
	@BeforeMethod
	public void befoeMethodAnnotation() {
		System.out.println("This is Before Method");
	}
	
	@AfterMethod
	public void afterMethodAnnotation() {
		System.out.println("This is After Method");
	}
	
	@AfterClass
	public void afterClassAnnotation() {
		System.out.println("This is After Class");
	}
	
	@AfterTest
	public void afterTestAnnotation() {
		System.out.println("This is After Test");
	}
	
	@AfterSuite
	public void afterSuiteAnnotation() {
		System.out.println("This is After Suite");
	}
	
	
	
	
	
	
	
	
	
}
