package com.practice.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInAnArray {
	
	public static void main(String[] args) {
		
		String names[] = {"java","python","javascript","C","Java"};
		
		
		/*1. compare each element with the next... since there are 2 for loops 
		 * the time complexity will be O(n*n) = Onsquare
		 * 
		 
		
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				
				if(names[i].equals(names[j])){
					System.out.println("Duplicate element is = "+names[i]);
				}
				
			}
			
		}*/
		//2. Using HashSet - property of HashSet - it stores only unique elements.. 
		Set<String> set = new HashSet<String>(); //Set is an interface ; HashSet is a class ..
		
		for(String name : names){
			
/*Logic is : as we are iterating through the names, it will keep adding to the set, so in this case 
"java","python","javascript","C" will be added, next its java's turn, but java is already
 added- hence it will return false and print that :) 
 As set cannot store duplicates... 	*/
			
//Time complexity is O(n).
			
		
			if(set.add(name)==false){
				System.out.println("Duplicate element in the array is = "+name);
			}
			
			
			
		}
		
		//3. Using HashMap... 
		
		Map<String, Integer> map = new HashMap(); 
		
		for(String name : names){
			Integer count = map.get(name);
			if(count == null){
				map.put(name, 1); 
			}else{
				map.put(name,++count);
			}
		}
		Set<Entry <String,Integer>> entrySet = map.entrySet();
		
		for(Entry <String,Integer> entry: entrySet){
			if(entry.getValue()>1){
				System.out.println("duplicate element is = " +entry.getKey());
			}
		}
	}

		
	}

	
	
	
	


