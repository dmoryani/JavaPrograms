package com.practice.programs;

public class SumOfAllDigits {
	
	public static void sumOfAllDigits(int num){
		
		int copyOfnum = num;
		int sum = 0;
		
		while(copyOfnum!=0){
			
			int lastdigit = copyOfnum%10;
			sum = sum+lastdigit; 
			
			copyOfnum= copyOfnum/10;
		}
		
		System.out.println("Sum of digit is " + num + "is "+ sum);
		
		
	}
	public static void main(String[] args) {
		sumOfAllDigits(250);
		sumOfAllDigits(215);
	}

}
