package com.testng.assertion_2ndApril_2023;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_concept {
	
	@Test
	public void logicTest() {
		
		SoftAssert softAssert = new SoftAssert();
		if(2!=3) {
			System.out.println(2+3);
			softAssert.assertTrue(true);
		}
		
		softAssert.fail();
		if(true!=false) {
			System.out.println("My logic is true");
		}
		softAssert.assertAll();
	}

}
