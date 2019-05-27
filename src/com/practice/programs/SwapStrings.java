package com.practice.programs;

public class SwapStrings {
	
	public static void main(String[] args) {
		
		String a = "hello";
		String b = "world";
		
		System.out.println("Before Swapping ");
		System.out.println("value of a is "+a);
		System.out.println("value of b is " +b);
		
		a= a+b;
		b= a.substring(0, a.length()-b.length());
		a= a.substring(b.length());
		
		System.out.println("After swapping");
		System.out.println("value of a is "+a);
		System.out.println("value of b is " +b);
		
		
		
		
	}
	
	
	

}
