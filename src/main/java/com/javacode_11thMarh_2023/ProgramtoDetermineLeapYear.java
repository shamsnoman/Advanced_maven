package com.javacode_11thMarh_2023;

public class ProgramtoDetermineLeapYear {

	public static void main(String[] args) {
		
		int year = 1980;
		
		if(year%4==0 && year%100 != 0 || year%400 ==0) {
			
				
				System.out.println(year +" is  a leap year");
			
		}else {
			System.out.println(year +" is not a leap year");
		}

	}

}
