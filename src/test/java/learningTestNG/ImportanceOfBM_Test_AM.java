package learningTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ImportanceOfBM_Test_AM {
	
	@Test
	public void testCase1() {
		System.out.println("this is Test Case1");
	}
	
	@Test
	public void testCase2() {
		System.out.println("this is Test Case2");
	}
	
	@Test
	public void testCase3() {
		System.out.println("this is Test Case3");
	}
	
	@BeforeMethod
	public void beforeMethodAnnotation() {
		System.out.println("This is BM");
	}
	
	@AfterMethod
	public void afterMethodAnnotation() {
		System.out.println("This is AM");
	}

}
