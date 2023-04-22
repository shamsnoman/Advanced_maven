package com.javacode_15thApril_2023;

public class Method_Overriding_Child extends Method_Overriding {

	public static void main(String[] args) {
		
		Method_Overriding_Child child = new Method_Overriding_Child();
		child.display();
		

	}
	
	public static void display() {
		System.out.println("Child display");
	}

}
