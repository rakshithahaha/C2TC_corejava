package edu.atria.oops.polymorphism;

public class OverloadingDemo {

	public static void main(String[] args) {
		System.out.println("Addition of two integers: " +MethodOverloading.addition(18, 20));
		System.out.println("Addition of one integer and one float numbers: " +MethodOverloading.addition(18, 20.3f));
		System.out.println("Addition of one integer and one float numbers: " +MethodOverloading.addition(18.2f, 20));
		System.out.println("Addition of two float numbers: " +MethodOverloading.addition(18.2f, 20.3f));
		System.out.println("Addition of two strings: " +MethodOverloading.addition("Hello ","World"));
		

	}

}
