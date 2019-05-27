package com.practice.programs;

import java.util.Arrays;

public class SmallestAndLargest {
	
	
	public static void main(String[] args) {
		
		int num[] = {10,20,30,40,50}; 
		
		int largest = num[0];
		int smallest = num[0];
		
		for (int i = 1; i < num.length; i++) {
			
			if(num[i]>largest){
				largest = num[i];
			}
			else if(num[i]<smallest){
				smallest= num[i];
			}
		}
		System.out.println("Given Array is "+ Arrays.toString(num));
		System.out.println("Largest number in the array is "+largest);
		System.out.println("Smallest number in the array is "+smallest);
	}
	
	
	

}
