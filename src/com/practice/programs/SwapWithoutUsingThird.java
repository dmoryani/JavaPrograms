package com.practice.programs;

public class SwapWithoutUsingThird {
	
	public static void main(String[] args) {
		
		int x= 5;
		int y = 6;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Value of x is "+x);
		System.out.println("Value of y is "+y);
		
	}
	
	

}
