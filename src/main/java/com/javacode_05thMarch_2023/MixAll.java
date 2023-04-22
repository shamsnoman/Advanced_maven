package com.javacode_05thMarch_2023;

public class MixAll {

	public static void main(String[] args) {
		
		int i = 1;
		int j = --i; // i= 0 ; j=0
		int k = i++ - --i + i++;//i = 1, j =0, k=1
		int l = j++ + ++k + --i - i--;// i = -1 , j=1
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		

	}

}
