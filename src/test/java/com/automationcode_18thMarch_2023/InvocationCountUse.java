package com.automationcode_18thMarch_2023;

import org.testng.annotations.Test;

public class InvocationCountUse {
	
	@Test(priority=1)
	public void sample1() {
		System.out.println("This is Test 1");
	}
	
	@Test(priority=1)
	public void sample2() {
		System.out.println("This is Test 2");
	}
	
	@Test(priority=1,invocationCount=5)
	public void sample3() {
		System.out.println("This is Test 3");
	}
}
