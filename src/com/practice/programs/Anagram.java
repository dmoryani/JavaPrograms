package com.practice.programs;

public class Anagram {
	
	public static void findAnagram(String s1,String s2){
		
		String copyOfs1 = s1.replaceAll("\\s", "");
		String copyOfs2 = s2.replaceAll("\\s", "");
		
		boolean flag = true;
		
		if(copyOfs1.length()!=copyOfs2.length()){
			
			flag = false;
		} else{
			
			char[] ch = copyOfs1.toCharArray();
			
			StringBuilder sb = new StringBuilder(copyOfs2); 
			
			for(char c: ch){
				
				int index= sb.indexOf("" + c);
				
				if(index!=-1){
					sb = sb.deleteCharAt(index);
				}
				
			}
			}
			if(flag){
				System.out.println("Its an anagram ");
			} else{
				System.out.println("Its NOT an anagram ");
			}
			
		}
		
	
	public static void main(String[] args) {
	findAnagram("Mother in law", "Hitler Woman");
	findAnagram("Monday", "Tuesday");
	findAnagram("test", "test");
	}

}
