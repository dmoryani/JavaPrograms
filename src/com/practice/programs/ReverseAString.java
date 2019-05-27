package com.practice.programs;

public class ReverseAString {
	
	//String
	
	/*public static void main(String[] args) {
		
		String s = "Selenium"; 
		
		String rev = ""; 
		int len = s.length(); 
		
		for (int i = len-1; i >=0; i--) {
			
			rev = rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}
	*/
	
//String Buffer
	
	public static void main(String[] args) {
		
		String s = "Selenium"; 
		
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse());
		
		
	
	}

}
