package com.practice.programs;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter any number : ");
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int temp = num;
		
		int a=0 , sum=0;
		
		while(num!=0){
			 a = num%10;
			 sum = sum +(a*a*a);
			 num = num/10;			
		}
		if(temp == sum){
			System.out.println("The entered number is an Armstrong ");
		}
			else{
			System.out.println("The entered number is NOT an Armstrong ");
			
		}
		
	}
	}

