package com.practice.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TestPgms {

	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int temp = num;
		
		int b , sum=0;
		
		while(num> 0){
			
			 b= num%10;
			 sum = sum +(b*b*b);
			num=num/10;
			
			
		}
		if(temp == sum){
			System.out.println("The entered number is an armstrong");
		} else{
			System.out.println("The entered number is NOT an armstrong");
		}
		
	
	}
}
