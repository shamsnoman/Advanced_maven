package com.javacode_01stApril_2023;

public class ClassAssignMent {

	public static void main(String[] args) {
		
		String[][] s1 = {{"1","2","3"},{"4","5","6"},{"7","8","9"}} ;
		
		for(int i =0;i<s1.length;i++) {
			for(int j=0;j<s1[i].length;j++) {
				System.out.print(s1[i][j]+" ");
			}
			System.out.println();
		}
System.out.println("******************************************");
		
		String[][]s2 = new String[2][2];
		 s2[0][0]= "1";
		 s2[0][1]= "2";
		// s2[0][2]= "3";
		 
		 s2[1][0]= "4";
		 s2[1][1]= "5";
		 //s2[1][2]= "6";
		 
			for(int i =0;i<s2.length;i++) {
				for(int j=0;j<s2[i].length;j++) {
					System.out.print(s2[i][j]+" ");
				}
				System.out.println();
			}
		
	}
	
	

}
