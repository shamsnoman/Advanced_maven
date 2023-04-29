package com.javacode_29thApril_2023;

public class WhyStringAreImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = new String("Apple");
		s.concat("Macbook");
		System.out.println(s);
		
		s= s.concat("Iphone");
		System.out.println(s);

	}

}
