package com.testng.assertion_2ndApril_2023;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void logicTest() {

		if(2!=3) {
			System.out.println(2 +3);
			Assert.assertTrue(false);
			
			Assert.fail();
			
			if(true==true) {
				System.out.println("My logic is true");
			}
		}
	}
}
