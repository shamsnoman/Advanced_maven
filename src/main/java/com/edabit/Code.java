package com.edabit;

public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		for (int i= 5; i>= 1; i--)  
		{  
		for (int j=5; j>i;j--)  
		{  
		System.out.print(" ");  
		}  
		for (int k=1;k<=i;k++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
		
		
		for(int i = 1; i<=5; i++) {
			for(int j=2*(5-i);j>=0;j--) {
			System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
			System.out.print("* ");
			}
			System.out.println();
			}

		
	}
	
	public static int sumOfTwoNumbers(int x,int y) {
		return x+y;
	}

}
