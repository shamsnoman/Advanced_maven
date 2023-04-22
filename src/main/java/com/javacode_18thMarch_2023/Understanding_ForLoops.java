package com.javacode_18thMarch_2023;

public class Understanding_ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		for(int i= 1;i<=5; i++) {
//			System.out.println("The value of i is: "+i);
//		}
//		
//		System.out.println("*************************************");
//		
//		for(int i= 1;i<=20; i++) {
//			System.out.println("The value of i is: "+i);
//		}
		
		for(int i= 5;i<=50; i=i+5) {
			System.out.println("The value of i is: "+i);
		}
		
		System.out.println("*************************************");
		

		for(int i= 100;i>=0; i=i-10) {
			System.out.println("The value of i is: "+i);
		}
		
		System.out.println("*************************************");
		// 2,4,6,8,10,12,14,16,18,20
		int sum = 0;
		for(int i = 2; i<=20;i=i+2) {
			sum=sum+i;
		}
		System.out.println("The total is : "+sum);

		
	}

}
