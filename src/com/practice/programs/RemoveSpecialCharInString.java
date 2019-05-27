package com.practice.programs;

public class RemoveSpecialCharInString {
	
	public static void main(String[] args) {
		
		String s = "$%^#*()!@# Learn Java";
		
		System.out.println(s.replaceAll("[^0-9A-Za-z]", ""));
		
		
		
	}
	
	
	
	
	

}
